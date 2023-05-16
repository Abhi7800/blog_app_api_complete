package com.satyam.blog.services;

import java.util.List;

import com.satyam.blog.payloads.PostDto;

public interface PostService {

	// create

	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

	// update

	PostDto updatePost(PostDto postDto, Integer postId);

	// delete

	void deletePost(Integer postId);

	// get all posts

	List<PostDto> getAllPost();

	// get all posts by category

	PostDto getPostById(Integer postId);

	// get all posts category

	List<PostDto> getPostByCategory(Integer categoryId);

	// get all posts by user

	List<PostDto> getPostByUser(Integer userId);

	// search posts
	List<PostDto> searchPosts(String keyword);
}
