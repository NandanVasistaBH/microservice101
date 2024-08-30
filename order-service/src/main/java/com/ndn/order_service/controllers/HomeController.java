package com.ndn.order_service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {
    @Autowired 
    public RestTemplate restTemplate;

    @GetMapping("/order")
    public ResponseEntity<String> getOrder(){
        // String resp = restTemplate.getForObject("http://localhost:1001/item",String.class);
        String resp = restTemplate.getForObject("http://ITEM-SERVICE/item",String.class);
        return new ResponseEntity<String>(resp,HttpStatus.OK);
    }
}
