package grpc.generated.PatientsRoomControl;

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
    comments = "Source: PatientsRoomControl.proto")
public final class PatientsRoomControlGrpc {

  private PatientsRoomControlGrpc() {}

  public static final String SERVICE_NAME = "PatientsRoomControl.PatientsRoomControl";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.generated.PatientsRoomControl.LightRequest,
      grpc.generated.PatientsRoomControl.LightResponse> getLightControlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LightControl",
      requestType = grpc.generated.PatientsRoomControl.LightRequest.class,
      responseType = grpc.generated.PatientsRoomControl.LightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.generated.PatientsRoomControl.LightRequest,
      grpc.generated.PatientsRoomControl.LightResponse> getLightControlMethod() {
    io.grpc.MethodDescriptor<grpc.generated.PatientsRoomControl.LightRequest, grpc.generated.PatientsRoomControl.LightResponse> getLightControlMethod;
    if ((getLightControlMethod = PatientsRoomControlGrpc.getLightControlMethod) == null) {
      synchronized (PatientsRoomControlGrpc.class) {
        if ((getLightControlMethod = PatientsRoomControlGrpc.getLightControlMethod) == null) {
          PatientsRoomControlGrpc.getLightControlMethod = getLightControlMethod = 
              io.grpc.MethodDescriptor.<grpc.generated.PatientsRoomControl.LightRequest, grpc.generated.PatientsRoomControl.LightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PatientsRoomControl.PatientsRoomControl", "LightControl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.generated.PatientsRoomControl.LightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.generated.PatientsRoomControl.LightResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PatientsRoomControlMethodDescriptorSupplier("LightControl"))
                  .build();
          }
        }
     }
     return getLightControlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.generated.PatientsRoomControl.HeightRequest,
      grpc.generated.PatientsRoomControl.HeightResponse> getBedHeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BedHeight",
      requestType = grpc.generated.PatientsRoomControl.HeightRequest.class,
      responseType = grpc.generated.PatientsRoomControl.HeightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.generated.PatientsRoomControl.HeightRequest,
      grpc.generated.PatientsRoomControl.HeightResponse> getBedHeightMethod() {
    io.grpc.MethodDescriptor<grpc.generated.PatientsRoomControl.HeightRequest, grpc.generated.PatientsRoomControl.HeightResponse> getBedHeightMethod;
    if ((getBedHeightMethod = PatientsRoomControlGrpc.getBedHeightMethod) == null) {
      synchronized (PatientsRoomControlGrpc.class) {
        if ((getBedHeightMethod = PatientsRoomControlGrpc.getBedHeightMethod) == null) {
          PatientsRoomControlGrpc.getBedHeightMethod = getBedHeightMethod = 
              io.grpc.MethodDescriptor.<grpc.generated.PatientsRoomControl.HeightRequest, grpc.generated.PatientsRoomControl.HeightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PatientsRoomControl.PatientsRoomControl", "BedHeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.generated.PatientsRoomControl.HeightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.generated.PatientsRoomControl.HeightResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PatientsRoomControlMethodDescriptorSupplier("BedHeight"))
                  .build();
          }
        }
     }
     return getBedHeightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.generated.PatientsRoomControl.GapRequest,
      grpc.generated.PatientsRoomControl.GapResponse> getCourtainsGapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CourtainsGap",
      requestType = grpc.generated.PatientsRoomControl.GapRequest.class,
      responseType = grpc.generated.PatientsRoomControl.GapResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.generated.PatientsRoomControl.GapRequest,
      grpc.generated.PatientsRoomControl.GapResponse> getCourtainsGapMethod() {
    io.grpc.MethodDescriptor<grpc.generated.PatientsRoomControl.GapRequest, grpc.generated.PatientsRoomControl.GapResponse> getCourtainsGapMethod;
    if ((getCourtainsGapMethod = PatientsRoomControlGrpc.getCourtainsGapMethod) == null) {
      synchronized (PatientsRoomControlGrpc.class) {
        if ((getCourtainsGapMethod = PatientsRoomControlGrpc.getCourtainsGapMethod) == null) {
          PatientsRoomControlGrpc.getCourtainsGapMethod = getCourtainsGapMethod = 
              io.grpc.MethodDescriptor.<grpc.generated.PatientsRoomControl.GapRequest, grpc.generated.PatientsRoomControl.GapResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PatientsRoomControl.PatientsRoomControl", "CourtainsGap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.generated.PatientsRoomControl.GapRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.generated.PatientsRoomControl.GapResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PatientsRoomControlMethodDescriptorSupplier("CourtainsGap"))
                  .build();
          }
        }
     }
     return getCourtainsGapMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PatientsRoomControlStub newStub(io.grpc.Channel channel) {
    return new PatientsRoomControlStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PatientsRoomControlBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PatientsRoomControlBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PatientsRoomControlFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PatientsRoomControlFutureStub(channel);
  }

  /**
   */
  public static abstract class PatientsRoomControlImplBase implements io.grpc.BindableService {

    /**
     */
    public void lightControl(grpc.generated.PatientsRoomControl.LightRequest request,
        io.grpc.stub.StreamObserver<grpc.generated.PatientsRoomControl.LightResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLightControlMethod(), responseObserver);
    }

    /**
     */
    public void bedHeight(grpc.generated.PatientsRoomControl.HeightRequest request,
        io.grpc.stub.StreamObserver<grpc.generated.PatientsRoomControl.HeightResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBedHeightMethod(), responseObserver);
    }

    /**
     */
    public void courtainsGap(grpc.generated.PatientsRoomControl.GapRequest request,
        io.grpc.stub.StreamObserver<grpc.generated.PatientsRoomControl.GapResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCourtainsGapMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLightControlMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.generated.PatientsRoomControl.LightRequest,
                grpc.generated.PatientsRoomControl.LightResponse>(
                  this, METHODID_LIGHT_CONTROL)))
          .addMethod(
            getBedHeightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.generated.PatientsRoomControl.HeightRequest,
                grpc.generated.PatientsRoomControl.HeightResponse>(
                  this, METHODID_BED_HEIGHT)))
          .addMethod(
            getCourtainsGapMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.generated.PatientsRoomControl.GapRequest,
                grpc.generated.PatientsRoomControl.GapResponse>(
                  this, METHODID_COURTAINS_GAP)))
          .build();
    }
  }

  /**
   */
  public static final class PatientsRoomControlStub extends io.grpc.stub.AbstractStub<PatientsRoomControlStub> {
    private PatientsRoomControlStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PatientsRoomControlStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientsRoomControlStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PatientsRoomControlStub(channel, callOptions);
    }

    /**
     */
    public void lightControl(grpc.generated.PatientsRoomControl.LightRequest request,
        io.grpc.stub.StreamObserver<grpc.generated.PatientsRoomControl.LightResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLightControlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bedHeight(grpc.generated.PatientsRoomControl.HeightRequest request,
        io.grpc.stub.StreamObserver<grpc.generated.PatientsRoomControl.HeightResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBedHeightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void courtainsGap(grpc.generated.PatientsRoomControl.GapRequest request,
        io.grpc.stub.StreamObserver<grpc.generated.PatientsRoomControl.GapResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCourtainsGapMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PatientsRoomControlBlockingStub extends io.grpc.stub.AbstractStub<PatientsRoomControlBlockingStub> {
    private PatientsRoomControlBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PatientsRoomControlBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientsRoomControlBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PatientsRoomControlBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.generated.PatientsRoomControl.LightResponse lightControl(grpc.generated.PatientsRoomControl.LightRequest request) {
      return blockingUnaryCall(
          getChannel(), getLightControlMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.generated.PatientsRoomControl.HeightResponse bedHeight(grpc.generated.PatientsRoomControl.HeightRequest request) {
      return blockingUnaryCall(
          getChannel(), getBedHeightMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.generated.PatientsRoomControl.GapResponse courtainsGap(grpc.generated.PatientsRoomControl.GapRequest request) {
      return blockingUnaryCall(
          getChannel(), getCourtainsGapMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PatientsRoomControlFutureStub extends io.grpc.stub.AbstractStub<PatientsRoomControlFutureStub> {
    private PatientsRoomControlFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PatientsRoomControlFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientsRoomControlFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PatientsRoomControlFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.generated.PatientsRoomControl.LightResponse> lightControl(
        grpc.generated.PatientsRoomControl.LightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLightControlMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.generated.PatientsRoomControl.HeightResponse> bedHeight(
        grpc.generated.PatientsRoomControl.HeightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBedHeightMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.generated.PatientsRoomControl.GapResponse> courtainsGap(
        grpc.generated.PatientsRoomControl.GapRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCourtainsGapMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIGHT_CONTROL = 0;
  private static final int METHODID_BED_HEIGHT = 1;
  private static final int METHODID_COURTAINS_GAP = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PatientsRoomControlImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PatientsRoomControlImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIGHT_CONTROL:
          serviceImpl.lightControl((grpc.generated.PatientsRoomControl.LightRequest) request,
              (io.grpc.stub.StreamObserver<grpc.generated.PatientsRoomControl.LightResponse>) responseObserver);
          break;
        case METHODID_BED_HEIGHT:
          serviceImpl.bedHeight((grpc.generated.PatientsRoomControl.HeightRequest) request,
              (io.grpc.stub.StreamObserver<grpc.generated.PatientsRoomControl.HeightResponse>) responseObserver);
          break;
        case METHODID_COURTAINS_GAP:
          serviceImpl.courtainsGap((grpc.generated.PatientsRoomControl.GapRequest) request,
              (io.grpc.stub.StreamObserver<grpc.generated.PatientsRoomControl.GapResponse>) responseObserver);
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

  private static abstract class PatientsRoomControlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PatientsRoomControlBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.generated.PatientsRoomControl.PatientsRoomControlImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PatientsRoomControl");
    }
  }

  private static final class PatientsRoomControlFileDescriptorSupplier
      extends PatientsRoomControlBaseDescriptorSupplier {
    PatientsRoomControlFileDescriptorSupplier() {}
  }

  private static final class PatientsRoomControlMethodDescriptorSupplier
      extends PatientsRoomControlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PatientsRoomControlMethodDescriptorSupplier(String methodName) {
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
      synchronized (PatientsRoomControlGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PatientsRoomControlFileDescriptorSupplier())
              .addMethod(getLightControlMethod())
              .addMethod(getBedHeightMethod())
              .addMethod(getCourtainsGapMethod())
              .build();
        }
      }
    }
    return result;
  }
}
