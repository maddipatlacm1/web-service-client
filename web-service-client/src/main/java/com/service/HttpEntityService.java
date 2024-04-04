package com.service;

import com.customer.com.decos.services.*;
import jakarta.xml.bind.JAXBElement;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class HttpEntityService extends WebServiceGatewaySupport {
    public GetCollectionsResponse getCollections() {
        GetCollections collections = new GetCollections();
        return (GetCollectionsResponse) getWebServiceTemplate().marshalSendAndReceive(collections);
    }

    public GetTokenResponse getToken() {
        GetToken token = new GetToken();
        ObjectFactory factory = new ObjectFactory();
        JAXBElement<String> id = factory.createGetTokenSSystemId("testsystem");
        JAXBElement<String> pwd = factory.createGetTokenSSystemPwd("Decos@123");
        token.setSSystemId(id);
        token.setSSystemPwd(pwd);
        return (GetTokenResponse) getWebServiceTemplate().marshalSendAndReceive(token);
    }
}
