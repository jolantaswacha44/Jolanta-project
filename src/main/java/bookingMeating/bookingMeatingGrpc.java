package bookingMeating;

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
    comments = "Source: bookingMeating.proto")
public final class bookingMeatingGrpc {

  private bookingMeatingGrpc() {}

  public static final String SERVICE_NAME = "bookingMeating.bookingMeating";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bookingMeating.LoginRequest,
      bookingMeating.LoginResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = bookingMeating.LoginRequest.class,
      responseType = bookingMeating.LoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bookingMeating.LoginRequest,
      bookingMeating.LoginResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<bookingMeating.LoginRequest, bookingMeating.LoginResponse> getLoginMethod;
    if ((getLoginMethod = bookingMeatingGrpc.getLoginMethod) == null) {
      synchronized (bookingMeatingGrpc.class) {
        if ((getLoginMethod = bookingMeatingGrpc.getLoginMethod) == null) {
          bookingMeatingGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<bookingMeating.LoginRequest, bookingMeating.LoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bookingMeating.bookingMeating", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingMeating.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingMeating.LoginResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new bookingMeatingMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bookingMeating.MeatingRoomRequest,
      bookingMeating.MeatingRoomResponse> getMeatingRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "meatingRoom",
      requestType = bookingMeating.MeatingRoomRequest.class,
      responseType = bookingMeating.MeatingRoomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<bookingMeating.MeatingRoomRequest,
      bookingMeating.MeatingRoomResponse> getMeatingRoomMethod() {
    io.grpc.MethodDescriptor<bookingMeating.MeatingRoomRequest, bookingMeating.MeatingRoomResponse> getMeatingRoomMethod;
    if ((getMeatingRoomMethod = bookingMeatingGrpc.getMeatingRoomMethod) == null) {
      synchronized (bookingMeatingGrpc.class) {
        if ((getMeatingRoomMethod = bookingMeatingGrpc.getMeatingRoomMethod) == null) {
          bookingMeatingGrpc.getMeatingRoomMethod = getMeatingRoomMethod = 
              io.grpc.MethodDescriptor.<bookingMeating.MeatingRoomRequest, bookingMeating.MeatingRoomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "bookingMeating.bookingMeating", "meatingRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingMeating.MeatingRoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingMeating.MeatingRoomResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new bookingMeatingMethodDescriptorSupplier("meatingRoom"))
                  .build();
          }
        }
     }
     return getMeatingRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bookingMeating.LogoutRequest,
      bookingMeating.LogoutResponse> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logout",
      requestType = bookingMeating.LogoutRequest.class,
      responseType = bookingMeating.LogoutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bookingMeating.LogoutRequest,
      bookingMeating.LogoutResponse> getLogoutMethod() {
    io.grpc.MethodDescriptor<bookingMeating.LogoutRequest, bookingMeating.LogoutResponse> getLogoutMethod;
    if ((getLogoutMethod = bookingMeatingGrpc.getLogoutMethod) == null) {
      synchronized (bookingMeatingGrpc.class) {
        if ((getLogoutMethod = bookingMeatingGrpc.getLogoutMethod) == null) {
          bookingMeatingGrpc.getLogoutMethod = getLogoutMethod = 
              io.grpc.MethodDescriptor.<bookingMeating.LogoutRequest, bookingMeating.LogoutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bookingMeating.bookingMeating", "logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingMeating.LogoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingMeating.LogoutResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new bookingMeatingMethodDescriptorSupplier("logout"))
                  .build();
          }
        }
     }
     return getLogoutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static bookingMeatingStub newStub(io.grpc.Channel channel) {
    return new bookingMeatingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static bookingMeatingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new bookingMeatingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static bookingMeatingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new bookingMeatingFutureStub(channel);
  }

  /**
   */
  public static abstract class bookingMeatingImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(bookingMeating.LoginRequest request,
        io.grpc.stub.StreamObserver<bookingMeating.LoginResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void meatingRoom(bookingMeating.MeatingRoomRequest request,
        io.grpc.stub.StreamObserver<bookingMeating.MeatingRoomResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMeatingRoomMethod(), responseObserver);
    }

    /**
     */
    public void logout(bookingMeating.LogoutRequest request,
        io.grpc.stub.StreamObserver<bookingMeating.LogoutResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                bookingMeating.LoginRequest,
                bookingMeating.LoginResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getMeatingRoomMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                bookingMeating.MeatingRoomRequest,
                bookingMeating.MeatingRoomResponse>(
                  this, METHODID_MEATING_ROOM)))
          .addMethod(
            getLogoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                bookingMeating.LogoutRequest,
                bookingMeating.LogoutResponse>(
                  this, METHODID_LOGOUT)))
          .build();
    }
  }

  /**
   */
  public static final class bookingMeatingStub extends io.grpc.stub.AbstractStub<bookingMeatingStub> {
    private bookingMeatingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private bookingMeatingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected bookingMeatingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new bookingMeatingStub(channel, callOptions);
    }

    /**
     */
    public void login(bookingMeating.LoginRequest request,
        io.grpc.stub.StreamObserver<bookingMeating.LoginResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void meatingRoom(bookingMeating.MeatingRoomRequest request,
        io.grpc.stub.StreamObserver<bookingMeating.MeatingRoomResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getMeatingRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(bookingMeating.LogoutRequest request,
        io.grpc.stub.StreamObserver<bookingMeating.LogoutResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class bookingMeatingBlockingStub extends io.grpc.stub.AbstractStub<bookingMeatingBlockingStub> {
    private bookingMeatingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private bookingMeatingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected bookingMeatingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new bookingMeatingBlockingStub(channel, callOptions);
    }

    /**
     */
    public bookingMeating.LoginResponse login(bookingMeating.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<bookingMeating.MeatingRoomResponse> meatingRoom(
        bookingMeating.MeatingRoomRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getMeatingRoomMethod(), getCallOptions(), request);
    }

    /**
     */
    public bookingMeating.LogoutResponse logout(bookingMeating.LogoutRequest request) {
      return blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class bookingMeatingFutureStub extends io.grpc.stub.AbstractStub<bookingMeatingFutureStub> {
    private bookingMeatingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private bookingMeatingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected bookingMeatingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new bookingMeatingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bookingMeating.LoginResponse> login(
        bookingMeating.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bookingMeating.LogoutResponse> logout(
        bookingMeating.LogoutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_MEATING_ROOM = 1;
  private static final int METHODID_LOGOUT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final bookingMeatingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(bookingMeatingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((bookingMeating.LoginRequest) request,
              (io.grpc.stub.StreamObserver<bookingMeating.LoginResponse>) responseObserver);
          break;
        case METHODID_MEATING_ROOM:
          serviceImpl.meatingRoom((bookingMeating.MeatingRoomRequest) request,
              (io.grpc.stub.StreamObserver<bookingMeating.MeatingRoomResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((bookingMeating.LogoutRequest) request,
              (io.grpc.stub.StreamObserver<bookingMeating.LogoutResponse>) responseObserver);
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

  private static abstract class bookingMeatingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    bookingMeatingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bookingMeating.bookingMeatingImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("bookingMeating");
    }
  }

  private static final class bookingMeatingFileDescriptorSupplier
      extends bookingMeatingBaseDescriptorSupplier {
    bookingMeatingFileDescriptorSupplier() {}
  }

  private static final class bookingMeatingMethodDescriptorSupplier
      extends bookingMeatingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    bookingMeatingMethodDescriptorSupplier(String methodName) {
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
      synchronized (bookingMeatingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new bookingMeatingFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getMeatingRoomMethod())
              .addMethod(getLogoutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
