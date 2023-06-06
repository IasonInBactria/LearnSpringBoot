package com.example.reqtest.controller;


import com.example.reqtest.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
public class RequestController {
    @RequestMapping("/simplepojo")
    public String simplePojo(User user){
        System.out.println(user);
        return "Get User Success!";
    }

    @RequestMapping("/complexpojo")
    public String complexPojo(User user){
        System.out.println(user);
        return "Get Complex User Success!";
    }

    @RequestMapping("/arrayParam")
    public String arrayParam(String[] hobby)
    {
        System.out.println(Arrays.toString(hobby));
        return "Get Array!!!";
    }

    @RequestMapping("/listParam")
    public String listParam(@RequestParam List<String> hobby)
    {
        System.out.println(hobby);
        return "Get List!!";
    }

    @RequestMapping("/dateParam")
    public String dateParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime)
    {
        System.out.println(updateTime);
        return "Get datetime!!";
    }

    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user)
    {
        System.out.println(user);
        return "Get Json Data!!";
    }
}
