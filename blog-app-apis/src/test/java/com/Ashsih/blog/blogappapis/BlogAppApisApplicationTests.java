package com.Ashsih.blog.blogappapis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Ashsih.blog.blogappapis.repository.UserRepo;

@SpringBootTest
class BlogAppApisApplicationTests {
	@Autowired
	private UserRepo userRepo;
	

	@Test
	void contextLoads() {
	}
	@Test
	public void repoTest() {
		String className=this.userRepo.getClass().getName();
		System.out.println(className);
	}

}
