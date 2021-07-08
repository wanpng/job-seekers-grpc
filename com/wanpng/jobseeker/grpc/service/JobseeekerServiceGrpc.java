package com.wanpng.jobseeker.grpc.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.1)",
    comments = "Source: protos/service/jobseeker_service.grpc.proto")
public final class JobseeekerServiceGrpc {

  private JobseeekerServiceGrpc() {}

  public static final String SERVICE_NAME = "protos.service.JobseeekerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.wanpng.jobseeker.grpc.service.GetJobseekersRequest,
      com.wanpng.jobseeker.grpc.service.GetJobseekersResponse> getGetJobseekersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetJobseekers",
      requestType = com.wanpng.jobseeker.grpc.service.GetJobseekersRequest.class,
      responseType = com.wanpng.jobseeker.grpc.service.GetJobseekersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wanpng.jobseeker.grpc.service.GetJobseekersRequest,
      com.wanpng.jobseeker.grpc.service.GetJobseekersResponse> getGetJobseekersMethod() {
    io.grpc.MethodDescriptor<com.wanpng.jobseeker.grpc.service.GetJobseekersRequest, com.wanpng.jobseeker.grpc.service.GetJobseekersResponse> getGetJobseekersMethod;
    if ((getGetJobseekersMethod = JobseeekerServiceGrpc.getGetJobseekersMethod) == null) {
      synchronized (JobseeekerServiceGrpc.class) {
        if ((getGetJobseekersMethod = JobseeekerServiceGrpc.getGetJobseekersMethod) == null) {
          JobseeekerServiceGrpc.getGetJobseekersMethod = getGetJobseekersMethod =
              io.grpc.MethodDescriptor.<com.wanpng.jobseeker.grpc.service.GetJobseekersRequest, com.wanpng.jobseeker.grpc.service.GetJobseekersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetJobseekers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.jobseeker.grpc.service.GetJobseekersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.jobseeker.grpc.service.GetJobseekersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobseeekerServiceMethodDescriptorSupplier("GetJobseekers"))
              .build();
        }
      }
    }
    return getGetJobseekersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest,
      com.wanpng.jobseeker.grpc.service.GetJobSeekerResponse> getGetJobseekerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetJobseeker",
      requestType = com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest.class,
      responseType = com.wanpng.jobseeker.grpc.service.GetJobSeekerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest,
      com.wanpng.jobseeker.grpc.service.GetJobSeekerResponse> getGetJobseekerMethod() {
    io.grpc.MethodDescriptor<com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest, com.wanpng.jobseeker.grpc.service.GetJobSeekerResponse> getGetJobseekerMethod;
    if ((getGetJobseekerMethod = JobseeekerServiceGrpc.getGetJobseekerMethod) == null) {
      synchronized (JobseeekerServiceGrpc.class) {
        if ((getGetJobseekerMethod = JobseeekerServiceGrpc.getGetJobseekerMethod) == null) {
          JobseeekerServiceGrpc.getGetJobseekerMethod = getGetJobseekerMethod =
              io.grpc.MethodDescriptor.<com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest, com.wanpng.jobseeker.grpc.service.GetJobSeekerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetJobseeker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.jobseeker.grpc.service.GetJobSeekerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobseeekerServiceMethodDescriptorSupplier("GetJobseeker"))
              .build();
        }
      }
    }
    return getGetJobseekerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wanpng.jobseeker.grpc.service.GetSkillsRequest,
      com.wanpng.jobseeker.grpc.service.GetSkillsResponse> getGetSkillsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSkills",
      requestType = com.wanpng.jobseeker.grpc.service.GetSkillsRequest.class,
      responseType = com.wanpng.jobseeker.grpc.service.GetSkillsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wanpng.jobseeker.grpc.service.GetSkillsRequest,
      com.wanpng.jobseeker.grpc.service.GetSkillsResponse> getGetSkillsMethod() {
    io.grpc.MethodDescriptor<com.wanpng.jobseeker.grpc.service.GetSkillsRequest, com.wanpng.jobseeker.grpc.service.GetSkillsResponse> getGetSkillsMethod;
    if ((getGetSkillsMethod = JobseeekerServiceGrpc.getGetSkillsMethod) == null) {
      synchronized (JobseeekerServiceGrpc.class) {
        if ((getGetSkillsMethod = JobseeekerServiceGrpc.getGetSkillsMethod) == null) {
          JobseeekerServiceGrpc.getGetSkillsMethod = getGetSkillsMethod =
              io.grpc.MethodDescriptor.<com.wanpng.jobseeker.grpc.service.GetSkillsRequest, com.wanpng.jobseeker.grpc.service.GetSkillsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSkills"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.jobseeker.grpc.service.GetSkillsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.jobseeker.grpc.service.GetSkillsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobseeekerServiceMethodDescriptorSupplier("GetSkills"))
              .build();
        }
      }
    }
    return getGetSkillsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wanpng.jobseeker.grpc.service.GetEmploymentTypesRequest,
      com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse> getGetEmploymentTypesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEmploymentTypes",
      requestType = com.wanpng.jobseeker.grpc.service.GetEmploymentTypesRequest.class,
      responseType = com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wanpng.jobseeker.grpc.service.GetEmploymentTypesRequest,
      com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse> getGetEmploymentTypesMethod() {
    io.grpc.MethodDescriptor<com.wanpng.jobseeker.grpc.service.GetEmploymentTypesRequest, com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse> getGetEmploymentTypesMethod;
    if ((getGetEmploymentTypesMethod = JobseeekerServiceGrpc.getGetEmploymentTypesMethod) == null) {
      synchronized (JobseeekerServiceGrpc.class) {
        if ((getGetEmploymentTypesMethod = JobseeekerServiceGrpc.getGetEmploymentTypesMethod) == null) {
          JobseeekerServiceGrpc.getGetEmploymentTypesMethod = getGetEmploymentTypesMethod =
              io.grpc.MethodDescriptor.<com.wanpng.jobseeker.grpc.service.GetEmploymentTypesRequest, com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEmploymentTypes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.jobseeker.grpc.service.GetEmploymentTypesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobseeekerServiceMethodDescriptorSupplier("GetEmploymentTypes"))
              .build();
        }
      }
    }
    return getGetEmploymentTypesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wanpng.jobseeker.grpc.service.SearchJobSeekerRequest,
      com.wanpng.jobseeker.grpc.service.SearchJobSeekerResponse> getSearchJobseekerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchJobseeker",
      requestType = com.wanpng.jobseeker.grpc.service.SearchJobSeekerRequest.class,
      responseType = com.wanpng.jobseeker.grpc.service.SearchJobSeekerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wanpng.jobseeker.grpc.service.SearchJobSeekerRequest,
      com.wanpng.jobseeker.grpc.service.SearchJobSeekerResponse> getSearchJobseekerMethod() {
    io.grpc.MethodDescriptor<com.wanpng.jobseeker.grpc.service.SearchJobSeekerRequest, com.wanpng.jobseeker.grpc.service.SearchJobSeekerResponse> getSearchJobseekerMethod;
    if ((getSearchJobseekerMethod = JobseeekerServiceGrpc.getSearchJobseekerMethod) == null) {
      synchronized (JobseeekerServiceGrpc.class) {
        if ((getSearchJobseekerMethod = JobseeekerServiceGrpc.getSearchJobseekerMethod) == null) {
          JobseeekerServiceGrpc.getSearchJobseekerMethod = getSearchJobseekerMethod =
              io.grpc.MethodDescriptor.<com.wanpng.jobseeker.grpc.service.SearchJobSeekerRequest, com.wanpng.jobseeker.grpc.service.SearchJobSeekerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchJobseeker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.jobseeker.grpc.service.SearchJobSeekerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.jobseeker.grpc.service.SearchJobSeekerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobseeekerServiceMethodDescriptorSupplier("SearchJobseeker"))
              .build();
        }
      }
    }
    return getSearchJobseekerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JobseeekerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobseeekerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobseeekerServiceStub>() {
        @java.lang.Override
        public JobseeekerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobseeekerServiceStub(channel, callOptions);
        }
      };
    return JobseeekerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JobseeekerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobseeekerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobseeekerServiceBlockingStub>() {
        @java.lang.Override
        public JobseeekerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobseeekerServiceBlockingStub(channel, callOptions);
        }
      };
    return JobseeekerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JobseeekerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobseeekerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobseeekerServiceFutureStub>() {
        @java.lang.Override
        public JobseeekerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobseeekerServiceFutureStub(channel, callOptions);
        }
      };
    return JobseeekerServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class JobseeekerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getJobseekers(com.wanpng.jobseeker.grpc.service.GetJobseekersRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.jobseeker.grpc.service.GetJobseekersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetJobseekersMethod(), responseObserver);
    }

    /**
     */
    public void getJobseeker(com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.jobseeker.grpc.service.GetJobSeekerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetJobseekerMethod(), responseObserver);
    }

    /**
     */
    public void getSkills(com.wanpng.jobseeker.grpc.service.GetSkillsRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.jobseeker.grpc.service.GetSkillsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSkillsMethod(), responseObserver);
    }

    /**
     */
    public void getEmploymentTypes(com.wanpng.jobseeker.grpc.service.GetEmploymentTypesRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmploymentTypesMethod(), responseObserver);
    }

    /**
     */
    public void searchJobseeker(com.wanpng.jobseeker.grpc.service.SearchJobSeekerRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.jobseeker.grpc.service.SearchJobSeekerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchJobseekerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetJobseekersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wanpng.jobseeker.grpc.service.GetJobseekersRequest,
                com.wanpng.jobseeker.grpc.service.GetJobseekersResponse>(
                  this, METHODID_GET_JOBSEEKERS)))
          .addMethod(
            getGetJobseekerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest,
                com.wanpng.jobseeker.grpc.service.GetJobSeekerResponse>(
                  this, METHODID_GET_JOBSEEKER)))
          .addMethod(
            getGetSkillsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wanpng.jobseeker.grpc.service.GetSkillsRequest,
                com.wanpng.jobseeker.grpc.service.GetSkillsResponse>(
                  this, METHODID_GET_SKILLS)))
          .addMethod(
            getGetEmploymentTypesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wanpng.jobseeker.grpc.service.GetEmploymentTypesRequest,
                com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse>(
                  this, METHODID_GET_EMPLOYMENT_TYPES)))
          .addMethod(
            getSearchJobseekerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wanpng.jobseeker.grpc.service.SearchJobSeekerRequest,
                com.wanpng.jobseeker.grpc.service.SearchJobSeekerResponse>(
                  this, METHODID_SEARCH_JOBSEEKER)))
          .build();
    }
  }

  /**
   */
  public static final class JobseeekerServiceStub extends io.grpc.stub.AbstractAsyncStub<JobseeekerServiceStub> {
    private JobseeekerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobseeekerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobseeekerServiceStub(channel, callOptions);
    }

    /**
     */
    public void getJobseekers(com.wanpng.jobseeker.grpc.service.GetJobseekersRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.jobseeker.grpc.service.GetJobseekersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetJobseekersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getJobseeker(com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.jobseeker.grpc.service.GetJobSeekerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetJobseekerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSkills(com.wanpng.jobseeker.grpc.service.GetSkillsRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.jobseeker.grpc.service.GetSkillsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSkillsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEmploymentTypes(com.wanpng.jobseeker.grpc.service.GetEmploymentTypesRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmploymentTypesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchJobseeker(com.wanpng.jobseeker.grpc.service.SearchJobSeekerRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.jobseeker.grpc.service.SearchJobSeekerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchJobseekerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class JobseeekerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<JobseeekerServiceBlockingStub> {
    private JobseeekerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobseeekerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobseeekerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.wanpng.jobseeker.grpc.service.GetJobseekersResponse getJobseekers(com.wanpng.jobseeker.grpc.service.GetJobseekersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetJobseekersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wanpng.jobseeker.grpc.service.GetJobSeekerResponse getJobseeker(com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetJobseekerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wanpng.jobseeker.grpc.service.GetSkillsResponse getSkills(com.wanpng.jobseeker.grpc.service.GetSkillsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSkillsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse getEmploymentTypes(com.wanpng.jobseeker.grpc.service.GetEmploymentTypesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmploymentTypesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wanpng.jobseeker.grpc.service.SearchJobSeekerResponse searchJobseeker(com.wanpng.jobseeker.grpc.service.SearchJobSeekerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchJobseekerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class JobseeekerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<JobseeekerServiceFutureStub> {
    private JobseeekerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobseeekerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobseeekerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanpng.jobseeker.grpc.service.GetJobseekersResponse> getJobseekers(
        com.wanpng.jobseeker.grpc.service.GetJobseekersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetJobseekersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanpng.jobseeker.grpc.service.GetJobSeekerResponse> getJobseeker(
        com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetJobseekerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanpng.jobseeker.grpc.service.GetSkillsResponse> getSkills(
        com.wanpng.jobseeker.grpc.service.GetSkillsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSkillsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse> getEmploymentTypes(
        com.wanpng.jobseeker.grpc.service.GetEmploymentTypesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmploymentTypesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanpng.jobseeker.grpc.service.SearchJobSeekerResponse> searchJobseeker(
        com.wanpng.jobseeker.grpc.service.SearchJobSeekerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchJobseekerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_JOBSEEKERS = 0;
  private static final int METHODID_GET_JOBSEEKER = 1;
  private static final int METHODID_GET_SKILLS = 2;
  private static final int METHODID_GET_EMPLOYMENT_TYPES = 3;
  private static final int METHODID_SEARCH_JOBSEEKER = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JobseeekerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JobseeekerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_JOBSEEKERS:
          serviceImpl.getJobseekers((com.wanpng.jobseeker.grpc.service.GetJobseekersRequest) request,
              (io.grpc.stub.StreamObserver<com.wanpng.jobseeker.grpc.service.GetJobseekersResponse>) responseObserver);
          break;
        case METHODID_GET_JOBSEEKER:
          serviceImpl.getJobseeker((com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest) request,
              (io.grpc.stub.StreamObserver<com.wanpng.jobseeker.grpc.service.GetJobSeekerResponse>) responseObserver);
          break;
        case METHODID_GET_SKILLS:
          serviceImpl.getSkills((com.wanpng.jobseeker.grpc.service.GetSkillsRequest) request,
              (io.grpc.stub.StreamObserver<com.wanpng.jobseeker.grpc.service.GetSkillsResponse>) responseObserver);
          break;
        case METHODID_GET_EMPLOYMENT_TYPES:
          serviceImpl.getEmploymentTypes((com.wanpng.jobseeker.grpc.service.GetEmploymentTypesRequest) request,
              (io.grpc.stub.StreamObserver<com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse>) responseObserver);
          break;
        case METHODID_SEARCH_JOBSEEKER:
          serviceImpl.searchJobseeker((com.wanpng.jobseeker.grpc.service.SearchJobSeekerRequest) request,
              (io.grpc.stub.StreamObserver<com.wanpng.jobseeker.grpc.service.SearchJobSeekerResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class JobseeekerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JobseeekerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.wanpng.jobseeker.grpc.service.JobseeekerServiceProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("JobseeekerService");
    }
  }

  private static final class JobseeekerServiceFileDescriptorSupplier
      extends JobseeekerServiceBaseDescriptorSupplier {
    JobseeekerServiceFileDescriptorSupplier() {}
  }

  private static final class JobseeekerServiceMethodDescriptorSupplier
      extends JobseeekerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JobseeekerServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (JobseeekerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JobseeekerServiceFileDescriptorSupplier())
              .addMethod(getGetJobseekersMethod())
              .addMethod(getGetJobseekerMethod())
              .addMethod(getGetSkillsMethod())
              .addMethod(getGetEmploymentTypesMethod())
              .addMethod(getSearchJobseekerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
