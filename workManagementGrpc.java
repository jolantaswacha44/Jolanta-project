package workManagement;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: workManagement.proto")
public final class workManagementGrpc {

  private workManagementGrpc() {}

  public static final String SERVICE_NAME = "workManagement.workManagement";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<workManagement.LoginRequest,
      workManagement.LoginResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = workManagement.LoginRequest.class,
      responseType = workManagement.LoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<workManagement.LoginRequest,
      workManagement.LoginResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<workManagement.LoginRequest, workManagement.LoginResponse> getLoginMethod;
    if ((getLoginMethod = workManagementGrpc.getLoginMethod) == null) {
      synchronized (workManagementGrpc.class) {
        if ((getLoginMethod = workManagementGrpc.getLoginMethod) == null) {
          workManagementGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<workManagement.LoginRequest, workManagement.LoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "workManagement.workManagement", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  workManagement.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  workManagement.LoginResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new workManagementMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<workManagement.AssignTasksRequest,
      workManagement.AssignTasksResponse> getAssignTasksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "assignTasks",
      requestType = workManagement.AssignTasksRequest.class,
      responseType = workManagement.AssignTasksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<workManagement.AssignTasksRequest,
      workManagement.AssignTasksResponse> getAssignTasksMethod() {
    io.grpc.MethodDescriptor<workManagement.AssignTasksRequest, workManagement.AssignTasksResponse> getAssignTasksMethod;
    if ((getAssignTasksMethod = workManagementGrpc.getAssignTasksMethod) == null) {
      synchronized (workManagementGrpc.class) {
        if ((getAssignTasksMethod = workManagementGrpc.getAssignTasksMethod) == null) {
          workManagementGrpc.getAssignTasksMethod = getAssignTasksMethod = 
              io.grpc.MethodDescriptor.<workManagement.AssignTasksRequest, workManagement.AssignTasksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "workManagement.workManagement", "assignTasks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  workManagement.AssignTasksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  workManagement.AssignTasksResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new workManagementMethodDescriptorSupplier("assignTasks"))
                  .build();
          }
        }
     }
     return getAssignTasksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<workManagement.LogoutRequest,
      workManagement.LogoutResponse> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logout",
      requestType = workManagement.LogoutRequest.class,
      responseType = workManagement.LogoutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<workManagement.LogoutRequest,
      workManagement.LogoutResponse> getLogoutMethod() {
    io.grpc.MethodDescriptor<workManagement.LogoutRequest, workManagement.LogoutResponse> getLogoutMethod;
    if ((getLogoutMethod = workManagementGrpc.getLogoutMethod) == null) {
      synchronized (workManagementGrpc.class) {
        if ((getLogoutMethod = workManagementGrpc.getLogoutMethod) == null) {
          workManagementGrpc.getLogoutMethod = getLogoutMethod = 
              io.grpc.MethodDescriptor.<workManagement.LogoutRequest, workManagement.LogoutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "workManagement.workManagement", "logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  workManagement.LogoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  workManagement.LogoutResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new workManagementMethodDescriptorSupplier("logout"))
                  .build();
          }
        }
     }
     return getLogoutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static workManagementStub newStub(io.grpc.Channel channel) {
    return new workManagementStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static workManagementBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new workManagementBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static workManagementFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new workManagementFutureStub(channel);
  }

  /**
   */
  public static abstract class workManagementImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(workManagement.LoginRequest request,
        io.grpc.stub.StreamObserver<workManagement.LoginResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<workManagement.AssignTasksRequest> assignTasks(
        io.grpc.stub.StreamObserver<workManagement.AssignTasksResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getAssignTasksMethod(), responseObserver);
    }

    /**
     */
    public void logout(workManagement.LogoutRequest request,
        io.grpc.stub.StreamObserver<workManagement.LogoutResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                workManagement.LoginRequest,
                workManagement.LoginResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getAssignTasksMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                workManagement.AssignTasksRequest,
                workManagement.AssignTasksResponse>(
                  this, METHODID_ASSIGN_TASKS)))
          .addMethod(
            getLogoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                workManagement.LogoutRequest,
                workManagement.LogoutResponse>(
                  this, METHODID_LOGOUT)))
          .build();
    }
  }

  /**
   */
  public static final class workManagementStub extends io.grpc.stub.AbstractStub<workManagementStub> {
    private workManagementStub(io.grpc.Channel channel) {
      super(channel);
    }

    private workManagementStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected workManagementStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new workManagementStub(channel, callOptions);
    }

    /**
     */
    public void login(workManagement.LoginRequest request,
        io.grpc.stub.StreamObserver<workManagement.LoginResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<workManagement.AssignTasksRequest> assignTasks(
        io.grpc.stub.StreamObserver<workManagement.AssignTasksResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getAssignTasksMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void logout(workManagement.LogoutRequest request,
        io.grpc.stub.StreamObserver<workManagement.LogoutResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class workManagementBlockingStub extends io.grpc.stub.AbstractStub<workManagementBlockingStub> {
    private workManagementBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private workManagementBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected workManagementBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new workManagementBlockingStub(channel, callOptions);
    }

    /**
     */
    public workManagement.LoginResponse login(workManagement.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public workManagement.LogoutResponse logout(workManagement.LogoutRequest request) {
      return blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class workManagementFutureStub extends io.grpc.stub.AbstractStub<workManagementFutureStub> {
    private workManagementFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private workManagementFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected workManagementFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new workManagementFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<workManagement.LoginResponse> login(
        workManagement.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<workManagement.LogoutResponse> logout(
        workManagement.LogoutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_LOGOUT = 1;
  private static final int METHODID_ASSIGN_TASKS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final workManagementImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(workManagementImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((workManagement.LoginRequest) request,
              (io.grpc.stub.StreamObserver<workManagement.LoginResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((workManagement.LogoutRequest) request,
              (io.grpc.stub.StreamObserver<workManagement.LogoutResponse>) responseObserver);
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
        case METHODID_ASSIGN_TASKS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.assignTasks(
              (io.grpc.stub.StreamObserver<workManagement.AssignTasksResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class workManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    workManagementBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return workManagement.workManagementImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("workManagement");
    }
  }

  private static final class workManagementFileDescriptorSupplier
      extends workManagementBaseDescriptorSupplier {
    workManagementFileDescriptorSupplier() {}
  }

  private static final class workManagementMethodDescriptorSupplier
      extends workManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    workManagementMethodDescriptorSupplier(String methodName) {
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
      synchronized (workManagementGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new workManagementFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getAssignTasksMethod())
              .addMethod(getLogoutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
