package grpc.generated.SmartMonitor;

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
    comments = "Source: SmartMonitor.proto")
public final class SmartMonitorGrpc {

  private SmartMonitorGrpc() {}

  public static final String SERVICE_NAME = "SmartMonitor.SmartMonitor";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.generated.SmartMonitor.PatientData,
      grpc.generated.SmartMonitor.Validation> getSmartPatientMonitorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SmartPatientMonitor",
      requestType = grpc.generated.SmartMonitor.PatientData.class,
      responseType = grpc.generated.SmartMonitor.Validation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.generated.SmartMonitor.PatientData,
      grpc.generated.SmartMonitor.Validation> getSmartPatientMonitorMethod() {
    io.grpc.MethodDescriptor<grpc.generated.SmartMonitor.PatientData, grpc.generated.SmartMonitor.Validation> getSmartPatientMonitorMethod;
    if ((getSmartPatientMonitorMethod = SmartMonitorGrpc.getSmartPatientMonitorMethod) == null) {
      synchronized (SmartMonitorGrpc.class) {
        if ((getSmartPatientMonitorMethod = SmartMonitorGrpc.getSmartPatientMonitorMethod) == null) {
          SmartMonitorGrpc.getSmartPatientMonitorMethod = getSmartPatientMonitorMethod = 
              io.grpc.MethodDescriptor.<grpc.generated.SmartMonitor.PatientData, grpc.generated.SmartMonitor.Validation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartMonitor.SmartMonitor", "SmartPatientMonitor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.generated.SmartMonitor.PatientData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.generated.SmartMonitor.Validation.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartMonitorMethodDescriptorSupplier("SmartPatientMonitor"))
                  .build();
          }
        }
     }
     return getSmartPatientMonitorMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartMonitorStub newStub(io.grpc.Channel channel) {
    return new SmartMonitorStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartMonitorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SmartMonitorBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartMonitorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SmartMonitorFutureStub(channel);
  }

  /**
   */
  public static abstract class SmartMonitorImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.generated.SmartMonitor.PatientData> smartPatientMonitor(
        io.grpc.stub.StreamObserver<grpc.generated.SmartMonitor.Validation> responseObserver) {
      return asyncUnimplementedStreamingCall(getSmartPatientMonitorMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSmartPatientMonitorMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.generated.SmartMonitor.PatientData,
                grpc.generated.SmartMonitor.Validation>(
                  this, METHODID_SMART_PATIENT_MONITOR)))
          .build();
    }
  }

  /**
   */
  public static final class SmartMonitorStub extends io.grpc.stub.AbstractStub<SmartMonitorStub> {
    private SmartMonitorStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartMonitorStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartMonitorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartMonitorStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.generated.SmartMonitor.PatientData> smartPatientMonitor(
        io.grpc.stub.StreamObserver<grpc.generated.SmartMonitor.Validation> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSmartPatientMonitorMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class SmartMonitorBlockingStub extends io.grpc.stub.AbstractStub<SmartMonitorBlockingStub> {
    private SmartMonitorBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartMonitorBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartMonitorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartMonitorBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class SmartMonitorFutureStub extends io.grpc.stub.AbstractStub<SmartMonitorFutureStub> {
    private SmartMonitorFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartMonitorFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartMonitorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartMonitorFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SMART_PATIENT_MONITOR = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmartMonitorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmartMonitorImplBase serviceImpl, int methodId) {
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
        case METHODID_SMART_PATIENT_MONITOR:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.smartPatientMonitor(
              (io.grpc.stub.StreamObserver<grpc.generated.SmartMonitor.Validation>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SmartMonitorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartMonitorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.generated.SmartMonitor.SmartMonitorImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartMonitor");
    }
  }

  private static final class SmartMonitorFileDescriptorSupplier
      extends SmartMonitorBaseDescriptorSupplier {
    SmartMonitorFileDescriptorSupplier() {}
  }

  private static final class SmartMonitorMethodDescriptorSupplier
      extends SmartMonitorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmartMonitorMethodDescriptorSupplier(String methodName) {
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
      synchronized (SmartMonitorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartMonitorFileDescriptorSupplier())
              .addMethod(getSmartPatientMonitorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
