package grpc.generated.RoomStatus;

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
    comments = "Source: RoomStatus.proto")
public final class RoomStatusGrpc {

  private RoomStatusGrpc() {}

  public static final String SERVICE_NAME = "RoomStatus.RoomStatus";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.generated.RoomStatus.StatusRequest,
      grpc.generated.RoomStatus.BedUpdate> getStreamBedStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamBedStatus",
      requestType = grpc.generated.RoomStatus.StatusRequest.class,
      responseType = grpc.generated.RoomStatus.BedUpdate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.generated.RoomStatus.StatusRequest,
      grpc.generated.RoomStatus.BedUpdate> getStreamBedStatusMethod() {
    io.grpc.MethodDescriptor<grpc.generated.RoomStatus.StatusRequest, grpc.generated.RoomStatus.BedUpdate> getStreamBedStatusMethod;
    if ((getStreamBedStatusMethod = RoomStatusGrpc.getStreamBedStatusMethod) == null) {
      synchronized (RoomStatusGrpc.class) {
        if ((getStreamBedStatusMethod = RoomStatusGrpc.getStreamBedStatusMethod) == null) {
          RoomStatusGrpc.getStreamBedStatusMethod = getStreamBedStatusMethod = 
              io.grpc.MethodDescriptor.<grpc.generated.RoomStatus.StatusRequest, grpc.generated.RoomStatus.BedUpdate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "RoomStatus.RoomStatus", "StreamBedStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.generated.RoomStatus.StatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.generated.RoomStatus.BedUpdate.getDefaultInstance()))
                  .setSchemaDescriptor(new RoomStatusMethodDescriptorSupplier("StreamBedStatus"))
                  .build();
          }
        }
     }
     return getStreamBedStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RoomStatusStub newStub(io.grpc.Channel channel) {
    return new RoomStatusStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RoomStatusBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RoomStatusBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RoomStatusFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RoomStatusFutureStub(channel);
  }

  /**
   */
  public static abstract class RoomStatusImplBase implements io.grpc.BindableService {

    /**
     */
    public void streamBedStatus(grpc.generated.RoomStatus.StatusRequest request,
        io.grpc.stub.StreamObserver<grpc.generated.RoomStatus.BedUpdate> responseObserver) {
      asyncUnimplementedUnaryCall(getStreamBedStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStreamBedStatusMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.generated.RoomStatus.StatusRequest,
                grpc.generated.RoomStatus.BedUpdate>(
                  this, METHODID_STREAM_BED_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class RoomStatusStub extends io.grpc.stub.AbstractStub<RoomStatusStub> {
    private RoomStatusStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RoomStatusStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoomStatusStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RoomStatusStub(channel, callOptions);
    }

    /**
     */
    public void streamBedStatus(grpc.generated.RoomStatus.StatusRequest request,
        io.grpc.stub.StreamObserver<grpc.generated.RoomStatus.BedUpdate> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getStreamBedStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RoomStatusBlockingStub extends io.grpc.stub.AbstractStub<RoomStatusBlockingStub> {
    private RoomStatusBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RoomStatusBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoomStatusBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RoomStatusBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<grpc.generated.RoomStatus.BedUpdate> streamBedStatus(
        grpc.generated.RoomStatus.StatusRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getStreamBedStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RoomStatusFutureStub extends io.grpc.stub.AbstractStub<RoomStatusFutureStub> {
    private RoomStatusFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RoomStatusFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoomStatusFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RoomStatusFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_STREAM_BED_STATUS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RoomStatusImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RoomStatusImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STREAM_BED_STATUS:
          serviceImpl.streamBedStatus((grpc.generated.RoomStatus.StatusRequest) request,
              (io.grpc.stub.StreamObserver<grpc.generated.RoomStatus.BedUpdate>) responseObserver);
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

  private static abstract class RoomStatusBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RoomStatusBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.generated.RoomStatus.RoomStatusImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RoomStatus");
    }
  }

  private static final class RoomStatusFileDescriptorSupplier
      extends RoomStatusBaseDescriptorSupplier {
    RoomStatusFileDescriptorSupplier() {}
  }

  private static final class RoomStatusMethodDescriptorSupplier
      extends RoomStatusBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RoomStatusMethodDescriptorSupplier(String methodName) {
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
      synchronized (RoomStatusGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RoomStatusFileDescriptorSupplier())
              .addMethod(getStreamBedStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
