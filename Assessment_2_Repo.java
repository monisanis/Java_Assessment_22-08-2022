package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Assessment_2;

import java.util.List;

public interface Assessment_2_Repo extends JpaRepository<Assessment_2,Long>

{

}
