package com.yener.springwssoapclientv2.controller;

import com.yener.springwssoapclientv2.dto.KisiSorguRequestDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class KisiSorguControllerTest {

    @Autowired
    private KisiSorguController kisiSorguController;

    @Test
    public void testKisiSorgula() {
        KisiSorguRequestDTO kisiSorguRequestDTO = new KisiSorguRequestDTO();
        kisiSorguRequestDTO.setKisiId(1L);
        assertThat(kisiSorguController.kisiSorgula(kisiSorguRequestDTO).getAd()).isEqualTo("erhan");
    }
}