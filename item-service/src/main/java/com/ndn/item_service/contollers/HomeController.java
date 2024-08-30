package com.ndn.item_service.contollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/item")
    public String getItem(){
        return "item seleted";
    }
}
