package grpc.generated.RoomKeyControls;

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
    comments = "Source: RoomKeyControls.proto")
public final class RoomKeyControlsGrpc {

  private RoomKeyControlsGrpc() {}

  public static final String SERVICE_NAME = "RoomKeyControls.RoomKeyControls";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.generated.RoomKeyControls.RoomRequest,
      grpc.generated.RoomKeyControls.RoomConditions> getRoomControlConditionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RoomControlConditions",
      requestType = grpc.generated.RoomKeyControls.RoomRequest.class,
      responseType = grpc.generated.RoomKeyControls.RoomConditions.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.generated.RoomKeyControls.RoomRequest,
      grpc.generated.RoomKeyControls.RoomConditions> getRoomControlConditionsMethod() {
    io.grpc.MethodDescriptor<grpc.generated.RoomKeyControls.RoomRequest, grpc.generated.RoomKeyControls.RoomConditions> getRoomControlConditionsMethod;
    if ((getRoomControlConditionsMethod = RoomKeyControlsGrpc.getRoomControlConditionsMethod) == null) {
      synchronized (RoomKeyControlsGrpc.class) {
        if ((getRoomControlConditionsMethod = RoomKeyControlsGrpc.getRoomControlConditionsMethod) == null) {
          RoomKeyControlsGrpc.getRoomControlConditionsMethod = getRoomControlConditionsMethod = 
              io.grpc.MethodDescriptor.<grpc.generated.RoomKeyControls.RoomRequest, grpc.generated.RoomKeyControls.RoomConditions>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "RoomKeyControls.RoomKeyControls", "RoomControlConditions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.generated.RoomKeyControls.RoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.generated.RoomKeyControls.RoomConditions.getDefaultInstance()))
                  .setSchemaDescriptor(new RoomKeyControlsMethodDescriptorSupplier("RoomControlConditions"))
                  .build();
          }
        }
     }
     return getRoomControlConditionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RoomKeyControlsStub newStub(io.grpc.Channel channel) {
    return new RoomKeyControlsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RoomKeyControlsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RoomKeyControlsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RoomKeyControlsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RoomKeyControlsFutureStub(channel);
  }

  /**
   */
  public static abstract class RoomKeyControlsImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.generated.RoomKeyControls.RoomRequest> roomControlConditions(
        io.grpc.stub.StreamObserver<grpc.generated.RoomKeyControls.RoomConditions> responseObserver) {
      return asyncUnimplementedStreamingCall(getRoomControlConditionsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRoomControlConditionsMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                grpc.generated.RoomKeyControls.RoomRequest,
                grpc.generated.RoomKeyControls.RoomConditions>(
                  this, METHODID_ROOM_CONTROL_CONDITIONS)))
          .build();
    }
  }

  /**
   */
  public static final class RoomKeyControlsStub extends io.grpc.stub.AbstractStub<RoomKeyControlsStub> {
    private RoomKeyControlsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RoomKeyControlsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoomKeyControlsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RoomKeyControlsStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.generated.RoomKeyControls.RoomRequest> roomControlConditions(
        io.grpc.stub.StreamObserver<grpc.generated.RoomKeyControls.RoomConditions> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getRoomControlConditionsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class RoomKeyControlsBlockingStub extends io.grpc.stub.AbstractStub<RoomKeyControlsBlockingStub> {
    private RoomKeyControlsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RoomKeyControlsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoomKeyControlsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RoomKeyControlsBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class RoomKeyControlsFutureStub extends io.grpc.stub.AbstractStub<RoomKeyControlsFutureStub> {
    private RoomKeyControlsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RoomKeyControlsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoomKeyControlsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RoomKeyControlsFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_ROOM_CONTROL_CONDITIONS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RoomKeyControlsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RoomKeyControlsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ROOM_CONTROL_CONDITIONS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.roomControlConditions(
              (io.grpc.stub.StreamObserver<grpc.generated.RoomKeyControls.RoomConditions>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RoomKeyControlsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RoomKeyControlsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.generated.RoomKeyControls.RoomKeyControlsImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RoomKeyControls");
    }
  }

  private static final class RoomKeyControlsFileDescriptorSupplier
      extends RoomKeyControlsBaseDescriptorSupplier {
    RoomKeyControlsFileDescriptorSupplier() {}
  }

  private static final class RoomKeyControlsMethodDescriptorSupplier
      extends RoomKeyControlsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RoomKeyControlsMethodDescriptorSupplier(String methodName) {
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
      synchronized (RoomKeyControlsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RoomKeyControlsFileDescriptorSupplier())
              .addMethod(getRoomControlConditionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
