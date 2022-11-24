package com.Ashsih.blog.blogappapis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ashsih.blog.blogappapis.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
