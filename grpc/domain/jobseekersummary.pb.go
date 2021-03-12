// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0-devel
// 	protoc        v3.15.5
// source: protos/domain/jobseekersummary.proto

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

type JobseekerSummary struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id      string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	Summary string `protobuf:"bytes,2,opt,name=summary,proto3" json:"summary,omitempty"`
}

func (x *JobseekerSummary) Reset() {
	*x = JobseekerSummary{}
	if protoimpl.UnsafeEnabled {
		mi := &file_protos_domain_jobseekersummary_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *JobseekerSummary) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*JobseekerSummary) ProtoMessage() {}

func (x *JobseekerSummary) ProtoReflect() protoreflect.Message {
	mi := &file_protos_domain_jobseekersummary_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use JobseekerSummary.ProtoReflect.Descriptor instead.
func (*JobseekerSummary) Descriptor() ([]byte, []int) {
	return file_protos_domain_jobseekersummary_proto_rawDescGZIP(), []int{0}
}

func (x *JobseekerSummary) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *JobseekerSummary) GetSummary() string {
	if x != nil {
		return x.Summary
	}
	return ""
}

var File_protos_domain_jobseekersummary_proto protoreflect.FileDescriptor

var file_protos_domain_jobseekersummary_proto_rawDesc = []byte{
	0x0a, 0x24, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2f, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x2f,
	0x6a, 0x6f, 0x62, 0x73, 0x65, 0x65, 0x6b, 0x65, 0x72, 0x73, 0x75, 0x6d, 0x6d, 0x61, 0x72, 0x79,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2e, 0x64,
	0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x22, 0x3c, 0x0a, 0x10, 0x4a, 0x6f, 0x62, 0x73, 0x65, 0x65, 0x6b,
	0x65, 0x72, 0x53, 0x75, 0x6d, 0x6d, 0x61, 0x72, 0x79, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x69, 0x64, 0x12, 0x18, 0x0a, 0x07, 0x73, 0x75, 0x6d,
	0x6d, 0x61, 0x72, 0x79, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x73, 0x75, 0x6d, 0x6d,
	0x61, 0x72, 0x79, 0x42, 0x38, 0x5a, 0x36, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f,
	0x6d, 0x2f, 0x77, 0x61, 0x6e, 0x70, 0x6e, 0x67, 0x2f, 0x6a, 0x6f, 0x62, 0x2d, 0x73, 0x65, 0x65,
	0x6b, 0x65, 0x72, 0x73, 0x2d, 0x70, 0x72, 0x6f, 0x66, 0x69, 0x6c, 0x65, 0x2d, 0x67, 0x72, 0x70,
	0x63, 0x2f, 0x67, 0x72, 0x70, 0x63, 0x2f, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x62, 0x06, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_protos_domain_jobseekersummary_proto_rawDescOnce sync.Once
	file_protos_domain_jobseekersummary_proto_rawDescData = file_protos_domain_jobseekersummary_proto_rawDesc
)

func file_protos_domain_jobseekersummary_proto_rawDescGZIP() []byte {
	file_protos_domain_jobseekersummary_proto_rawDescOnce.Do(func() {
		file_protos_domain_jobseekersummary_proto_rawDescData = protoimpl.X.CompressGZIP(file_protos_domain_jobseekersummary_proto_rawDescData)
	})
	return file_protos_domain_jobseekersummary_proto_rawDescData
}

var file_protos_domain_jobseekersummary_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_protos_domain_jobseekersummary_proto_goTypes = []interface{}{
	(*JobseekerSummary)(nil), // 0: protos.domain.JobseekerSummary
}
var file_protos_domain_jobseekersummary_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_protos_domain_jobseekersummary_proto_init() }
func file_protos_domain_jobseekersummary_proto_init() {
	if File_protos_domain_jobseekersummary_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_protos_domain_jobseekersummary_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*JobseekerSummary); i {
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
			RawDescriptor: file_protos_domain_jobseekersummary_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_protos_domain_jobseekersummary_proto_goTypes,
		DependencyIndexes: file_protos_domain_jobseekersummary_proto_depIdxs,
		MessageInfos:      file_protos_domain_jobseekersummary_proto_msgTypes,
	}.Build()
	File_protos_domain_jobseekersummary_proto = out.File
	file_protos_domain_jobseekersummary_proto_rawDesc = nil
	file_protos_domain_jobseekersummary_proto_goTypes = nil
	file_protos_domain_jobseekersummary_proto_depIdxs = nil
}
