package com.service;

import com.generated.countryinfo.ListOfContinentsByCode;
import com.generated.countryinfo.ListOfContinentsByCodeResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class CountryInfoService extends WebServiceGatewaySupport {
    public ListOfContinentsByCodeResponse getListOfContinents() {
        ListOfContinentsByCode listOfContinentsByCode = new ListOfContinentsByCode();
        return (ListOfContinentsByCodeResponse) getWebServiceTemplate().marshalSendAndReceive(listOfContinentsByCode);
    }
}
