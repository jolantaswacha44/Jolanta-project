package calendarMeating;

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
    comments = "Source: calendarMeating.proto")
public final class calendarMeatingGrpc {

  private calendarMeatingGrpc() {}

  public static final String SERVICE_NAME = "calendarMeating.calendarMeating";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<calendarMeating.LoginRequest,
      calendarMeating.LoginResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = calendarMeating.LoginRequest.class,
      responseType = calendarMeating.LoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<calendarMeating.LoginRequest,
      calendarMeating.LoginResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<calendarMeating.LoginRequest, calendarMeating.LoginResponse> getLoginMethod;
    if ((getLoginMethod = calendarMeatingGrpc.getLoginMethod) == null) {
      synchronized (calendarMeatingGrpc.class) {
        if ((getLoginMethod = calendarMeatingGrpc.getLoginMethod) == null) {
          calendarMeatingGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<calendarMeating.LoginRequest, calendarMeating.LoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "calendarMeating.calendarMeating", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  calendarMeating.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  calendarMeating.LoginResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new calendarMeatingMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<calendarMeating.ScheduleMeatingRequest,
      calendarMeating.ScheduleMeatingResponse> getScheduleMeatingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "scheduleMeating",
      requestType = calendarMeating.ScheduleMeatingRequest.class,
      responseType = calendarMeating.ScheduleMeatingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<calendarMeating.ScheduleMeatingRequest,
      calendarMeating.ScheduleMeatingResponse> getScheduleMeatingMethod() {
    io.grpc.MethodDescriptor<calendarMeating.ScheduleMeatingRequest, calendarMeating.ScheduleMeatingResponse> getScheduleMeatingMethod;
    if ((getScheduleMeatingMethod = calendarMeatingGrpc.getScheduleMeatingMethod) == null) {
      synchronized (calendarMeatingGrpc.class) {
        if ((getScheduleMeatingMethod = calendarMeatingGrpc.getScheduleMeatingMethod) == null) {
          calendarMeatingGrpc.getScheduleMeatingMethod = getScheduleMeatingMethod = 
              io.grpc.MethodDescriptor.<calendarMeating.ScheduleMeatingRequest, calendarMeating.ScheduleMeatingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "calendarMeating.calendarMeating", "scheduleMeating"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  calendarMeating.ScheduleMeatingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  calendarMeating.ScheduleMeatingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new calendarMeatingMethodDescriptorSupplier("scheduleMeating"))
                  .build();
          }
        }
     }
     return getScheduleMeatingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<calendarMeating.LogoutRequest,
      calendarMeating.LogoutResponse> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logout",
      requestType = calendarMeating.LogoutRequest.class,
      responseType = calendarMeating.LogoutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<calendarMeating.LogoutRequest,
      calendarMeating.LogoutResponse> getLogoutMethod() {
    io.grpc.MethodDescriptor<calendarMeating.LogoutRequest, calendarMeating.LogoutResponse> getLogoutMethod;
    if ((getLogoutMethod = calendarMeatingGrpc.getLogoutMethod) == null) {
      synchronized (calendarMeatingGrpc.class) {
        if ((getLogoutMethod = calendarMeatingGrpc.getLogoutMethod) == null) {
          calendarMeatingGrpc.getLogoutMethod = getLogoutMethod = 
              io.grpc.MethodDescriptor.<calendarMeating.LogoutRequest, calendarMeating.LogoutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "calendarMeating.calendarMeating", "logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  calendarMeating.LogoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  calendarMeating.LogoutResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new calendarMeatingMethodDescriptorSupplier("logout"))
                  .build();
          }
        }
     }
     return getLogoutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static calendarMeatingStub newStub(io.grpc.Channel channel) {
    return new calendarMeatingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static calendarMeatingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new calendarMeatingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static calendarMeatingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new calendarMeatingFutureStub(channel);
  }

  /**
   */
  public static abstract class calendarMeatingImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * unary grpc - login method
     * </pre>
     */
    public void login(calendarMeating.LoginRequest request,
        io.grpc.stub.StreamObserver<calendarMeating.LoginResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     * <pre>
     *client streaming grpc - scheduleMeating
     * </pre>
     */
    public io.grpc.stub.StreamObserver<calendarMeating.ScheduleMeatingRequest> scheduleMeating(
        io.grpc.stub.StreamObserver<calendarMeating.ScheduleMeatingResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getScheduleMeatingMethod(), responseObserver);
    }

    /**
     * <pre>
     * unary grpc - logout method
     * </pre>
     */
    public void logout(calendarMeating.LogoutRequest request,
        io.grpc.stub.StreamObserver<calendarMeating.LogoutResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                calendarMeating.LoginRequest,
                calendarMeating.LoginResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getScheduleMeatingMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                calendarMeating.ScheduleMeatingRequest,
                calendarMeating.ScheduleMeatingResponse>(
                  this, METHODID_SCHEDULE_MEATING)))
          .addMethod(
            getLogoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                calendarMeating.LogoutRequest,
                calendarMeating.LogoutResponse>(
                  this, METHODID_LOGOUT)))
          .build();
    }
  }

  /**
   */
  public static final class calendarMeatingStub extends io.grpc.stub.AbstractStub<calendarMeatingStub> {
    private calendarMeatingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private calendarMeatingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected calendarMeatingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new calendarMeatingStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary grpc - login method
     * </pre>
     */
    public void login(calendarMeating.LoginRequest request,
        io.grpc.stub.StreamObserver<calendarMeating.LoginResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client streaming grpc - scheduleMeating
     * </pre>
     */
    public io.grpc.stub.StreamObserver<calendarMeating.ScheduleMeatingRequest> scheduleMeating(
        io.grpc.stub.StreamObserver<calendarMeating.ScheduleMeatingResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getScheduleMeatingMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * unary grpc - logout method
     * </pre>
     */
    public void logout(calendarMeating.LogoutRequest request,
        io.grpc.stub.StreamObserver<calendarMeating.LogoutResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class calendarMeatingBlockingStub extends io.grpc.stub.AbstractStub<calendarMeatingBlockingStub> {
    private calendarMeatingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private calendarMeatingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected calendarMeatingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new calendarMeatingBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary grpc - login method
     * </pre>
     */
    public calendarMeating.LoginResponse login(calendarMeating.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * unary grpc - logout method
     * </pre>
     */
    public calendarMeating.LogoutResponse logout(calendarMeating.LogoutRequest request) {
      return blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class calendarMeatingFutureStub extends io.grpc.stub.AbstractStub<calendarMeatingFutureStub> {
    private calendarMeatingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private calendarMeatingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected calendarMeatingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new calendarMeatingFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary grpc - login method
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<calendarMeating.LoginResponse> login(
        calendarMeating.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * unary grpc - logout method
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<calendarMeating.LogoutResponse> logout(
        calendarMeating.LogoutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_LOGOUT = 1;
  private static final int METHODID_SCHEDULE_MEATING = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final calendarMeatingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(calendarMeatingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((calendarMeating.LoginRequest) request,
              (io.grpc.stub.StreamObserver<calendarMeating.LoginResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((calendarMeating.LogoutRequest) request,
              (io.grpc.stub.StreamObserver<calendarMeating.LogoutResponse>) responseObserver);
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
        case METHODID_SCHEDULE_MEATING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.scheduleMeating(
              (io.grpc.stub.StreamObserver<calendarMeating.ScheduleMeatingResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class calendarMeatingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    calendarMeatingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return calendarMeating.calendarMeatingImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("calendarMeating");
    }
  }

  private static final class calendarMeatingFileDescriptorSupplier
      extends calendarMeatingBaseDescriptorSupplier {
    calendarMeatingFileDescriptorSupplier() {}
  }

  private static final class calendarMeatingMethodDescriptorSupplier
      extends calendarMeatingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    calendarMeatingMethodDescriptorSupplier(String methodName) {
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
      synchronized (calendarMeatingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new calendarMeatingFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getScheduleMeatingMethod())
              .addMethod(getLogoutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
