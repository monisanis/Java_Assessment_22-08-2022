package com.example.demo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class Assessmet_1_Controller {

 @RequestMapping("/Assessment_1_hi")

 public String sayHello(@RequestParam("cid") int id,@RequestParam("cname") String name,@RequestParam("caddress") String ad,@RequestParam("cnumber") Long ph,@RequestParam("cloginid") int cid,@RequestParam("cpassword") String ps ,Model m)

 {

 m.addAttribute("cid", id);
 m.addAttribute("cname", name);
 m.addAttribute("caddress", ad);
 m.addAttribute("cnumber", ph);
 m.addAttribute("cloginid", cid);
 m.addAttribute("cpassword", ps);
 

 return "Assessment_1_hi";

 }

 @RequestMapping("/xx")

 public String xx()

 {

 return "Assessment_1_xx";

 }

}