package com.satyam.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satyam.blog.entites.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
