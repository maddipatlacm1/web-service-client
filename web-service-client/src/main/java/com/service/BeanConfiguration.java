package com.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class BeanConfiguration {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan(new String[]{"com"});
        return marshaller;
    }

    @Bean
    public NumberConversion numberConversion(Jaxb2Marshaller marshaller) {
        NumberConversion client = new NumberConversion();
        client.setDefaultUri("https://www.dataaccess.com/webservicesserver/numberconversion.wso");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

    @Bean
    public CountryInfoService countryInfoService(Jaxb2Marshaller marshaller) {
        CountryInfoService client = new CountryInfoService();
        client.setDefaultUri("http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

    @Bean
    public HttpEntityService httpEntityService(Jaxb2Marshaller marshaller) {
        HttpEntityService client = new HttpEntityService();
        client.setDefaultUri("http://connect-joincft-jzd-qa.decosasp.com/connect/webservices/BasicHttpEntityService.svc");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}