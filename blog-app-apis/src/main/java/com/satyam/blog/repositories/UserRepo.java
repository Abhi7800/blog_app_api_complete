package com.satyam.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satyam.blog.entites.User;

public interface UserRepo extends JpaRepository<User,Integer> {

}
