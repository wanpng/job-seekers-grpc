// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.0
// 	protoc        v3.19.4
// source: protos/domain/jobseeker.grpc.proto

package domain

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type JobseekerGrpc struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// @inject_tag: json:"id" gorm:"column:job_seeker_id;primary_key;"
	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	// @inject_tag: json:"firstName" gorm:"column:first_name;"
	FirstName string `protobuf:"bytes,2,opt,name=first_name,json=firstName,proto3" json:"first_name,omitempty"`
	// @inject_tag: json:"lastName" gorm:"column:last_name;"
	LastName string `protobuf:"bytes,3,opt,name=last_name,json=lastName,proto3" json:"last_name,omitempty"`
	// @inject_tag: json:"photoUrl" gorm:"column:photo_url;"
	PhotoUrl string `protobuf:"bytes,4,opt,name=photo_url,json=photoUrl,proto3" json:"photo_url,omitempty"`
	// @inject_tag: json:"isLandOwner" gorm:"column:is_land_owner;"
	IsLandOwner bool `protobuf:"varint,5,opt,name=is_land_owner,json=isLandOwner,proto3" json:"is_land_owner,omitempty"`
	// @inject_tag: json:"careerLevelId" gorm:"column:career_level_id;"
	CareerLevelId int32 `protobuf:"varint,6,opt,name=career_level_id,json=careerLevelId,proto3" json:"career_level_id,omitempty"`
	// @inject_tag: json:"careerLevel" gorm:"column:career_level;"
	CareerLevel string `protobuf:"bytes,7,opt,name=career_level,json=careerLevel,proto3" json:"career_level,omitempty"`
	// @inject_tag: json:"city" gorm:"column:city;"
	City string `protobuf:"bytes,8,opt,name=city,proto3" json:"city,omitempty"`
	// @inject_tag: json:"provinceId" gorm:"column:province_id;"
	ProvinceId int32 `protobuf:"varint,9,opt,name=province_id,json=provinceId,proto3" json:"province_id,omitempty"`
	// @inject_tag: json:"province" gorm:"column:province;"
	Province string `protobuf:"bytes,10,opt,name=province,proto3" json:"province,omitempty"`
	// @inject_tag: json:"availabilityId" gorm:"column:availability_id;"
	AvailabilityId int32 `protobuf:"varint,11,opt,name=availability_id,json=availabilityId,proto3" json:"availability_id,omitempty"`
	// @inject_tag: json:"availability" gorm:"column:availability;"
	Availability string `protobuf:"bytes,12,opt,name=availability,proto3" json:"availability,omitempty"`
	// @inject_tag: json:"jobTitle"
	JobTitle string `protobuf:"bytes,13,opt,name=job_title,json=jobTitle,proto3" json:"job_title,omitempty"`
	// @inject_tag: json:"email" gorm:"column:email;"
	Email string `protobuf:"bytes,14,opt,name=email,proto3" json:"email,omitempty"`
}

func (x *JobseekerGrpc) Reset() {
	*x = JobseekerGrpc{}
	if protoimpl.UnsafeEnabled {
		mi := &file_protos_domain_jobseeker_grpc_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *JobseekerGrpc) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*JobseekerGrpc) ProtoMessage() {}

func (x *JobseekerGrpc) ProtoReflect() protoreflect.Message {
	mi := &file_protos_domain_jobseeker_grpc_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use JobseekerGrpc.ProtoReflect.Descriptor instead.
func (*JobseekerGrpc) Descriptor() ([]byte, []int) {
	return file_protos_domain_jobseeker_grpc_proto_rawDescGZIP(), []int{0}
}

func (x *JobseekerGrpc) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *JobseekerGrpc) GetFirstName() string {
	if x != nil {
		return x.FirstName
	}
	return ""
}

func (x *JobseekerGrpc) GetLastName() string {
	if x != nil {
		return x.LastName
	}
	return ""
}

func (x *JobseekerGrpc) GetPhotoUrl() string {
	if x != nil {
		return x.PhotoUrl
	}
	return ""
}

func (x *JobseekerGrpc) GetIsLandOwner() bool {
	if x != nil {
		return x.IsLandOwner
	}
	return false
}

func (x *JobseekerGrpc) GetCareerLevelId() int32 {
	if x != nil {
		return x.CareerLevelId
	}
	return 0
}

func (x *JobseekerGrpc) GetCareerLevel() string {
	if x != nil {
		return x.CareerLevel
	}
	return ""
}

func (x *JobseekerGrpc) GetCity() string {
	if x != nil {
		return x.City
	}
	return ""
}

func (x *JobseekerGrpc) GetProvinceId() int32 {
	if x != nil {
		return x.ProvinceId
	}
	return 0
}

func (x *JobseekerGrpc) GetProvince() string {
	if x != nil {
		return x.Province
	}
	return ""
}

func (x *JobseekerGrpc) GetAvailabilityId() int32 {
	if x != nil {
		return x.AvailabilityId
	}
	return 0
}

func (x *JobseekerGrpc) GetAvailability() string {
	if x != nil {
		return x.Availability
	}
	return ""
}

func (x *JobseekerGrpc) GetJobTitle() string {
	if x != nil {
		return x.JobTitle
	}
	return ""
}

func (x *JobseekerGrpc) GetEmail() string {
	if x != nil {
		return x.Email
	}
	return ""
}

var File_protos_domain_jobseeker_grpc_proto protoreflect.FileDescriptor

var file_protos_domain_jobseeker_grpc_proto_rawDesc = []byte{
	0x0a, 0x22, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2f, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x2f,
	0x6a, 0x6f, 0x62, 0x73, 0x65, 0x65, 0x6b, 0x65, 0x72, 0x2e, 0x67, 0x72, 0x70, 0x63, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2e, 0x64, 0x6f, 0x6d,
	0x61, 0x69, 0x6e, 0x22, 0xb8, 0x03, 0x0a, 0x0d, 0x4a, 0x6f, 0x62, 0x73, 0x65, 0x65, 0x6b, 0x65,
	0x72, 0x47, 0x72, 0x70, 0x63, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x02, 0x69, 0x64, 0x12, 0x1d, 0x0a, 0x0a, 0x66, 0x69, 0x72, 0x73, 0x74, 0x5f, 0x6e,
	0x61, 0x6d, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x66, 0x69, 0x72, 0x73, 0x74,
	0x4e, 0x61, 0x6d, 0x65, 0x12, 0x1b, 0x0a, 0x09, 0x6c, 0x61, 0x73, 0x74, 0x5f, 0x6e, 0x61, 0x6d,
	0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x6c, 0x61, 0x73, 0x74, 0x4e, 0x61, 0x6d,
	0x65, 0x12, 0x1b, 0x0a, 0x09, 0x70, 0x68, 0x6f, 0x74, 0x6f, 0x5f, 0x75, 0x72, 0x6c, 0x18, 0x04,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x70, 0x68, 0x6f, 0x74, 0x6f, 0x55, 0x72, 0x6c, 0x12, 0x22,
	0x0a, 0x0d, 0x69, 0x73, 0x5f, 0x6c, 0x61, 0x6e, 0x64, 0x5f, 0x6f, 0x77, 0x6e, 0x65, 0x72, 0x18,
	0x05, 0x20, 0x01, 0x28, 0x08, 0x52, 0x0b, 0x69, 0x73, 0x4c, 0x61, 0x6e, 0x64, 0x4f, 0x77, 0x6e,
	0x65, 0x72, 0x12, 0x26, 0x0a, 0x0f, 0x63, 0x61, 0x72, 0x65, 0x65, 0x72, 0x5f, 0x6c, 0x65, 0x76,
	0x65, 0x6c, 0x5f, 0x69, 0x64, 0x18, 0x06, 0x20, 0x01, 0x28, 0x05, 0x52, 0x0d, 0x63, 0x61, 0x72,
	0x65, 0x65, 0x72, 0x4c, 0x65, 0x76, 0x65, 0x6c, 0x49, 0x64, 0x12, 0x21, 0x0a, 0x0c, 0x63, 0x61,
	0x72, 0x65, 0x65, 0x72, 0x5f, 0x6c, 0x65, 0x76, 0x65, 0x6c, 0x18, 0x07, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x0b, 0x63, 0x61, 0x72, 0x65, 0x65, 0x72, 0x4c, 0x65, 0x76, 0x65, 0x6c, 0x12, 0x12, 0x0a,
	0x04, 0x63, 0x69, 0x74, 0x79, 0x18, 0x08, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x63, 0x69, 0x74,
	0x79, 0x12, 0x1f, 0x0a, 0x0b, 0x70, 0x72, 0x6f, 0x76, 0x69, 0x6e, 0x63, 0x65, 0x5f, 0x69, 0x64,
	0x18, 0x09, 0x20, 0x01, 0x28, 0x05, 0x52, 0x0a, 0x70, 0x72, 0x6f, 0x76, 0x69, 0x6e, 0x63, 0x65,
	0x49, 0x64, 0x12, 0x1a, 0x0a, 0x08, 0x70, 0x72, 0x6f, 0x76, 0x69, 0x6e, 0x63, 0x65, 0x18, 0x0a,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x70, 0x72, 0x6f, 0x76, 0x69, 0x6e, 0x63, 0x65, 0x12, 0x27,
	0x0a, 0x0f, 0x61, 0x76, 0x61, 0x69, 0x6c, 0x61, 0x62, 0x69, 0x6c, 0x69, 0x74, 0x79, 0x5f, 0x69,
	0x64, 0x18, 0x0b, 0x20, 0x01, 0x28, 0x05, 0x52, 0x0e, 0x61, 0x76, 0x61, 0x69, 0x6c, 0x61, 0x62,
	0x69, 0x6c, 0x69, 0x74, 0x79, 0x49, 0x64, 0x12, 0x22, 0x0a, 0x0c, 0x61, 0x76, 0x61, 0x69, 0x6c,
	0x61, 0x62, 0x69, 0x6c, 0x69, 0x74, 0x79, 0x18, 0x0c, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0c, 0x61,
	0x76, 0x61, 0x69, 0x6c, 0x61, 0x62, 0x69, 0x6c, 0x69, 0x74, 0x79, 0x12, 0x1b, 0x0a, 0x09, 0x6a,
	0x6f, 0x62, 0x5f, 0x74, 0x69, 0x74, 0x6c, 0x65, 0x18, 0x0d, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08,
	0x6a, 0x6f, 0x62, 0x54, 0x69, 0x74, 0x6c, 0x65, 0x12, 0x14, 0x0a, 0x05, 0x65, 0x6d, 0x61, 0x69,
	0x6c, 0x18, 0x0e, 0x20, 0x01, 0x28, 0x09, 0x52, 0x05, 0x65, 0x6d, 0x61, 0x69, 0x6c, 0x42, 0x71,
	0x0a, 0x20, 0x63, 0x6f, 0x6d, 0x2e, 0x77, 0x61, 0x6e, 0x70, 0x6e, 0x67, 0x2e, 0x6a, 0x6f, 0x62,
	0x73, 0x65, 0x65, 0x6b, 0x65, 0x72, 0x2e, 0x67, 0x72, 0x70, 0x63, 0x2e, 0x64, 0x6f, 0x6d, 0x61,
	0x69, 0x6e, 0x42, 0x13, 0x4a, 0x6f, 0x62, 0x73, 0x65, 0x65, 0x6b, 0x65, 0x72, 0x47, 0x72, 0x70,
	0x63, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x50, 0x01, 0x5a, 0x36, 0x67, 0x69, 0x74, 0x68, 0x75,
	0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x77, 0x61, 0x6e, 0x70, 0x6e, 0x67, 0x2f, 0x6a, 0x6f, 0x62,
	0x2d, 0x73, 0x65, 0x65, 0x6b, 0x65, 0x72, 0x73, 0x2d, 0x70, 0x72, 0x6f, 0x66, 0x69, 0x6c, 0x65,
	0x2d, 0x67, 0x72, 0x70, 0x63, 0x2f, 0x67, 0x72, 0x70, 0x63, 0x2f, 0x64, 0x6f, 0x6d, 0x61, 0x69,
	0x6e, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_protos_domain_jobseeker_grpc_proto_rawDescOnce sync.Once
	file_protos_domain_jobseeker_grpc_proto_rawDescData = file_protos_domain_jobseeker_grpc_proto_rawDesc
)

func file_protos_domain_jobseeker_grpc_proto_rawDescGZIP() []byte {
	file_protos_domain_jobseeker_grpc_proto_rawDescOnce.Do(func() {
		file_protos_domain_jobseeker_grpc_proto_rawDescData = protoimpl.X.CompressGZIP(file_protos_domain_jobseeker_grpc_proto_rawDescData)
	})
	return file_protos_domain_jobseeker_grpc_proto_rawDescData
}

var file_protos_domain_jobseeker_grpc_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_protos_domain_jobseeker_grpc_proto_goTypes = []interface{}{
	(*JobseekerGrpc)(nil), // 0: protos.domain.JobseekerGrpc
}
var file_protos_domain_jobseeker_grpc_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_protos_domain_jobseeker_grpc_proto_init() }
func file_protos_domain_jobseeker_grpc_proto_init() {
	if File_protos_domain_jobseeker_grpc_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_protos_domain_jobseeker_grpc_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*JobseekerGrpc); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_protos_domain_jobseeker_grpc_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_protos_domain_jobseeker_grpc_proto_goTypes,
		DependencyIndexes: file_protos_domain_jobseeker_grpc_proto_depIdxs,
		MessageInfos:      file_protos_domain_jobseeker_grpc_proto_msgTypes,
	}.Build()
	File_protos_domain_jobseeker_grpc_proto = out.File
	file_protos_domain_jobseeker_grpc_proto_rawDesc = nil
	file_protos_domain_jobseeker_grpc_proto_goTypes = nil
	file_protos_domain_jobseeker_grpc_proto_depIdxs = nil
}
