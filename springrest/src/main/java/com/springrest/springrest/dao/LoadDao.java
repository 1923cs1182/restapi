package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.springrest.entity.Load;

 
public interface LoadDao extends JpaRepository<Load,String> {

}
