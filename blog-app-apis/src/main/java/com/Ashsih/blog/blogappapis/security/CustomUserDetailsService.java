package com.Ashsih.blog.blogappapis.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.Ashsih.blog.blogappapis.entity.User;
import com.Ashsih.blog.blogappapis.exception.ResourceNotFoundException;
import com.Ashsih.blog.blogappapis.repository.UserRepo;
@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// loading user from database by username
		User user = this.userRepo.findByEmail(username).orElseThrow(()->new ResourceNotFoundException("User", "email:"+username, 0));
		
		return user;
	}

}
