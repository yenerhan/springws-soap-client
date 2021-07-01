package com.yener.springwssoapclientv2.config;

import com.yener.springwssaopv2.soap.TestService;
import com.yener.springwssaopv2.soap.TestServiceImplService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.MalformedURLException;
import java.net.URL;

@Configuration
public class ClientConfig {

    @Value("${client.springws.address}")
    private String address;


    @Bean(name = "testService")
    public TestService testServiceProxy() throws MalformedURLException {
        TestServiceImplService testServiceImplService = new TestServiceImplService(new URL(address));
        return testServiceImplService.getTestServiceImplPort();
    }


}
