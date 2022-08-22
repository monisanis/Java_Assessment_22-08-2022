package com.example.demo.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.Assessment_2_Repo;

import com.example.demo.model.Assessment_2;

@RestController

public class Assessment_2_Controller

{

 @Autowired

 Assessment_2_Repo repo;

 

 @PostMapping(path="/assessment2",consumes= {"application/json"})

 public Assessment_2 addAssessment_2(@RequestBody Assessment_2 assessment2)

 {

 repo.save(assessment2);

 return assessment2;

 }

 @GetMapping(path="/assessments2")

 public List<Assessment_2> getAssessments_2()

 {

 return repo.findAll();

 }

 @RequestMapping("/assessment2/{cid}")

 public Optional<Assessment_2> getAssessment_2(@PathVariable("cid")int cid)

 {

 return repo.findById(cid);

 }

}

