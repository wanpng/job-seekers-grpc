// Code generated by protoc-gen-go-grpc. DO NOT EDIT.

package service

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// JobseeekerServiceClient is the client API for JobseeekerService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type JobseeekerServiceClient interface {
	GetJobseekers(ctx context.Context, in *GetJobseekersRequest, opts ...grpc.CallOption) (*GetJobseekersResponse, error)
	GetJobseeker(ctx context.Context, in *GetJobSeekerRequest, opts ...grpc.CallOption) (*GetJobSeekerResponse, error)
	GetSkills(ctx context.Context, in *GetSkillsRequest, opts ...grpc.CallOption) (*GetSkillsResponse, error)
	GetEmploymentTypes(ctx context.Context, in *GetEmploymentTypesRequest, opts ...grpc.CallOption) (*GetEmploymentTypesResponse, error)
	SearchJobseeker(ctx context.Context, in *SearchJobSeekerRequest, opts ...grpc.CallOption) (*SearchJobSeekerResponse, error)
}

type jobseeekerServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewJobseeekerServiceClient(cc grpc.ClientConnInterface) JobseeekerServiceClient {
	return &jobseeekerServiceClient{cc}
}

func (c *jobseeekerServiceClient) GetJobseekers(ctx context.Context, in *GetJobseekersRequest, opts ...grpc.CallOption) (*GetJobseekersResponse, error) {
	out := new(GetJobseekersResponse)
	err := c.cc.Invoke(ctx, "/protos.service.JobseeekerService/GetJobseekers", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *jobseeekerServiceClient) GetJobseeker(ctx context.Context, in *GetJobSeekerRequest, opts ...grpc.CallOption) (*GetJobSeekerResponse, error) {
	out := new(GetJobSeekerResponse)
	err := c.cc.Invoke(ctx, "/protos.service.JobseeekerService/GetJobseeker", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *jobseeekerServiceClient) GetSkills(ctx context.Context, in *GetSkillsRequest, opts ...grpc.CallOption) (*GetSkillsResponse, error) {
	out := new(GetSkillsResponse)
	err := c.cc.Invoke(ctx, "/protos.service.JobseeekerService/GetSkills", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *jobseeekerServiceClient) GetEmploymentTypes(ctx context.Context, in *GetEmploymentTypesRequest, opts ...grpc.CallOption) (*GetEmploymentTypesResponse, error) {
	out := new(GetEmploymentTypesResponse)
	err := c.cc.Invoke(ctx, "/protos.service.JobseeekerService/GetEmploymentTypes", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *jobseeekerServiceClient) SearchJobseeker(ctx context.Context, in *SearchJobSeekerRequest, opts ...grpc.CallOption) (*SearchJobSeekerResponse, error) {
	out := new(SearchJobSeekerResponse)
	err := c.cc.Invoke(ctx, "/protos.service.JobseeekerService/SearchJobseeker", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// JobseeekerServiceServer is the server API for JobseeekerService service.
// All implementations must embed UnimplementedJobseeekerServiceServer
// for forward compatibility
type JobseeekerServiceServer interface {
	GetJobseekers(context.Context, *GetJobseekersRequest) (*GetJobseekersResponse, error)
	GetJobseeker(context.Context, *GetJobSeekerRequest) (*GetJobSeekerResponse, error)
	GetSkills(context.Context, *GetSkillsRequest) (*GetSkillsResponse, error)
	GetEmploymentTypes(context.Context, *GetEmploymentTypesRequest) (*GetEmploymentTypesResponse, error)
	SearchJobseeker(context.Context, *SearchJobSeekerRequest) (*SearchJobSeekerResponse, error)
	mustEmbedUnimplementedJobseeekerServiceServer()
}

// UnimplementedJobseeekerServiceServer must be embedded to have forward compatible implementations.
type UnimplementedJobseeekerServiceServer struct {
}

func (UnimplementedJobseeekerServiceServer) GetJobseekers(context.Context, *GetJobseekersRequest) (*GetJobseekersResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetJobseekers not implemented")
}
func (UnimplementedJobseeekerServiceServer) GetJobseeker(context.Context, *GetJobSeekerRequest) (*GetJobSeekerResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetJobseeker not implemented")
}
func (UnimplementedJobseeekerServiceServer) GetSkills(context.Context, *GetSkillsRequest) (*GetSkillsResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetSkills not implemented")
}
func (UnimplementedJobseeekerServiceServer) GetEmploymentTypes(context.Context, *GetEmploymentTypesRequest) (*GetEmploymentTypesResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetEmploymentTypes not implemented")
}
func (UnimplementedJobseeekerServiceServer) SearchJobseeker(context.Context, *SearchJobSeekerRequest) (*SearchJobSeekerResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method SearchJobseeker not implemented")
}
func (UnimplementedJobseeekerServiceServer) mustEmbedUnimplementedJobseeekerServiceServer() {}

// UnsafeJobseeekerServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to JobseeekerServiceServer will
// result in compilation errors.
type UnsafeJobseeekerServiceServer interface {
	mustEmbedUnimplementedJobseeekerServiceServer()
}

func RegisterJobseeekerServiceServer(s grpc.ServiceRegistrar, srv JobseeekerServiceServer) {
	s.RegisterService(&JobseeekerService_ServiceDesc, srv)
}

func _JobseeekerService_GetJobseekers_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetJobseekersRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(JobseeekerServiceServer).GetJobseekers(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/protos.service.JobseeekerService/GetJobseekers",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(JobseeekerServiceServer).GetJobseekers(ctx, req.(*GetJobseekersRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _JobseeekerService_GetJobseeker_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetJobSeekerRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(JobseeekerServiceServer).GetJobseeker(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/protos.service.JobseeekerService/GetJobseeker",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(JobseeekerServiceServer).GetJobseeker(ctx, req.(*GetJobSeekerRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _JobseeekerService_GetSkills_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetSkillsRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(JobseeekerServiceServer).GetSkills(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/protos.service.JobseeekerService/GetSkills",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(JobseeekerServiceServer).GetSkills(ctx, req.(*GetSkillsRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _JobseeekerService_GetEmploymentTypes_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetEmploymentTypesRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(JobseeekerServiceServer).GetEmploymentTypes(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/protos.service.JobseeekerService/GetEmploymentTypes",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(JobseeekerServiceServer).GetEmploymentTypes(ctx, req.(*GetEmploymentTypesRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _JobseeekerService_SearchJobseeker_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(SearchJobSeekerRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(JobseeekerServiceServer).SearchJobseeker(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/protos.service.JobseeekerService/SearchJobseeker",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(JobseeekerServiceServer).SearchJobseeker(ctx, req.(*SearchJobSeekerRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// JobseeekerService_ServiceDesc is the grpc.ServiceDesc for JobseeekerService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var JobseeekerService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "protos.service.JobseeekerService",
	HandlerType: (*JobseeekerServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "GetJobseekers",
			Handler:    _JobseeekerService_GetJobseekers_Handler,
		},
		{
			MethodName: "GetJobseeker",
			Handler:    _JobseeekerService_GetJobseeker_Handler,
		},
		{
			MethodName: "GetSkills",
			Handler:    _JobseeekerService_GetSkills_Handler,
		},
		{
			MethodName: "GetEmploymentTypes",
			Handler:    _JobseeekerService_GetEmploymentTypes_Handler,
		},
		{
			MethodName: "SearchJobseeker",
			Handler:    _JobseeekerService_SearchJobseeker_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "protos/service/jobseeker_service.grpc.proto",
}
