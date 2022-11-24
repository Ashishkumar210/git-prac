package com.Ashsih.blog.blogappapis.service;

import java.util.List;

import com.Ashsih.blog.blogappapis.entity.Post;
import com.Ashsih.blog.blogappapis.payloads.PostDto;
import com.Ashsih.blog.blogappapis.payloads.PostResponse;

public interface PostService {
	//create
	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
	
	//update
	PostDto updatePost(PostDto postDto,Integer postId);
	
	
	//delete
	void deletepost(Integer postId);
	
	//get all post
	PostResponse getAllPost(Integer pageNumer,Integer pageSize,String sortBy,String sortDir);
	
	//get single post
	PostDto getPostById(Integer postId);
	//get all post by category
	List<PostDto>getPostsByCategory(Integer categoryId);
	//get all post by user
	List<PostDto>getPostsByUser(Integer userId);
	//search posts
	List<PostDto>searchPosts(String keyword);
	

}
