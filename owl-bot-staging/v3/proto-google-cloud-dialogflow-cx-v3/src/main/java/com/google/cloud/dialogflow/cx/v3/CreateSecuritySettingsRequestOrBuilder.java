// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/security_settings.proto

package com.google.cloud.dialogflow.cx.v3;

public interface CreateSecuritySettingsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The location to create an [SecuritySettings][google.cloud.dialogflow.cx.v3.SecuritySettings] for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The location to create an [SecuritySettings][google.cloud.dialogflow.cx.v3.SecuritySettings] for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The security settings to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.SecuritySettings security_settings = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the securitySettings field is set.
   */
  boolean hasSecuritySettings();
  /**
   * <pre>
   * Required. The security settings to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.SecuritySettings security_settings = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The securitySettings.
   */
  com.google.cloud.dialogflow.cx.v3.SecuritySettings getSecuritySettings();
  /**
   * <pre>
   * Required. The security settings to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.SecuritySettings security_settings = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dialogflow.cx.v3.SecuritySettingsOrBuilder getSecuritySettingsOrBuilder();
}
