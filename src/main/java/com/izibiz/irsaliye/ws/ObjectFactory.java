//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.13 at 11:06:12 AM EET 
//


package com.izibiz.irsaliye.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.izibiz.irsaliye.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetDespatchAdviceRequest_QNAME = new QName("http://schemas.i2i.com/ei/wsdl", "GetDespatchAdviceRequest");
    private final static QName _GetDespatchAdviceResponse_QNAME = new QName("http://schemas.i2i.com/ei/wsdl", "GetDespatchAdviceResponse");
    private final static QName _GetDespatchAdviceStatusRequest_QNAME = new QName("http://schemas.i2i.com/ei/wsdl", "GetDespatchAdviceStatusRequest");
    private final static QName _GetDespatchAdviceStatusResponse_QNAME = new QName("http://schemas.i2i.com/ei/wsdl", "GetDespatchAdviceStatusResponse");
    private final static QName _GetReceiptAdviceRequest_QNAME = new QName("http://schemas.i2i.com/ei/wsdl", "GetReceiptAdviceRequest");
    private final static QName _GetReceiptAdviceResponse_QNAME = new QName("http://schemas.i2i.com/ei/wsdl", "GetReceiptAdviceResponse");
    private final static QName _GetReceiptAdviceStatusRequest_QNAME = new QName("http://schemas.i2i.com/ei/wsdl", "GetReceiptAdviceStatusRequest");
    private final static QName _GetReceiptAdviceStatusResponse_QNAME = new QName("http://schemas.i2i.com/ei/wsdl", "GetReceiptAdviceStatusResponse");
    private final static QName _LoadDespatchAdviceRequest_QNAME = new QName("http://schemas.i2i.com/ei/wsdl", "LoadDespatchAdviceRequest");
    private final static QName _LoadDespatchAdviceResponse_QNAME = new QName("http://schemas.i2i.com/ei/wsdl", "LoadDespatchAdviceResponse");
    private final static QName _LoadReceiptAdviceRequest_QNAME = new QName("http://schemas.i2i.com/ei/wsdl", "LoadReceiptAdviceRequest");
    private final static QName _LoadReceiptAdviceResponse_QNAME = new QName("http://schemas.i2i.com/ei/wsdl", "LoadReceiptAdviceResponse");
    private final static QName _MarkDespatchAdviceRequest_QNAME = new QName("http://schemas.i2i.com/ei/wsdl", "MarkDespatchAdviceRequest");
    private final static QName _MarkDespatchAdviceResponse_QNAME = new QName("http://schemas.i2i.com/ei/wsdl", "MarkDespatchAdviceResponse");
    private final static QName _MarkReceiptAdviceRequest_QNAME = new QName("http://schemas.i2i.com/ei/wsdl", "MarkReceiptAdviceRequest");
    private final static QName _MarkReceiptAdviceResponse_QNAME = new QName("http://schemas.i2i.com/ei/wsdl", "MarkReceiptAdviceResponse");
    private final static QName _RequestFault_QNAME = new QName("http://schemas.i2i.com/ei/wsdl", "RequestFault");
    private final static QName _SendDespatchAdviceRequest_QNAME = new QName("http://schemas.i2i.com/ei/wsdl", "SendDespatchAdviceRequest");
    private final static QName _SendDespatchAdviceResponse_QNAME = new QName("http://schemas.i2i.com/ei/wsdl", "SendDespatchAdviceResponse");
    private final static QName _SendReceiptAdviceRequest_QNAME = new QName("http://schemas.i2i.com/ei/wsdl", "SendReceiptAdviceRequest");
    private final static QName _SendReceiptAdviceResponse_QNAME = new QName("http://schemas.i2i.com/ei/wsdl", "SendReceiptAdviceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.izibiz.irsaliye.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ENVELOPE }
     * 
     */
    public ENVELOPE createENVELOPE() {
        return new ENVELOPE();
    }

    /**
     * Create an instance of {@link SendReceiptAdviceRequest }
     * 
     */
    public SendReceiptAdviceRequest createSendReceiptAdviceRequest() {
        return new SendReceiptAdviceRequest();
    }

    /**
     * Create an instance of {@link SendDespatchAdviceRequest }
     * 
     */
    public SendDespatchAdviceRequest createSendDespatchAdviceRequest() {
        return new SendDespatchAdviceRequest();
    }

    /**
     * Create an instance of {@link MarkReceiptAdviceRequest }
     * 
     */
    public MarkReceiptAdviceRequest createMarkReceiptAdviceRequest() {
        return new MarkReceiptAdviceRequest();
    }

    /**
     * Create an instance of {@link MarkDespatchAdviceRequest }
     * 
     */
    public MarkDespatchAdviceRequest createMarkDespatchAdviceRequest() {
        return new MarkDespatchAdviceRequest();
    }

    /**
     * Create an instance of {@link GetReceiptAdviceRequest }
     * 
     */
    public GetReceiptAdviceRequest createGetReceiptAdviceRequest() {
        return new GetReceiptAdviceRequest();
    }

    /**
     * Create an instance of {@link GetDespatchAdviceRequest }
     * 
     */
    public GetDespatchAdviceRequest createGetDespatchAdviceRequest() {
        return new GetDespatchAdviceRequest();
    }

    /**
     * Create an instance of {@link Base64Binary }
     * 
     */
    public Base64Binary createBase64Binary() {
        return new Base64Binary();
    }

    /**
     * Create an instance of {@link HexBinary }
     * 
     */
    public HexBinary createHexBinary() {
        return new HexBinary();
    }

    /**
     * Create an instance of {@link GetDespatchAdviceResponse }
     * 
     */
    public GetDespatchAdviceResponse createGetDespatchAdviceResponse() {
        return new GetDespatchAdviceResponse();
    }

    /**
     * Create an instance of {@link GetDespatchAdviceStatusRequest }
     * 
     */
    public GetDespatchAdviceStatusRequest createGetDespatchAdviceStatusRequest() {
        return new GetDespatchAdviceStatusRequest();
    }

    /**
     * Create an instance of {@link GetDespatchAdviceStatusResponse }
     * 
     */
    public GetDespatchAdviceStatusResponse createGetDespatchAdviceStatusResponse() {
        return new GetDespatchAdviceStatusResponse();
    }

    /**
     * Create an instance of {@link GetReceiptAdviceResponse }
     * 
     */
    public GetReceiptAdviceResponse createGetReceiptAdviceResponse() {
        return new GetReceiptAdviceResponse();
    }

    /**
     * Create an instance of {@link GetReceiptAdviceStatusRequest }
     * 
     */
    public GetReceiptAdviceStatusRequest createGetReceiptAdviceStatusRequest() {
        return new GetReceiptAdviceStatusRequest();
    }

    /**
     * Create an instance of {@link GetReceiptAdviceStatusResponse }
     * 
     */
    public GetReceiptAdviceStatusResponse createGetReceiptAdviceStatusResponse() {
        return new GetReceiptAdviceStatusResponse();
    }

    /**
     * Create an instance of {@link LoadDespatchAdviceRequest }
     * 
     */
    public LoadDespatchAdviceRequest createLoadDespatchAdviceRequest() {
        return new LoadDespatchAdviceRequest();
    }

    /**
     * Create an instance of {@link LoadDespatchAdviceResponse }
     * 
     */
    public LoadDespatchAdviceResponse createLoadDespatchAdviceResponse() {
        return new LoadDespatchAdviceResponse();
    }

    /**
     * Create an instance of {@link LoadReceiptAdviceRequest }
     * 
     */
    public LoadReceiptAdviceRequest createLoadReceiptAdviceRequest() {
        return new LoadReceiptAdviceRequest();
    }

    /**
     * Create an instance of {@link LoadReceiptAdviceResponse }
     * 
     */
    public LoadReceiptAdviceResponse createLoadReceiptAdviceResponse() {
        return new LoadReceiptAdviceResponse();
    }

    /**
     * Create an instance of {@link MarkDespatchAdviceResponse }
     * 
     */
    public MarkDespatchAdviceResponse createMarkDespatchAdviceResponse() {
        return new MarkDespatchAdviceResponse();
    }

    /**
     * Create an instance of {@link MarkReceiptAdviceResponse }
     * 
     */
    public MarkReceiptAdviceResponse createMarkReceiptAdviceResponse() {
        return new MarkReceiptAdviceResponse();
    }

    /**
     * Create an instance of {@link REQUESTERRORType }
     * 
     */
    public REQUESTERRORType createREQUESTERRORType() {
        return new REQUESTERRORType();
    }

    /**
     * Create an instance of {@link SendDespatchAdviceResponse }
     * 
     */
    public SendDespatchAdviceResponse createSendDespatchAdviceResponse() {
        return new SendDespatchAdviceResponse();
    }

    /**
     * Create an instance of {@link SendReceiptAdviceResponse }
     * 
     */
    public SendReceiptAdviceResponse createSendReceiptAdviceResponse() {
        return new SendReceiptAdviceResponse();
    }

    /**
     * Create an instance of {@link USERCONTENT }
     * 
     */
    public USERCONTENT createUSERCONTENT() {
        return new USERCONTENT();
    }

    /**
     * Create an instance of {@link DESPATCHADVICE }
     * 
     */
    public DESPATCHADVICE createDESPATCHADVICE() {
        return new DESPATCHADVICE();
    }

    /**
     * Create an instance of {@link DESPATCHADVICEINFO }
     * 
     */
    public DESPATCHADVICEINFO createDESPATCHADVICEINFO() {
        return new DESPATCHADVICEINFO();
    }

    /**
     * Create an instance of {@link DESPATCHADVICEHEADER }
     * 
     */
    public DESPATCHADVICEHEADER createDESPATCHADVICEHEADER() {
        return new DESPATCHADVICEHEADER();
    }

    /**
     * Create an instance of {@link RECEIPTADVICE }
     * 
     */
    public RECEIPTADVICE createRECEIPTADVICE() {
        return new RECEIPTADVICE();
    }

    /**
     * Create an instance of {@link RECEIPTADVICEINFO }
     * 
     */
    public RECEIPTADVICEINFO createRECEIPTADVICEINFO() {
        return new RECEIPTADVICEINFO();
    }

    /**
     * Create an instance of {@link RECEIPTADVICEHEADER }
     * 
     */
    public RECEIPTADVICEHEADER createRECEIPTADVICEHEADER() {
        return new RECEIPTADVICEHEADER();
    }

    /**
     * Create an instance of {@link UserRequest }
     * 
     */
    public UserRequest createUserRequest() {
        return new UserRequest();
    }

    /**
     * Create an instance of {@link UserResponse }
     * 
     */
    public UserResponse createUserResponse() {
        return new UserResponse();
    }

    /**
     * Create an instance of {@link REQUEST }
     * 
     */
    public REQUEST createREQUEST() {
        return new REQUEST();
    }

    /**
     * Create an instance of {@link REQUESTHEADERType }
     * 
     */
    public REQUESTHEADERType createREQUESTHEADERType() {
        return new REQUESTHEADERType();
    }

    /**
     * Create an instance of {@link REQUESTRETURNType }
     * 
     */
    public REQUESTRETURNType createREQUESTRETURNType() {
        return new REQUESTRETURNType();
    }

    /**
     * Create an instance of {@link REQUESTINFOType }
     * 
     */
    public REQUESTINFOType createREQUESTINFOType() {
        return new REQUESTINFOType();
    }

    /**
     * Create an instance of {@link CHANGEINFOType }
     * 
     */
    public CHANGEINFOType createCHANGEINFOType() {
        return new CHANGEINFOType();
    }

    /**
     * Create an instance of {@link ATTRIBUTESTYPE }
     * 
     */
    public ATTRIBUTESTYPE createATTRIBUTESTYPE() {
        return new ATTRIBUTESTYPE();
    }

    /**
     * Create an instance of {@link PARTINFO }
     * 
     */
    public PARTINFO createPARTINFO() {
        return new PARTINFO();
    }

    /**
     * Create an instance of {@link AmountType }
     * 
     */
    public AmountType createAmountType() {
        return new AmountType();
    }

    /**
     * Create an instance of {@link CUSTOMER }
     * 
     */
    public CUSTOMER createCUSTOMER() {
        return new CUSTOMER();
    }

    /**
     * Create an instance of {@link LOVVALUEType }
     * 
     */
    public LOVVALUEType createLOVVALUEType() {
        return new LOVVALUEType();
    }

    /**
     * Create an instance of {@link ENVELOPE.HEADER }
     * 
     */
    public ENVELOPE.HEADER createENVELOPEHEADER() {
        return new ENVELOPE.HEADER();
    }

    /**
     * Create an instance of {@link SendReceiptAdviceRequest.SENDER }
     * 
     */
    public SendReceiptAdviceRequest.SENDER createSendReceiptAdviceRequestSENDER() {
        return new SendReceiptAdviceRequest.SENDER();
    }

    /**
     * Create an instance of {@link SendReceiptAdviceRequest.RECEIVER }
     * 
     */
    public SendReceiptAdviceRequest.RECEIVER createSendReceiptAdviceRequestRECEIVER() {
        return new SendReceiptAdviceRequest.RECEIVER();
    }

    /**
     * Create an instance of {@link SendDespatchAdviceRequest.SENDER }
     * 
     */
    public SendDespatchAdviceRequest.SENDER createSendDespatchAdviceRequestSENDER() {
        return new SendDespatchAdviceRequest.SENDER();
    }

    /**
     * Create an instance of {@link SendDespatchAdviceRequest.RECEIVER }
     * 
     */
    public SendDespatchAdviceRequest.RECEIVER createSendDespatchAdviceRequestRECEIVER() {
        return new SendDespatchAdviceRequest.RECEIVER();
    }

    /**
     * Create an instance of {@link MarkReceiptAdviceRequest.MARK }
     * 
     */
    public MarkReceiptAdviceRequest.MARK createMarkReceiptAdviceRequestMARK() {
        return new MarkReceiptAdviceRequest.MARK();
    }

    /**
     * Create an instance of {@link MarkDespatchAdviceRequest.MARK }
     * 
     */
    public MarkDespatchAdviceRequest.MARK createMarkDespatchAdviceRequestMARK() {
        return new MarkDespatchAdviceRequest.MARK();
    }

    /**
     * Create an instance of {@link GetReceiptAdviceRequest.SEARCHKEY }
     * 
     */
    public GetReceiptAdviceRequest.SEARCHKEY createGetReceiptAdviceRequestSEARCHKEY() {
        return new GetReceiptAdviceRequest.SEARCHKEY();
    }

    /**
     * Create an instance of {@link GetDespatchAdviceRequest.SEARCHKEY }
     * 
     */
    public GetDespatchAdviceRequest.SEARCHKEY createGetDespatchAdviceRequestSEARCHKEY() {
        return new GetDespatchAdviceRequest.SEARCHKEY();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDespatchAdviceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.i2i.com/ei/wsdl", name = "GetDespatchAdviceRequest")
    public JAXBElement<GetDespatchAdviceRequest> createGetDespatchAdviceRequest(GetDespatchAdviceRequest value) {
        return new JAXBElement<GetDespatchAdviceRequest>(_GetDespatchAdviceRequest_QNAME, GetDespatchAdviceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDespatchAdviceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.i2i.com/ei/wsdl", name = "GetDespatchAdviceResponse")
    public JAXBElement<GetDespatchAdviceResponse> createGetDespatchAdviceResponse(GetDespatchAdviceResponse value) {
        return new JAXBElement<GetDespatchAdviceResponse>(_GetDespatchAdviceResponse_QNAME, GetDespatchAdviceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDespatchAdviceStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.i2i.com/ei/wsdl", name = "GetDespatchAdviceStatusRequest")
    public JAXBElement<GetDespatchAdviceStatusRequest> createGetDespatchAdviceStatusRequest(GetDespatchAdviceStatusRequest value) {
        return new JAXBElement<GetDespatchAdviceStatusRequest>(_GetDespatchAdviceStatusRequest_QNAME, GetDespatchAdviceStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDespatchAdviceStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.i2i.com/ei/wsdl", name = "GetDespatchAdviceStatusResponse")
    public JAXBElement<GetDespatchAdviceStatusResponse> createGetDespatchAdviceStatusResponse(GetDespatchAdviceStatusResponse value) {
        return new JAXBElement<GetDespatchAdviceStatusResponse>(_GetDespatchAdviceStatusResponse_QNAME, GetDespatchAdviceStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReceiptAdviceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.i2i.com/ei/wsdl", name = "GetReceiptAdviceRequest")
    public JAXBElement<GetReceiptAdviceRequest> createGetReceiptAdviceRequest(GetReceiptAdviceRequest value) {
        return new JAXBElement<GetReceiptAdviceRequest>(_GetReceiptAdviceRequest_QNAME, GetReceiptAdviceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReceiptAdviceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.i2i.com/ei/wsdl", name = "GetReceiptAdviceResponse")
    public JAXBElement<GetReceiptAdviceResponse> createGetReceiptAdviceResponse(GetReceiptAdviceResponse value) {
        return new JAXBElement<GetReceiptAdviceResponse>(_GetReceiptAdviceResponse_QNAME, GetReceiptAdviceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReceiptAdviceStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.i2i.com/ei/wsdl", name = "GetReceiptAdviceStatusRequest")
    public JAXBElement<GetReceiptAdviceStatusRequest> createGetReceiptAdviceStatusRequest(GetReceiptAdviceStatusRequest value) {
        return new JAXBElement<GetReceiptAdviceStatusRequest>(_GetReceiptAdviceStatusRequest_QNAME, GetReceiptAdviceStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReceiptAdviceStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.i2i.com/ei/wsdl", name = "GetReceiptAdviceStatusResponse")
    public JAXBElement<GetReceiptAdviceStatusResponse> createGetReceiptAdviceStatusResponse(GetReceiptAdviceStatusResponse value) {
        return new JAXBElement<GetReceiptAdviceStatusResponse>(_GetReceiptAdviceStatusResponse_QNAME, GetReceiptAdviceStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadDespatchAdviceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.i2i.com/ei/wsdl", name = "LoadDespatchAdviceRequest")
    public JAXBElement<LoadDespatchAdviceRequest> createLoadDespatchAdviceRequest(LoadDespatchAdviceRequest value) {
        return new JAXBElement<LoadDespatchAdviceRequest>(_LoadDespatchAdviceRequest_QNAME, LoadDespatchAdviceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadDespatchAdviceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.i2i.com/ei/wsdl", name = "LoadDespatchAdviceResponse")
    public JAXBElement<LoadDespatchAdviceResponse> createLoadDespatchAdviceResponse(LoadDespatchAdviceResponse value) {
        return new JAXBElement<LoadDespatchAdviceResponse>(_LoadDespatchAdviceResponse_QNAME, LoadDespatchAdviceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadReceiptAdviceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.i2i.com/ei/wsdl", name = "LoadReceiptAdviceRequest")
    public JAXBElement<LoadReceiptAdviceRequest> createLoadReceiptAdviceRequest(LoadReceiptAdviceRequest value) {
        return new JAXBElement<LoadReceiptAdviceRequest>(_LoadReceiptAdviceRequest_QNAME, LoadReceiptAdviceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadReceiptAdviceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.i2i.com/ei/wsdl", name = "LoadReceiptAdviceResponse")
    public JAXBElement<LoadReceiptAdviceResponse> createLoadReceiptAdviceResponse(LoadReceiptAdviceResponse value) {
        return new JAXBElement<LoadReceiptAdviceResponse>(_LoadReceiptAdviceResponse_QNAME, LoadReceiptAdviceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkDespatchAdviceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.i2i.com/ei/wsdl", name = "MarkDespatchAdviceRequest")
    public JAXBElement<MarkDespatchAdviceRequest> createMarkDespatchAdviceRequest(MarkDespatchAdviceRequest value) {
        return new JAXBElement<MarkDespatchAdviceRequest>(_MarkDespatchAdviceRequest_QNAME, MarkDespatchAdviceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkDespatchAdviceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.i2i.com/ei/wsdl", name = "MarkDespatchAdviceResponse")
    public JAXBElement<MarkDespatchAdviceResponse> createMarkDespatchAdviceResponse(MarkDespatchAdviceResponse value) {
        return new JAXBElement<MarkDespatchAdviceResponse>(_MarkDespatchAdviceResponse_QNAME, MarkDespatchAdviceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkReceiptAdviceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.i2i.com/ei/wsdl", name = "MarkReceiptAdviceRequest")
    public JAXBElement<MarkReceiptAdviceRequest> createMarkReceiptAdviceRequest(MarkReceiptAdviceRequest value) {
        return new JAXBElement<MarkReceiptAdviceRequest>(_MarkReceiptAdviceRequest_QNAME, MarkReceiptAdviceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkReceiptAdviceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.i2i.com/ei/wsdl", name = "MarkReceiptAdviceResponse")
    public JAXBElement<MarkReceiptAdviceResponse> createMarkReceiptAdviceResponse(MarkReceiptAdviceResponse value) {
        return new JAXBElement<MarkReceiptAdviceResponse>(_MarkReceiptAdviceResponse_QNAME, MarkReceiptAdviceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REQUESTERRORType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.i2i.com/ei/wsdl", name = "RequestFault")
    public JAXBElement<REQUESTERRORType> createRequestFault(REQUESTERRORType value) {
        return new JAXBElement<REQUESTERRORType>(_RequestFault_QNAME, REQUESTERRORType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendDespatchAdviceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.i2i.com/ei/wsdl", name = "SendDespatchAdviceRequest")
    public JAXBElement<SendDespatchAdviceRequest> createSendDespatchAdviceRequest(SendDespatchAdviceRequest value) {
        return new JAXBElement<SendDespatchAdviceRequest>(_SendDespatchAdviceRequest_QNAME, SendDespatchAdviceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendDespatchAdviceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.i2i.com/ei/wsdl", name = "SendDespatchAdviceResponse")
    public JAXBElement<SendDespatchAdviceResponse> createSendDespatchAdviceResponse(SendDespatchAdviceResponse value) {
        return new JAXBElement<SendDespatchAdviceResponse>(_SendDespatchAdviceResponse_QNAME, SendDespatchAdviceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendReceiptAdviceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.i2i.com/ei/wsdl", name = "SendReceiptAdviceRequest")
    public JAXBElement<SendReceiptAdviceRequest> createSendReceiptAdviceRequest(SendReceiptAdviceRequest value) {
        return new JAXBElement<SendReceiptAdviceRequest>(_SendReceiptAdviceRequest_QNAME, SendReceiptAdviceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendReceiptAdviceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.i2i.com/ei/wsdl", name = "SendReceiptAdviceResponse")
    public JAXBElement<SendReceiptAdviceResponse> createSendReceiptAdviceResponse(SendReceiptAdviceResponse value) {
        return new JAXBElement<SendReceiptAdviceResponse>(_SendReceiptAdviceResponse_QNAME, SendReceiptAdviceResponse.class, null, value);
    }

}
