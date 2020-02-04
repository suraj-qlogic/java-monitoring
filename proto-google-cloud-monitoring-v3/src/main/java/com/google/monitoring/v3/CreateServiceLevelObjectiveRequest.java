/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/service_service.proto

package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * The `CreateServiceLevelObjective` request.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.CreateServiceLevelObjectiveRequest}
 */
public final class CreateServiceLevelObjectiveRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.CreateServiceLevelObjectiveRequest)
    CreateServiceLevelObjectiveRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateServiceLevelObjectiveRequest.newBuilder() to construct.
  private CreateServiceLevelObjectiveRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateServiceLevelObjectiveRequest() {
    parent_ = "";
    serviceLevelObjectiveId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateServiceLevelObjectiveRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateServiceLevelObjectiveRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.monitoring.v3.ServiceLevelObjective.Builder subBuilder = null;
              if (serviceLevelObjective_ != null) {
                subBuilder = serviceLevelObjective_.toBuilder();
              }
              serviceLevelObjective_ =
                  input.readMessage(
                      com.google.monitoring.v3.ServiceLevelObjective.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(serviceLevelObjective_);
                serviceLevelObjective_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              serviceLevelObjectiveId_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.v3.ServiceMonitoringServiceProto
        .internal_static_google_monitoring_v3_CreateServiceLevelObjectiveRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.ServiceMonitoringServiceProto
        .internal_static_google_monitoring_v3_CreateServiceLevelObjectiveRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.CreateServiceLevelObjectiveRequest.class,
            com.google.monitoring.v3.CreateServiceLevelObjectiveRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Resource name of the parent `Service`.
   * Of the form `projects/{project_id}/services/{service_id}`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The parent.
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Resource name of the parent `Service`.
   * Of the form `projects/{project_id}/services/{service_id}`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The bytes for parent.
   */
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVICE_LEVEL_OBJECTIVE_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object serviceLevelObjectiveId_;
  /**
   *
   *
   * <pre>
   * Optional. The ServiceLevelObjective id to use for this
   * ServiceLevelObjective. If omitted, an id will be generated instead. Must
   * match the pattern [a-z0-9&#92;-]+
   * </pre>
   *
   * <code>string service_level_objective_id = 3;</code>
   *
   * @return The serviceLevelObjectiveId.
   */
  public java.lang.String getServiceLevelObjectiveId() {
    java.lang.Object ref = serviceLevelObjectiveId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceLevelObjectiveId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The ServiceLevelObjective id to use for this
   * ServiceLevelObjective. If omitted, an id will be generated instead. Must
   * match the pattern [a-z0-9&#92;-]+
   * </pre>
   *
   * <code>string service_level_objective_id = 3;</code>
   *
   * @return The bytes for serviceLevelObjectiveId.
   */
  public com.google.protobuf.ByteString getServiceLevelObjectiveIdBytes() {
    java.lang.Object ref = serviceLevelObjectiveId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      serviceLevelObjectiveId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVICE_LEVEL_OBJECTIVE_FIELD_NUMBER = 2;
  private com.google.monitoring.v3.ServiceLevelObjective serviceLevelObjective_;
  /**
   *
   *
   * <pre>
   * The `ServiceLevelObjective` to create.
   * The provided `name` will be respected if no `ServiceLevelObjective` exists
   * with this name.
   * </pre>
   *
   * <code>.google.monitoring.v3.ServiceLevelObjective service_level_objective = 2;</code>
   *
   * @return Whether the serviceLevelObjective field is set.
   */
  public boolean hasServiceLevelObjective() {
    return serviceLevelObjective_ != null;
  }
  /**
   *
   *
   * <pre>
   * The `ServiceLevelObjective` to create.
   * The provided `name` will be respected if no `ServiceLevelObjective` exists
   * with this name.
   * </pre>
   *
   * <code>.google.monitoring.v3.ServiceLevelObjective service_level_objective = 2;</code>
   *
   * @return The serviceLevelObjective.
   */
  public com.google.monitoring.v3.ServiceLevelObjective getServiceLevelObjective() {
    return serviceLevelObjective_ == null
        ? com.google.monitoring.v3.ServiceLevelObjective.getDefaultInstance()
        : serviceLevelObjective_;
  }
  /**
   *
   *
   * <pre>
   * The `ServiceLevelObjective` to create.
   * The provided `name` will be respected if no `ServiceLevelObjective` exists
   * with this name.
   * </pre>
   *
   * <code>.google.monitoring.v3.ServiceLevelObjective service_level_objective = 2;</code>
   */
  public com.google.monitoring.v3.ServiceLevelObjectiveOrBuilder
      getServiceLevelObjectiveOrBuilder() {
    return getServiceLevelObjective();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (serviceLevelObjective_ != null) {
      output.writeMessage(2, getServiceLevelObjective());
    }
    if (!getServiceLevelObjectiveIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, serviceLevelObjectiveId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (serviceLevelObjective_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(2, getServiceLevelObjective());
    }
    if (!getServiceLevelObjectiveIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, serviceLevelObjectiveId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.monitoring.v3.CreateServiceLevelObjectiveRequest)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.CreateServiceLevelObjectiveRequest other =
        (com.google.monitoring.v3.CreateServiceLevelObjectiveRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getServiceLevelObjectiveId().equals(other.getServiceLevelObjectiveId())) return false;
    if (hasServiceLevelObjective() != other.hasServiceLevelObjective()) return false;
    if (hasServiceLevelObjective()) {
      if (!getServiceLevelObjective().equals(other.getServiceLevelObjective())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + SERVICE_LEVEL_OBJECTIVE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getServiceLevelObjectiveId().hashCode();
    if (hasServiceLevelObjective()) {
      hash = (37 * hash) + SERVICE_LEVEL_OBJECTIVE_FIELD_NUMBER;
      hash = (53 * hash) + getServiceLevelObjective().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.CreateServiceLevelObjectiveRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.CreateServiceLevelObjectiveRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateServiceLevelObjectiveRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.CreateServiceLevelObjectiveRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateServiceLevelObjectiveRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.CreateServiceLevelObjectiveRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateServiceLevelObjectiveRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.CreateServiceLevelObjectiveRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateServiceLevelObjectiveRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.CreateServiceLevelObjectiveRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateServiceLevelObjectiveRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.CreateServiceLevelObjectiveRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.monitoring.v3.CreateServiceLevelObjectiveRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The `CreateServiceLevelObjective` request.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.CreateServiceLevelObjectiveRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.CreateServiceLevelObjectiveRequest)
      com.google.monitoring.v3.CreateServiceLevelObjectiveRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.v3.ServiceMonitoringServiceProto
          .internal_static_google_monitoring_v3_CreateServiceLevelObjectiveRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.ServiceMonitoringServiceProto
          .internal_static_google_monitoring_v3_CreateServiceLevelObjectiveRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.CreateServiceLevelObjectiveRequest.class,
              com.google.monitoring.v3.CreateServiceLevelObjectiveRequest.Builder.class);
    }

    // Construct using com.google.monitoring.v3.CreateServiceLevelObjectiveRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      serviceLevelObjectiveId_ = "";

      if (serviceLevelObjectiveBuilder_ == null) {
        serviceLevelObjective_ = null;
      } else {
        serviceLevelObjective_ = null;
        serviceLevelObjectiveBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.v3.ServiceMonitoringServiceProto
          .internal_static_google_monitoring_v3_CreateServiceLevelObjectiveRequest_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.CreateServiceLevelObjectiveRequest getDefaultInstanceForType() {
      return com.google.monitoring.v3.CreateServiceLevelObjectiveRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.CreateServiceLevelObjectiveRequest build() {
      com.google.monitoring.v3.CreateServiceLevelObjectiveRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.CreateServiceLevelObjectiveRequest buildPartial() {
      com.google.monitoring.v3.CreateServiceLevelObjectiveRequest result =
          new com.google.monitoring.v3.CreateServiceLevelObjectiveRequest(this);
      result.parent_ = parent_;
      result.serviceLevelObjectiveId_ = serviceLevelObjectiveId_;
      if (serviceLevelObjectiveBuilder_ == null) {
        result.serviceLevelObjective_ = serviceLevelObjective_;
      } else {
        result.serviceLevelObjective_ = serviceLevelObjectiveBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.monitoring.v3.CreateServiceLevelObjectiveRequest) {
        return mergeFrom((com.google.monitoring.v3.CreateServiceLevelObjectiveRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.CreateServiceLevelObjectiveRequest other) {
      if (other == com.google.monitoring.v3.CreateServiceLevelObjectiveRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getServiceLevelObjectiveId().isEmpty()) {
        serviceLevelObjectiveId_ = other.serviceLevelObjectiveId_;
        onChanged();
      }
      if (other.hasServiceLevelObjective()) {
        mergeServiceLevelObjective(other.getServiceLevelObjective());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.monitoring.v3.CreateServiceLevelObjectiveRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.monitoring.v3.CreateServiceLevelObjectiveRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Resource name of the parent `Service`.
     * Of the form `projects/{project_id}/services/{service_id}`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Resource name of the parent `Service`.
     * Of the form `projects/{project_id}/services/{service_id}`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Resource name of the parent `Service`.
     * Of the form `projects/{project_id}/services/{service_id}`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource name of the parent `Service`.
     * Of the form `projects/{project_id}/services/{service_id}`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource name of the parent `Service`.
     * Of the form `projects/{project_id}/services/{service_id}`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object serviceLevelObjectiveId_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The ServiceLevelObjective id to use for this
     * ServiceLevelObjective. If omitted, an id will be generated instead. Must
     * match the pattern [a-z0-9&#92;-]+
     * </pre>
     *
     * <code>string service_level_objective_id = 3;</code>
     *
     * @return The serviceLevelObjectiveId.
     */
    public java.lang.String getServiceLevelObjectiveId() {
      java.lang.Object ref = serviceLevelObjectiveId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceLevelObjectiveId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The ServiceLevelObjective id to use for this
     * ServiceLevelObjective. If omitted, an id will be generated instead. Must
     * match the pattern [a-z0-9&#92;-]+
     * </pre>
     *
     * <code>string service_level_objective_id = 3;</code>
     *
     * @return The bytes for serviceLevelObjectiveId.
     */
    public com.google.protobuf.ByteString getServiceLevelObjectiveIdBytes() {
      java.lang.Object ref = serviceLevelObjectiveId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        serviceLevelObjectiveId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The ServiceLevelObjective id to use for this
     * ServiceLevelObjective. If omitted, an id will be generated instead. Must
     * match the pattern [a-z0-9&#92;-]+
     * </pre>
     *
     * <code>string service_level_objective_id = 3;</code>
     *
     * @param value The serviceLevelObjectiveId to set.
     * @return This builder for chaining.
     */
    public Builder setServiceLevelObjectiveId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      serviceLevelObjectiveId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The ServiceLevelObjective id to use for this
     * ServiceLevelObjective. If omitted, an id will be generated instead. Must
     * match the pattern [a-z0-9&#92;-]+
     * </pre>
     *
     * <code>string service_level_objective_id = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearServiceLevelObjectiveId() {

      serviceLevelObjectiveId_ = getDefaultInstance().getServiceLevelObjectiveId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The ServiceLevelObjective id to use for this
     * ServiceLevelObjective. If omitted, an id will be generated instead. Must
     * match the pattern [a-z0-9&#92;-]+
     * </pre>
     *
     * <code>string service_level_objective_id = 3;</code>
     *
     * @param value The bytes for serviceLevelObjectiveId to set.
     * @return This builder for chaining.
     */
    public Builder setServiceLevelObjectiveIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      serviceLevelObjectiveId_ = value;
      onChanged();
      return this;
    }

    private com.google.monitoring.v3.ServiceLevelObjective serviceLevelObjective_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.v3.ServiceLevelObjective,
            com.google.monitoring.v3.ServiceLevelObjective.Builder,
            com.google.monitoring.v3.ServiceLevelObjectiveOrBuilder>
        serviceLevelObjectiveBuilder_;
    /**
     *
     *
     * <pre>
     * The `ServiceLevelObjective` to create.
     * The provided `name` will be respected if no `ServiceLevelObjective` exists
     * with this name.
     * </pre>
     *
     * <code>.google.monitoring.v3.ServiceLevelObjective service_level_objective = 2;</code>
     *
     * @return Whether the serviceLevelObjective field is set.
     */
    public boolean hasServiceLevelObjective() {
      return serviceLevelObjectiveBuilder_ != null || serviceLevelObjective_ != null;
    }
    /**
     *
     *
     * <pre>
     * The `ServiceLevelObjective` to create.
     * The provided `name` will be respected if no `ServiceLevelObjective` exists
     * with this name.
     * </pre>
     *
     * <code>.google.monitoring.v3.ServiceLevelObjective service_level_objective = 2;</code>
     *
     * @return The serviceLevelObjective.
     */
    public com.google.monitoring.v3.ServiceLevelObjective getServiceLevelObjective() {
      if (serviceLevelObjectiveBuilder_ == null) {
        return serviceLevelObjective_ == null
            ? com.google.monitoring.v3.ServiceLevelObjective.getDefaultInstance()
            : serviceLevelObjective_;
      } else {
        return serviceLevelObjectiveBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The `ServiceLevelObjective` to create.
     * The provided `name` will be respected if no `ServiceLevelObjective` exists
     * with this name.
     * </pre>
     *
     * <code>.google.monitoring.v3.ServiceLevelObjective service_level_objective = 2;</code>
     */
    public Builder setServiceLevelObjective(com.google.monitoring.v3.ServiceLevelObjective value) {
      if (serviceLevelObjectiveBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        serviceLevelObjective_ = value;
        onChanged();
      } else {
        serviceLevelObjectiveBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The `ServiceLevelObjective` to create.
     * The provided `name` will be respected if no `ServiceLevelObjective` exists
     * with this name.
     * </pre>
     *
     * <code>.google.monitoring.v3.ServiceLevelObjective service_level_objective = 2;</code>
     */
    public Builder setServiceLevelObjective(
        com.google.monitoring.v3.ServiceLevelObjective.Builder builderForValue) {
      if (serviceLevelObjectiveBuilder_ == null) {
        serviceLevelObjective_ = builderForValue.build();
        onChanged();
      } else {
        serviceLevelObjectiveBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The `ServiceLevelObjective` to create.
     * The provided `name` will be respected if no `ServiceLevelObjective` exists
     * with this name.
     * </pre>
     *
     * <code>.google.monitoring.v3.ServiceLevelObjective service_level_objective = 2;</code>
     */
    public Builder mergeServiceLevelObjective(
        com.google.monitoring.v3.ServiceLevelObjective value) {
      if (serviceLevelObjectiveBuilder_ == null) {
        if (serviceLevelObjective_ != null) {
          serviceLevelObjective_ =
              com.google.monitoring.v3.ServiceLevelObjective.newBuilder(serviceLevelObjective_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          serviceLevelObjective_ = value;
        }
        onChanged();
      } else {
        serviceLevelObjectiveBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The `ServiceLevelObjective` to create.
     * The provided `name` will be respected if no `ServiceLevelObjective` exists
     * with this name.
     * </pre>
     *
     * <code>.google.monitoring.v3.ServiceLevelObjective service_level_objective = 2;</code>
     */
    public Builder clearServiceLevelObjective() {
      if (serviceLevelObjectiveBuilder_ == null) {
        serviceLevelObjective_ = null;
        onChanged();
      } else {
        serviceLevelObjective_ = null;
        serviceLevelObjectiveBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The `ServiceLevelObjective` to create.
     * The provided `name` will be respected if no `ServiceLevelObjective` exists
     * with this name.
     * </pre>
     *
     * <code>.google.monitoring.v3.ServiceLevelObjective service_level_objective = 2;</code>
     */
    public com.google.monitoring.v3.ServiceLevelObjective.Builder
        getServiceLevelObjectiveBuilder() {

      onChanged();
      return getServiceLevelObjectiveFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The `ServiceLevelObjective` to create.
     * The provided `name` will be respected if no `ServiceLevelObjective` exists
     * with this name.
     * </pre>
     *
     * <code>.google.monitoring.v3.ServiceLevelObjective service_level_objective = 2;</code>
     */
    public com.google.monitoring.v3.ServiceLevelObjectiveOrBuilder
        getServiceLevelObjectiveOrBuilder() {
      if (serviceLevelObjectiveBuilder_ != null) {
        return serviceLevelObjectiveBuilder_.getMessageOrBuilder();
      } else {
        return serviceLevelObjective_ == null
            ? com.google.monitoring.v3.ServiceLevelObjective.getDefaultInstance()
            : serviceLevelObjective_;
      }
    }
    /**
     *
     *
     * <pre>
     * The `ServiceLevelObjective` to create.
     * The provided `name` will be respected if no `ServiceLevelObjective` exists
     * with this name.
     * </pre>
     *
     * <code>.google.monitoring.v3.ServiceLevelObjective service_level_objective = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.v3.ServiceLevelObjective,
            com.google.monitoring.v3.ServiceLevelObjective.Builder,
            com.google.monitoring.v3.ServiceLevelObjectiveOrBuilder>
        getServiceLevelObjectiveFieldBuilder() {
      if (serviceLevelObjectiveBuilder_ == null) {
        serviceLevelObjectiveBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.monitoring.v3.ServiceLevelObjective,
                com.google.monitoring.v3.ServiceLevelObjective.Builder,
                com.google.monitoring.v3.ServiceLevelObjectiveOrBuilder>(
                getServiceLevelObjective(), getParentForChildren(), isClean());
        serviceLevelObjective_ = null;
      }
      return serviceLevelObjectiveBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.CreateServiceLevelObjectiveRequest)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.CreateServiceLevelObjectiveRequest)
  private static final com.google.monitoring.v3.CreateServiceLevelObjectiveRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.CreateServiceLevelObjectiveRequest();
  }

  public static com.google.monitoring.v3.CreateServiceLevelObjectiveRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateServiceLevelObjectiveRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateServiceLevelObjectiveRequest>() {
        @java.lang.Override
        public CreateServiceLevelObjectiveRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateServiceLevelObjectiveRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateServiceLevelObjectiveRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateServiceLevelObjectiveRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.CreateServiceLevelObjectiveRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}