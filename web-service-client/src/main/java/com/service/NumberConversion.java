package com.service;

import com.generated.NumberToWords;
import com.generated.NumberToWordsResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import java.math.BigInteger;

public class NumberConversion extends WebServiceGatewaySupport {
    public NumberToWordsResponse getNumberToWords(Integer number) {
        NumberToWords numberToWords = new NumberToWords();
        numberToWords.setUbiNum(BigInteger.valueOf(number));
        return (NumberToWordsResponse) getWebServiceTemplate().marshalSendAndReceive(numberToWords);
    }
}
