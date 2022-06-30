package com.restapi.restexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.restexample.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

}