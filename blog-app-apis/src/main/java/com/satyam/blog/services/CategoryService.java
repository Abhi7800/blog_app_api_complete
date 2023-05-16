package com.satyam.blog.services;

import java.util.List;

import com.satyam.blog.payloads.CategoryDto;

public interface CategoryService {

	//create
	CategoryDto createCategory(CategoryDto CategoryDto); 
	
	//update
	CategoryDto updateCategory(CategoryDto CategoryDto, Integer categoryId);
	
	//delete
	void deleteCategory(Integer categoryId);
	
	//get 
	CategoryDto getCategory(Integer categoryId);
	
	//get All
	List<CategoryDto> getCategories(); 
}
