package com.satyam.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satyam.blog.entites.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{
	
}
