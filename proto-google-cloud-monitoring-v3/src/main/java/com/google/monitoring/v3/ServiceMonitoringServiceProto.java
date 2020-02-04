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

public final class ServiceMonitoringServiceProto {
  private ServiceMonitoringServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_CreateServiceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_CreateServiceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_GetServiceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_GetServiceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListServicesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListServicesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListServicesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListServicesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_UpdateServiceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_UpdateServiceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_DeleteServiceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_DeleteServiceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_CreateServiceLevelObjectiveRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_CreateServiceLevelObjectiveRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_GetServiceLevelObjectiveRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_GetServiceLevelObjectiveRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListServiceLevelObjectivesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListServiceLevelObjectivesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListServiceLevelObjectivesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListServiceLevelObjectivesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_UpdateServiceLevelObjectiveRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_UpdateServiceLevelObjectiveRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_DeleteServiceLevelObjectiveRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_DeleteServiceLevelObjectiveRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n*google/monitoring/v3/service_service.p"
          + "roto\022\024google.monitoring.v3\032\034google/api/a"
          + "nnotations.proto\032#google/api/monitored_r"
          + "esource.proto\032\"google/monitoring/v3/serv"
          + "ice.proto\032\033google/protobuf/empty.proto\032 "
          + "google/protobuf/field_mask.proto\032\027google"
          + "/api/client.proto\"j\n\024CreateServiceReques"
          + "t\022\016\n\006parent\030\001 \001(\t\022\022\n\nservice_id\030\003 \001(\t\022.\n"
          + "\007service\030\002 \001(\0132\035.google.monitoring.v3.Se"
          + "rvice\"!\n\021GetServiceRequest\022\014\n\004name\030\001 \001(\t"
          + "\"\\\n\023ListServicesRequest\022\016\n\006parent\030\001 \001(\t\022"
          + "\016\n\006filter\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npa"
          + "ge_token\030\004 \001(\t\"`\n\024ListServicesResponse\022/"
          + "\n\010services\030\001 \003(\0132\035.google.monitoring.v3."
          + "Service\022\027\n\017next_page_token\030\002 \001(\t\"w\n\024Upda"
          + "teServiceRequest\022.\n\007service\030\001 \001(\0132\035.goog"
          + "le.monitoring.v3.Service\022/\n\013update_mask\030"
          + "\002 \001(\0132\032.google.protobuf.FieldMask\"$\n\024Del"
          + "eteServiceRequest\022\014\n\004name\030\001 \001(\t\"\246\001\n\"Crea"
          + "teServiceLevelObjectiveRequest\022\016\n\006parent"
          + "\030\001 \001(\t\022\"\n\032service_level_objective_id\030\003 \001"
          + "(\t\022L\n\027service_level_objective\030\002 \001(\0132+.go"
          + "ogle.monitoring.v3.ServiceLevelObjective"
          + "\"o\n\037GetServiceLevelObjectiveRequest\022\014\n\004n"
          + "ame\030\001 \001(\t\022>\n\004view\030\002 \001(\01620.google.monitor"
          + "ing.v3.ServiceLevelObjective.View\"\252\001\n!Li"
          + "stServiceLevelObjectivesRequest\022\016\n\006paren"
          + "t\030\001 \001(\t\022\016\n\006filter\030\002 \001(\t\022\021\n\tpage_size\030\003 \001"
          + "(\005\022\022\n\npage_token\030\004 \001(\t\022>\n\004view\030\005 \001(\01620.g"
          + "oogle.monitoring.v3.ServiceLevelObjectiv"
          + "e.View\"\214\001\n\"ListServiceLevelObjectivesRes"
          + "ponse\022M\n\030service_level_objectives\030\001 \003(\0132"
          + "+.google.monitoring.v3.ServiceLevelObjec"
          + "tive\022\027\n\017next_page_token\030\002 \001(\t\"\243\001\n\"Update"
          + "ServiceLevelObjectiveRequest\022L\n\027service_"
          + "level_objective\030\001 \001(\0132+.google.monitorin"
          + "g.v3.ServiceLevelObjective\022/\n\013update_mas"
          + "k\030\002 \001(\0132\032.google.protobuf.FieldMask\"2\n\"D"
          + "eleteServiceLevelObjectiveRequest\022\014\n\004nam"
          + "e\030\001 \001(\t2\345\016\n\030ServiceMonitoringService\022\206\001\n"
          + "\rCreateService\022*.google.monitoring.v3.Cr"
          + "eateServiceRequest\032\035.google.monitoring.v"
          + "3.Service\"*\202\323\344\223\002$\"\031/v3/{parent=*/*}/serv"
          + "ices:\007service\022w\n\nGetService\022\'.google.mon"
          + "itoring.v3.GetServiceRequest\032\035.google.mo"
          + "nitoring.v3.Service\"!\202\323\344\223\002\033\022\031/v3/{name=*"
          + "/*/services/*}\022\210\001\n\014ListServices\022).google"
          + ".monitoring.v3.ListServicesRequest\032*.goo"
          + "gle.monitoring.v3.ListServicesResponse\"!"
          + "\202\323\344\223\002\033\022\031/v3/{parent=*/*}/services\022\216\001\n\rUp"
          + "dateService\022*.google.monitoring.v3.Updat"
          + "eServiceRequest\032\035.google.monitoring.v3.S"
          + "ervice\"2\202\323\344\223\002,2!/v3/{service.name=*/*/se"
          + "rvices/*}:\007service\022v\n\rDeleteService\022*.go"
          + "ogle.monitoring.v3.DeleteServiceRequest\032"
          + "\026.google.protobuf.Empty\"!\202\323\344\223\002\033*\031/v3/{na"
          + "me=*/*/services/*}\022\331\001\n\033CreateServiceLeve"
          + "lObjective\0228.google.monitoring.v3.Create"
          + "ServiceLevelObjectiveRequest\032+.google.mo"
          + "nitoring.v3.ServiceLevelObjective\"S\202\323\344\223\002"
          + "M\"2/v3/{parent=*/*/services/*}/serviceLe"
          + "velObjectives:\027service_level_objective\022\272"
          + "\001\n\030GetServiceLevelObjective\0225.google.mon"
          + "itoring.v3.GetServiceLevelObjectiveReque"
          + "st\032+.google.monitoring.v3.ServiceLevelOb"
          + "jective\":\202\323\344\223\0024\0222/v3/{name=*/*/services/"
          + "*/serviceLevelObjectives/*}\022\313\001\n\032ListServ"
          + "iceLevelObjectives\0227.google.monitoring.v"
          + "3.ListServiceLevelObjectivesRequest\0328.go"
          + "ogle.monitoring.v3.ListServiceLevelObjec"
          + "tivesResponse\":\202\323\344\223\0024\0222/v3/{parent=*/*/s"
          + "ervices/*}/serviceLevelObjectives\022\361\001\n\033Up"
          + "dateServiceLevelObjective\0228.google.monit"
          + "oring.v3.UpdateServiceLevelObjectiveRequ"
          + "est\032+.google.monitoring.v3.ServiceLevelO"
          + "bjective\"k\202\323\344\223\002e2J/v3/{service_level_obj"
          + "ective.name=*/*/services/*/serviceLevelO"
          + "bjectives/*}:\027service_level_objective\022\253\001"
          + "\n\033DeleteServiceLevelObjective\0228.google.m"
          + "onitoring.v3.DeleteServiceLevelObjective"
          + "Request\032\026.google.protobuf.Empty\":\202\323\344\223\0024*"
          + "2/v3/{name=*/*/services/*/serviceLevelOb"
          + "jectives/*}\032\251\001\312A\031monitoring.googleapis.c"
          + "om\322A\211\001https://www.googleapis.com/auth/cl"
          + "oud-platform,https://www.googleapis.com/"
          + "auth/monitoring,https://www.googleapis.c"
          + "om/auth/monitoring.readB\265\001\n\030com.google.m"
          + "onitoring.v3B\035ServiceMonitoringServicePr"
          + "otoP\001Z>google.golang.org/genproto/google"
          + "apis/monitoring/v3;monitoring\252\002\032Google.C"
          + "loud.Monitoring.V3\312\002\032Google\\Cloud\\Monito"
          + "ring\\V3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.MonitoredResourceProto.getDescriptor(),
              com.google.monitoring.v3.ServiceMonitoringProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
            });
    internal_static_google_monitoring_v3_CreateServiceRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_v3_CreateServiceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_CreateServiceRequest_descriptor,
            new java.lang.String[] {
              "Parent", "ServiceId", "Service",
            });
    internal_static_google_monitoring_v3_GetServiceRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_v3_GetServiceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_GetServiceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_monitoring_v3_ListServicesRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_monitoring_v3_ListServicesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListServicesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken",
            });
    internal_static_google_monitoring_v3_ListServicesResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_monitoring_v3_ListServicesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListServicesResponse_descriptor,
            new java.lang.String[] {
              "Services", "NextPageToken",
            });
    internal_static_google_monitoring_v3_UpdateServiceRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_monitoring_v3_UpdateServiceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_UpdateServiceRequest_descriptor,
            new java.lang.String[] {
              "Service", "UpdateMask",
            });
    internal_static_google_monitoring_v3_DeleteServiceRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_monitoring_v3_DeleteServiceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_DeleteServiceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_monitoring_v3_CreateServiceLevelObjectiveRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_monitoring_v3_CreateServiceLevelObjectiveRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_CreateServiceLevelObjectiveRequest_descriptor,
            new java.lang.String[] {
              "Parent", "ServiceLevelObjectiveId", "ServiceLevelObjective",
            });
    internal_static_google_monitoring_v3_GetServiceLevelObjectiveRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_monitoring_v3_GetServiceLevelObjectiveRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_GetServiceLevelObjectiveRequest_descriptor,
            new java.lang.String[] {
              "Name", "View",
            });
    internal_static_google_monitoring_v3_ListServiceLevelObjectivesRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_monitoring_v3_ListServiceLevelObjectivesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListServiceLevelObjectivesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken", "View",
            });
    internal_static_google_monitoring_v3_ListServiceLevelObjectivesResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_monitoring_v3_ListServiceLevelObjectivesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListServiceLevelObjectivesResponse_descriptor,
            new java.lang.String[] {
              "ServiceLevelObjectives", "NextPageToken",
            });
    internal_static_google_monitoring_v3_UpdateServiceLevelObjectiveRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_monitoring_v3_UpdateServiceLevelObjectiveRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_UpdateServiceLevelObjectiveRequest_descriptor,
            new java.lang.String[] {
              "ServiceLevelObjective", "UpdateMask",
            });
    internal_static_google_monitoring_v3_DeleteServiceLevelObjectiveRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_monitoring_v3_DeleteServiceLevelObjectiveRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_DeleteServiceLevelObjectiveRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.MonitoredResourceProto.getDescriptor();
    com.google.monitoring.v3.ServiceMonitoringProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}