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
// source: google/cloud/dialogflow/cx/v3beta1/validation_message.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public final class ValidationMessageProto {
  private ValidationMessageProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ValidationMessage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ValidationMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResourceName_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResourceName_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n;google/cloud/dialogflow/cx/v3beta1/val"
          + "idation_message.proto\022\"google.cloud.dial"
          + "ogflow.cx.v3beta1\032\034google/api/annotation"
          + "s.proto\032\034google/protobuf/struct.proto\"\207\005"
          + "\n\021ValidationMessage\022Y\n\rresource_type\030\001 \001"
          + "(\0162B.google.cloud.dialogflow.cx.v3beta1."
          + "ValidationMessage.ResourceType\022\025\n\tresour"
          + "ces\030\002 \003(\tB\002\030\001\022H\n\016resource_names\030\006 \003(\01320."
          + "google.cloud.dialogflow.cx.v3beta1.Resou"
          + "rceName\022P\n\010severity\030\003 \001(\0162>.google.cloud"
          + ".dialogflow.cx.v3beta1.ValidationMessage"
          + ".Severity\022\016\n\006detail\030\004 \001(\t\"\213\002\n\014ResourceTy"
          + "pe\022\035\n\031RESOURCE_TYPE_UNSPECIFIED\020\000\022\t\n\005AGE"
          + "NT\020\001\022\n\n\006INTENT\020\002\022\032\n\026INTENT_TRAINING_PHRA"
          + "SE\020\010\022\024\n\020INTENT_PARAMETER\020\t\022\013\n\007INTENTS\020\n\022"
          + "\033\n\027INTENT_TRAINING_PHRASES\020\013\022\017\n\013ENTITY_T"
          + "YPE\020\003\022\020\n\014ENTITY_TYPES\020\014\022\013\n\007WEBHOOK\020\004\022\010\n\004"
          + "FLOW\020\005\022\010\n\004PAGE\020\006\022\t\n\005PAGES\020\r\022\032\n\026TRANSITIO"
          + "N_ROUTE_GROUP\020\007\"F\n\010Severity\022\030\n\024SEVERITY_"
          + "UNSPECIFIED\020\000\022\010\n\004INFO\020\001\022\013\n\007WARNING\020\002\022\t\n\005"
          + "ERROR\020\003\"2\n\014ResourceName\022\014\n\004name\030\001 \001(\t\022\024\n"
          + "\014display_name\030\002 \001(\tB\336\001\n&com.google.cloud"
          + ".dialogflow.cx.v3beta1B\026ValidationMessag"
          + "eProtoP\001ZDgoogle.golang.org/genproto/goo"
          + "gleapis/cloud/dialogflow/cx/v3beta1;cx\370\001"
          + "\001\242\002\002DF\252\002\"Google.Cloud.Dialogflow.Cx.V3Be"
          + "ta1\352\002&Google::Cloud::Dialogflow::CX::V3b"
          + "eta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ValidationMessage_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ValidationMessage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ValidationMessage_descriptor,
            new java.lang.String[] {
              "ResourceType", "Resources", "ResourceNames", "Severity", "Detail",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResourceName_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResourceName_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ResourceName_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName",
            });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
