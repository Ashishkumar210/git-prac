package com.Ashsih.blog.blogappapis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ashsih.blog.blogappapis.entity.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {
	
	

}
