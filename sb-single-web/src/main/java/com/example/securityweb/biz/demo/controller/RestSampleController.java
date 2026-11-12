package com.example.securityweb.biz.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class RestSampleController {


    @RequestMapping("/gateway/common")
    public ResponseEntity<Object> requestCommon(HttpServletRequest request, HttpServletResponse response) {
        //
        log.debug("requestCommon START");

        return ResponseEntity.ok().body("OK");
    }
}
