package com.controller;

import com.customer.com.decos.services.GetTokenResponse;
import com.generated.NumberToWordsResponse;
import com.generated.countryinfo.ListOfContinentsByCodeResponse;
import com.service.CountryInfoService;
import com.service.HttpEntityService;
import com.service.NumberConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/webservice")
public class WebServiceController {

    @Autowired
    NumberConversion numberConversion;

    @Autowired
    CountryInfoService countryInfoService;

    @Autowired
    HttpEntityService entityService;

    @GetMapping("/{number}")
    public String get(@PathVariable Integer number) {
        NumberToWordsResponse response = numberConversion.getNumberToWords(number);
        return response.getNumberToWordsResult();
    }

    @GetMapping(value = "/continents", produces = MediaType.APPLICATION_JSON_VALUE)
    public ListOfContinentsByCodeResponse listAllContinents() {
        return countryInfoService.getListOfContinents();
    }

    @GetMapping("/token")
    public String getToken() {
        GetTokenResponse response = entityService.getToken();
        return response.getGetTokenResult().getValue();
    }
}
