package com.ivoronline.springboot_interceptor_extend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  //===================================================================
  // HELLO
  //===================================================================
  @ResponseBody
  @RequestMapping("Hello")
  String hello() {
    System.out.println("Controller:");
    return "Hello from Controller";
  }

}
