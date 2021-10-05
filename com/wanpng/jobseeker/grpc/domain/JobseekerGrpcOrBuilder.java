// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/domain/jobseeker.grpc.proto

package com.wanpng.jobseeker.grpc.domain;

public interface JobseekerGrpcOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protos.domain.JobseekerGrpc)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * &#64;inject_tag: json:"id" gorm:"column:job_seeker_id;primary_key;"
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * &#64;inject_tag: json:"id" gorm:"column:job_seeker_id;primary_key;"
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * &#64;inject_tag: json:"firstName" gorm:"column:first_name;"
   * </pre>
   *
   * <code>string first_name = 2;</code>
   * @return The firstName.
   */
  java.lang.String getFirstName();
  /**
   * <pre>
   * &#64;inject_tag: json:"firstName" gorm:"column:first_name;"
   * </pre>
   *
   * <code>string first_name = 2;</code>
   * @return The bytes for firstName.
   */
  com.google.protobuf.ByteString
      getFirstNameBytes();

  /**
   * <pre>
   * &#64;inject_tag: json:"lastName" gorm:"column:last_name;"
   * </pre>
   *
   * <code>string last_name = 3;</code>
   * @return The lastName.
   */
  java.lang.String getLastName();
  /**
   * <pre>
   * &#64;inject_tag: json:"lastName" gorm:"column:last_name;"
   * </pre>
   *
   * <code>string last_name = 3;</code>
   * @return The bytes for lastName.
   */
  com.google.protobuf.ByteString
      getLastNameBytes();

  /**
   * <pre>
   * &#64;inject_tag: json:"photoUrl" gorm:"column:photo_url;"
   * </pre>
   *
   * <code>string photo_url = 4;</code>
   * @return The photoUrl.
   */
  java.lang.String getPhotoUrl();
  /**
   * <pre>
   * &#64;inject_tag: json:"photoUrl" gorm:"column:photo_url;"
   * </pre>
   *
   * <code>string photo_url = 4;</code>
   * @return The bytes for photoUrl.
   */
  com.google.protobuf.ByteString
      getPhotoUrlBytes();

  /**
   * <pre>
   * &#64;inject_tag: json:"isLandOwner" gorm:"column:is_land_owner;"
   * </pre>
   *
   * <code>bool is_land_owner = 5;</code>
   * @return The isLandOwner.
   */
  boolean getIsLandOwner();

  /**
   * <pre>
   * &#64;inject_tag: json:"careerLevelId" gorm:"column:career_level_id;"
   * </pre>
   *
   * <code>int32 career_level_id = 6;</code>
   * @return The careerLevelId.
   */
  int getCareerLevelId();

  /**
   * <pre>
   * &#64;inject_tag: json:"careerLevel" gorm:"column:career_level;"
   * </pre>
   *
   * <code>string career_level = 7;</code>
   * @return The careerLevel.
   */
  java.lang.String getCareerLevel();
  /**
   * <pre>
   * &#64;inject_tag: json:"careerLevel" gorm:"column:career_level;"
   * </pre>
   *
   * <code>string career_level = 7;</code>
   * @return The bytes for careerLevel.
   */
  com.google.protobuf.ByteString
      getCareerLevelBytes();

  /**
   * <pre>
   * &#64;inject_tag: json:"city" gorm:"column:city;"
   * </pre>
   *
   * <code>string city = 8;</code>
   * @return The city.
   */
  java.lang.String getCity();
  /**
   * <pre>
   * &#64;inject_tag: json:"city" gorm:"column:city;"
   * </pre>
   *
   * <code>string city = 8;</code>
   * @return The bytes for city.
   */
  com.google.protobuf.ByteString
      getCityBytes();

  /**
   * <pre>
   * &#64;inject_tag: json:"provinceId" gorm:"column:province_id;"
   * </pre>
   *
   * <code>int32 province_id = 9;</code>
   * @return The provinceId.
   */
  int getProvinceId();

  /**
   * <pre>
   * &#64;inject_tag: json:"province" gorm:"column:province;"
   * </pre>
   *
   * <code>string province = 10;</code>
   * @return The province.
   */
  java.lang.String getProvince();
  /**
   * <pre>
   * &#64;inject_tag: json:"province" gorm:"column:province;"
   * </pre>
   *
   * <code>string province = 10;</code>
   * @return The bytes for province.
   */
  com.google.protobuf.ByteString
      getProvinceBytes();

  /**
   * <pre>
   * &#64;inject_tag: json:"availabilityId" gorm:"column:availability_id;"
   * </pre>
   *
   * <code>int32 availability_id = 11;</code>
   * @return The availabilityId.
   */
  int getAvailabilityId();

  /**
   * <pre>
   * &#64;inject_tag: json:"availability" gorm:"column:availability;"
   * </pre>
   *
   * <code>string availability = 12;</code>
   * @return The availability.
   */
  java.lang.String getAvailability();
  /**
   * <pre>
   * &#64;inject_tag: json:"availability" gorm:"column:availability;"
   * </pre>
   *
   * <code>string availability = 12;</code>
   * @return The bytes for availability.
   */
  com.google.protobuf.ByteString
      getAvailabilityBytes();

  /**
   * <pre>
   * &#64;inject_tag: json:"jobTitle"
   * </pre>
   *
   * <code>string job_title = 13;</code>
   * @return The jobTitle.
   */
  java.lang.String getJobTitle();
  /**
   * <pre>
   * &#64;inject_tag: json:"jobTitle"
   * </pre>
   *
   * <code>string job_title = 13;</code>
   * @return The bytes for jobTitle.
   */
  com.google.protobuf.ByteString
      getJobTitleBytes();

  /**
   * <pre>
   * &#64;inject_tag: json:"email" gorm:"column:email;"
   * </pre>
   *
   * <code>string email = 14;</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <pre>
   * &#64;inject_tag: json:"email" gorm:"column:email;"
   * </pre>
   *
   * <code>string email = 14;</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();
}