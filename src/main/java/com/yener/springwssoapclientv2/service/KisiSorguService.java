package com.yener.springwssoapclientv2.service;


import com.yener.springwssaopv2.soap.KisiSorgulaRequest;
import com.yener.springwssaopv2.soap.KisiSorgulaResponse;
import com.yener.springwssaopv2.soap.TestService;
import com.yener.springwssoapclientv2.dto.KisiSorguResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class KisiSorguService {


    @Autowired
    private TestService testService;


    public KisiSorguResponseDTO kisiSorgula() {
        KisiSorguResponseDTO kisiSorguResponseDTO = new KisiSorguResponseDTO();
        KisiSorgulaRequest kisiSorgulaRequest = new KisiSorgulaRequest();
        kisiSorgulaRequest.setKisiId(kisiSorgulaRequest.getKisiId());
        KisiSorgulaResponse kisiSorgulaResponse = testService.getKisiV1(kisiSorgulaRequest);
        kisiSorguResponseDTO.setAd(kisiSorgulaResponse.getAd());
        kisiSorguResponseDTO.setSoyad(kisiSorgulaResponse.getSoyad());
        return kisiSorguResponseDTO;
    }

}
