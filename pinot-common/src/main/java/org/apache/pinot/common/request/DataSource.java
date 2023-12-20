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
/**
 * Autogenerated by Thrift Compiler (0.15.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.pinot.common.request;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.15.0)", date = "2023-12-07")
public class DataSource implements org.apache.thrift.TBase<DataSource, DataSource._Fields>, java.io.Serializable, Cloneable, Comparable<DataSource> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DataSource");

  private static final org.apache.thrift.protocol.TField TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("tableName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SUBQUERY_FIELD_DESC = new org.apache.thrift.protocol.TField("subquery", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField JOIN_FIELD_DESC = new org.apache.thrift.protocol.TField("join", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DataSourceStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DataSourceTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.lang.String tableName; // optional
  private @org.apache.thrift.annotation.Nullable PinotQuery subquery; // optional
  private @org.apache.thrift.annotation.Nullable Join join; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TABLE_NAME((short)1, "tableName"),
    SUBQUERY((short)2, "subquery"),
    JOIN((short)3, "join");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TABLE_NAME
          return TABLE_NAME;
        case 2: // SUBQUERY
          return SUBQUERY;
        case 3: // JOIN
          return JOIN;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.TABLE_NAME,_Fields.SUBQUERY,_Fields.JOIN};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("tableName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SUBQUERY, new org.apache.thrift.meta_data.FieldMetaData("subquery", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PinotQuery.class)));
    tmpMap.put(_Fields.JOIN, new org.apache.thrift.meta_data.FieldMetaData("join", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "Join")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DataSource.class, metaDataMap);
  }

  public DataSource() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DataSource(DataSource other) {
    if (other.isSetTableName()) {
      this.tableName = other.tableName;
    }
    if (other.isSetSubquery()) {
      this.subquery = new PinotQuery(other.subquery);
    }
    if (other.isSetJoin()) {
      this.join = new Join(other.join);
    }
  }

  public DataSource deepCopy() {
    return new DataSource(this);
  }

  @Override
  public void clear() {
    this.tableName = null;
    this.subquery = null;
    this.join = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTableName() {
    return this.tableName;
  }

  public void setTableName(@org.apache.thrift.annotation.Nullable java.lang.String tableName) {
    this.tableName = tableName;
  }

  public void unsetTableName() {
    this.tableName = null;
  }

  /** Returns true if field tableName is set (has been assigned a value) and false otherwise */
  public boolean isSetTableName() {
    return this.tableName != null;
  }

  public void setTableNameIsSet(boolean value) {
    if (!value) {
      this.tableName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public PinotQuery getSubquery() {
    return this.subquery;
  }

  public void setSubquery(@org.apache.thrift.annotation.Nullable PinotQuery subquery) {
    this.subquery = subquery;
  }

  public void unsetSubquery() {
    this.subquery = null;
  }

  /** Returns true if field subquery is set (has been assigned a value) and false otherwise */
  public boolean isSetSubquery() {
    return this.subquery != null;
  }

  public void setSubqueryIsSet(boolean value) {
    if (!value) {
      this.subquery = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public Join getJoin() {
    return this.join;
  }

  public void setJoin(@org.apache.thrift.annotation.Nullable Join join) {
    this.join = join;
  }

  public void unsetJoin() {
    this.join = null;
  }

  /** Returns true if field join is set (has been assigned a value) and false otherwise */
  public boolean isSetJoin() {
    return this.join != null;
  }

  public void setJoinIsSet(boolean value) {
    if (!value) {
      this.join = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TABLE_NAME:
      if (value == null) {
        unsetTableName();
      } else {
        setTableName((java.lang.String)value);
      }
      break;

    case SUBQUERY:
      if (value == null) {
        unsetSubquery();
      } else {
        setSubquery((PinotQuery)value);
      }
      break;

    case JOIN:
      if (value == null) {
        unsetJoin();
      } else {
        setJoin((Join)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLE_NAME:
      return getTableName();

    case SUBQUERY:
      return getSubquery();

    case JOIN:
      return getJoin();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TABLE_NAME:
      return isSetTableName();
    case SUBQUERY:
      return isSetSubquery();
    case JOIN:
      return isSetJoin();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof DataSource)
      return this.equals((DataSource)that);
    return false;
  }

  public boolean equals(DataSource that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_tableName = true && this.isSetTableName();
    boolean that_present_tableName = true && that.isSetTableName();
    if (this_present_tableName || that_present_tableName) {
      if (!(this_present_tableName && that_present_tableName))
        return false;
      if (!this.tableName.equals(that.tableName))
        return false;
    }

    boolean this_present_subquery = true && this.isSetSubquery();
    boolean that_present_subquery = true && that.isSetSubquery();
    if (this_present_subquery || that_present_subquery) {
      if (!(this_present_subquery && that_present_subquery))
        return false;
      if (!this.subquery.equals(that.subquery))
        return false;
    }

    boolean this_present_join = true && this.isSetJoin();
    boolean that_present_join = true && that.isSetJoin();
    if (this_present_join || that_present_join) {
      if (!(this_present_join && that_present_join))
        return false;
      if (!this.join.equals(that.join))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTableName()) ? 131071 : 524287);
    if (isSetTableName())
      hashCode = hashCode * 8191 + tableName.hashCode();

    hashCode = hashCode * 8191 + ((isSetSubquery()) ? 131071 : 524287);
    if (isSetSubquery())
      hashCode = hashCode * 8191 + subquery.hashCode();

    hashCode = hashCode * 8191 + ((isSetJoin()) ? 131071 : 524287);
    if (isSetJoin())
      hashCode = hashCode * 8191 + join.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(DataSource other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetTableName(), other.isSetTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tableName, other.tableName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSubquery(), other.isSetSubquery());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSubquery()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.subquery, other.subquery);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetJoin(), other.isSetJoin());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJoin()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.join, other.join);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("DataSource(");
    boolean first = true;

    if (isSetTableName()) {
      sb.append("tableName:");
      if (this.tableName == null) {
        sb.append("null");
      } else {
        sb.append(this.tableName);
      }
      first = false;
    }
    if (isSetSubquery()) {
      if (!first) sb.append(", ");
      sb.append("subquery:");
      if (this.subquery == null) {
        sb.append("null");
      } else {
        sb.append(this.subquery);
      }
      first = false;
    }
    if (isSetJoin()) {
      if (!first) sb.append(", ");
      sb.append("join:");
      if (this.join == null) {
        sb.append("null");
      } else {
        sb.append(this.join);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (subquery != null) {
      subquery.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DataSourceStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DataSourceStandardScheme getScheme() {
      return new DataSourceStandardScheme();
    }
  }

  private static class DataSourceStandardScheme extends org.apache.thrift.scheme.StandardScheme<DataSource> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DataSource struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tableName = iprot.readString();
              struct.setTableNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SUBQUERY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.subquery = new PinotQuery();
              struct.subquery.read(iprot);
              struct.setSubqueryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // JOIN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.join = new Join();
              struct.join.read(iprot);
              struct.setJoinIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, DataSource struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tableName != null) {
        if (struct.isSetTableName()) {
          oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
          oprot.writeString(struct.tableName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.subquery != null) {
        if (struct.isSetSubquery()) {
          oprot.writeFieldBegin(SUBQUERY_FIELD_DESC);
          struct.subquery.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.join != null) {
        if (struct.isSetJoin()) {
          oprot.writeFieldBegin(JOIN_FIELD_DESC);
          struct.join.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DataSourceTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DataSourceTupleScheme getScheme() {
      return new DataSourceTupleScheme();
    }
  }

  private static class DataSourceTupleScheme extends org.apache.thrift.scheme.TupleScheme<DataSource> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DataSource struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTableName()) {
        optionals.set(0);
      }
      if (struct.isSetSubquery()) {
        optionals.set(1);
      }
      if (struct.isSetJoin()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetTableName()) {
        oprot.writeString(struct.tableName);
      }
      if (struct.isSetSubquery()) {
        struct.subquery.write(oprot);
      }
      if (struct.isSetJoin()) {
        struct.join.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DataSource struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.tableName = iprot.readString();
        struct.setTableNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.subquery = new PinotQuery();
        struct.subquery.read(iprot);
        struct.setSubqueryIsSet(true);
      }
      if (incoming.get(2)) {
        struct.join = new Join();
        struct.join.read(iprot);
        struct.setJoinIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

