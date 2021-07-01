package com.yener.springwssoapclientv2.controller;

import com.yener.springwssoapclientv2.dto.KisiSorguRequestDTO;
import com.yener.springwssoapclientv2.dto.KisiSorguResponseDTO;
import com.yener.springwssoapclientv2.service.KisiSorguService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class KisiSorguController {


    @Autowired
    private KisiSorguService kisiSorguService;


    @RequestMapping(value = "/kisiSorgula", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody
    KisiSorguResponseDTO kisiSorgula(@RequestBody KisiSorguRequestDTO kisiSorguRequestDTO) {
        return kisiSorguService.kisiSorgula();
    }

}
