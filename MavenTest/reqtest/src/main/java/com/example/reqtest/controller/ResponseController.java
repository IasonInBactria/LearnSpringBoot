package com.example.reqtest.controller;


import com.example.reqtest.pojo.Address;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ResponseController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("Hello World !");
        return "Hello World ~";
    }

    @RequestMapping("/getAddr")
    public Address getAddr(){
        Address addr  = new Address();
        addr.setProvince("California");
        addr.setCity("San Francisco");
        return addr;
    }

    @RequestMapping("/listAddr")
    public List<Address> listAddr(){
        List<Address> list = new ArrayList<>();
        Address addr = new Address();
        addr.setProvince("Henan");
        addr.setCity("Amsterdam");

        Address addr2 = new Address();
        addr.setProvince("Shandong");
        addr.setCity("Texas");

        list.add(addr);
        list.add(addr2);
        return list;
    }
}
