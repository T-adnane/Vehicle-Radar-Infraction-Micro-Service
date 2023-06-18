package miaad.sd.immatriculationservice.webServices.grpc;

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
    comments = "Source: proprietaire.proto")
public final class ProprietaireGrpcServiceGrpc {

  private ProprietaireGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "ProprietaireGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetProprietaireRequest,
      miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetProprietaireResponse> getGetProprietaireMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProprietaire",
      requestType = miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetProprietaireRequest.class,
      responseType = miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetProprietaireResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetProprietaireRequest,
      miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetProprietaireResponse> getGetProprietaireMethod() {
    io.grpc.MethodDescriptor<miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetProprietaireRequest, miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetProprietaireResponse> getGetProprietaireMethod;
    if ((getGetProprietaireMethod = ProprietaireGrpcServiceGrpc.getGetProprietaireMethod) == null) {
      synchronized (ProprietaireGrpcServiceGrpc.class) {
        if ((getGetProprietaireMethod = ProprietaireGrpcServiceGrpc.getGetProprietaireMethod) == null) {
          ProprietaireGrpcServiceGrpc.getGetProprietaireMethod = getGetProprietaireMethod = 
              io.grpc.MethodDescriptor.<miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetProprietaireRequest, miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetProprietaireResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ProprietaireGrpcService", "getProprietaire"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetProprietaireRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetProprietaireResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProprietaireGrpcServiceMethodDescriptorSupplier("getProprietaire"))
                  .build();
          }
        }
     }
     return getGetProprietaireMethod;
  }

  private static volatile io.grpc.MethodDescriptor<miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetAllProprietairesRequest,
      miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetAllProprietairesResponse> getListProprietairesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listProprietaires",
      requestType = miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetAllProprietairesRequest.class,
      responseType = miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetAllProprietairesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetAllProprietairesRequest,
      miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetAllProprietairesResponse> getListProprietairesMethod() {
    io.grpc.MethodDescriptor<miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetAllProprietairesRequest, miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetAllProprietairesResponse> getListProprietairesMethod;
    if ((getListProprietairesMethod = ProprietaireGrpcServiceGrpc.getListProprietairesMethod) == null) {
      synchronized (ProprietaireGrpcServiceGrpc.class) {
        if ((getListProprietairesMethod = ProprietaireGrpcServiceGrpc.getListProprietairesMethod) == null) {
          ProprietaireGrpcServiceGrpc.getListProprietairesMethod = getListProprietairesMethod = 
              io.grpc.MethodDescriptor.<miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetAllProprietairesRequest, miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetAllProprietairesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ProprietaireGrpcService", "listProprietaires"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetAllProprietairesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetAllProprietairesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProprietaireGrpcServiceMethodDescriptorSupplier("listProprietaires"))
                  .build();
          }
        }
     }
     return getListProprietairesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.SaveProprietaireRequest,
      miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.SaveProprietaireResponse> getSaveProprietaireMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveProprietaire",
      requestType = miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.SaveProprietaireRequest.class,
      responseType = miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.SaveProprietaireResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.SaveProprietaireRequest,
      miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.SaveProprietaireResponse> getSaveProprietaireMethod() {
    io.grpc.MethodDescriptor<miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.SaveProprietaireRequest, miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.SaveProprietaireResponse> getSaveProprietaireMethod;
    if ((getSaveProprietaireMethod = ProprietaireGrpcServiceGrpc.getSaveProprietaireMethod) == null) {
      synchronized (ProprietaireGrpcServiceGrpc.class) {
        if ((getSaveProprietaireMethod = ProprietaireGrpcServiceGrpc.getSaveProprietaireMethod) == null) {
          ProprietaireGrpcServiceGrpc.getSaveProprietaireMethod = getSaveProprietaireMethod = 
              io.grpc.MethodDescriptor.<miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.SaveProprietaireRequest, miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.SaveProprietaireResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ProprietaireGrpcService", "saveProprietaire"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.SaveProprietaireRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.SaveProprietaireResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProprietaireGrpcServiceMethodDescriptorSupplier("saveProprietaire"))
                  .build();
          }
        }
     }
     return getSaveProprietaireMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProprietaireGrpcServiceStub newStub(io.grpc.Channel channel) {
    return new ProprietaireGrpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProprietaireGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProprietaireGrpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProprietaireGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProprietaireGrpcServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ProprietaireGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getProprietaire(miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetProprietaireRequest request,
        io.grpc.stub.StreamObserver<miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetProprietaireResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProprietaireMethod(), responseObserver);
    }

    /**
     */
    public void listProprietaires(miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetAllProprietairesRequest request,
        io.grpc.stub.StreamObserver<miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetAllProprietairesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListProprietairesMethod(), responseObserver);
    }

    /**
     */
    public void saveProprietaire(miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.SaveProprietaireRequest request,
        io.grpc.stub.StreamObserver<miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.SaveProprietaireResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveProprietaireMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProprietaireMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetProprietaireRequest,
                miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetProprietaireResponse>(
                  this, METHODID_GET_PROPRIETAIRE)))
          .addMethod(
            getListProprietairesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetAllProprietairesRequest,
                miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetAllProprietairesResponse>(
                  this, METHODID_LIST_PROPRIETAIRES)))
          .addMethod(
            getSaveProprietaireMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.SaveProprietaireRequest,
                miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.SaveProprietaireResponse>(
                  this, METHODID_SAVE_PROPRIETAIRE)))
          .build();
    }
  }

  /**
   */
  public static final class ProprietaireGrpcServiceStub extends io.grpc.stub.AbstractStub<ProprietaireGrpcServiceStub> {
    private ProprietaireGrpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProprietaireGrpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProprietaireGrpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProprietaireGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void getProprietaire(miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetProprietaireRequest request,
        io.grpc.stub.StreamObserver<miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetProprietaireResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProprietaireMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listProprietaires(miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetAllProprietairesRequest request,
        io.grpc.stub.StreamObserver<miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetAllProprietairesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListProprietairesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveProprietaire(miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.SaveProprietaireRequest request,
        io.grpc.stub.StreamObserver<miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.SaveProprietaireResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveProprietaireMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProprietaireGrpcServiceBlockingStub extends io.grpc.stub.AbstractStub<ProprietaireGrpcServiceBlockingStub> {
    private ProprietaireGrpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProprietaireGrpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProprietaireGrpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProprietaireGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetProprietaireResponse getProprietaire(miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetProprietaireRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProprietaireMethod(), getCallOptions(), request);
    }

    /**
     */
    public miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetAllProprietairesResponse listProprietaires(miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetAllProprietairesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListProprietairesMethod(), getCallOptions(), request);
    }

    /**
     */
    public miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.SaveProprietaireResponse saveProprietaire(miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.SaveProprietaireRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveProprietaireMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProprietaireGrpcServiceFutureStub extends io.grpc.stub.AbstractStub<ProprietaireGrpcServiceFutureStub> {
    private ProprietaireGrpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProprietaireGrpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProprietaireGrpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProprietaireGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetProprietaireResponse> getProprietaire(
        miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetProprietaireRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProprietaireMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetAllProprietairesResponse> listProprietaires(
        miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetAllProprietairesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListProprietairesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.SaveProprietaireResponse> saveProprietaire(
        miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.SaveProprietaireRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveProprietaireMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PROPRIETAIRE = 0;
  private static final int METHODID_LIST_PROPRIETAIRES = 1;
  private static final int METHODID_SAVE_PROPRIETAIRE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProprietaireGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProprietaireGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PROPRIETAIRE:
          serviceImpl.getProprietaire((miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetProprietaireRequest) request,
              (io.grpc.stub.StreamObserver<miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetProprietaireResponse>) responseObserver);
          break;
        case METHODID_LIST_PROPRIETAIRES:
          serviceImpl.listProprietaires((miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetAllProprietairesRequest) request,
              (io.grpc.stub.StreamObserver<miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.GetAllProprietairesResponse>) responseObserver);
          break;
        case METHODID_SAVE_PROPRIETAIRE:
          serviceImpl.saveProprietaire((miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.SaveProprietaireRequest) request,
              (io.grpc.stub.StreamObserver<miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.SaveProprietaireResponse>) responseObserver);
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

  private static abstract class ProprietaireGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProprietaireGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return miaad.sd.immatriculationservice.webServices.grpc.ProprietaireOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProprietaireGrpcService");
    }
  }

  private static final class ProprietaireGrpcServiceFileDescriptorSupplier
      extends ProprietaireGrpcServiceBaseDescriptorSupplier {
    ProprietaireGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class ProprietaireGrpcServiceMethodDescriptorSupplier
      extends ProprietaireGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProprietaireGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProprietaireGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProprietaireGrpcServiceFileDescriptorSupplier())
              .addMethod(getGetProprietaireMethod())
              .addMethod(getListProprietairesMethod())
              .addMethod(getSaveProprietaireMethod())
              .build();
        }
      }
    }
    return result;
  }
}
