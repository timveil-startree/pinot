/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.pinot.core.query.aggregation.function.array;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import org.apache.pinot.common.request.context.ExpressionContext;
import org.apache.pinot.core.common.BlockValSet;
import org.apache.pinot.core.query.aggregation.AggregationResultHolder;
import org.apache.pinot.core.query.aggregation.groupby.GroupByResultHolder;
import org.apache.pinot.spi.data.FieldSpec;
import org.roaringbitmap.RoaringBitmap;


public class ArrayAggIntFunction extends BaseArrayAggIntFunction<IntArrayList> {
  public ArrayAggIntFunction(ExpressionContext expression, FieldSpec.DataType dataType, boolean nullHandlingEnabled) {
    super(expression, dataType, nullHandlingEnabled);
  }

  @Override
  protected void aggregateArray(int length, AggregationResultHolder aggregationResultHolder,
      BlockValSet blockValSet) {
    int[] value = blockValSet.getIntValuesSV();
    IntArrayList valueArray = new IntArrayList(length);
    for (int i = 0; i < length; i++) {
      valueArray.add(value[i]);
    }
    aggregationResultHolder.setValue(valueArray);
  }

  @Override
  protected void aggregateArrayWithNull(int length, AggregationResultHolder aggregationResultHolder,
      BlockValSet blockValSet, RoaringBitmap nullBitmap) {
    int[] value = blockValSet.getIntValuesSV();
    IntArrayList valueArray = new IntArrayList(length);
    for (int i = 0; i < length; i++) {
      if (!nullBitmap.contains(i)) {
        valueArray.add(value[i]);
      }
    }
    aggregationResultHolder.setValue(valueArray);
  }

  protected void setGroupByResult(GroupByResultHolder groupByResultHolder, int groupKey, int value) {
    IntArrayList groupValue = groupByResultHolder.getResult(groupKey);
    if (groupValue == null) {
      groupByResultHolder.setValueForKey(groupKey, new IntArrayList(value));
    } else {
      groupValue.add(value);
    }
  }
}
