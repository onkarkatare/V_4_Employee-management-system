package com.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.entity.Manager;

public interface ManagerRepository extends JpaRepository<Manager, Integer>{

}
