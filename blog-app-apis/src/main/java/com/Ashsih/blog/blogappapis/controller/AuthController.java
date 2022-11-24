package com.Ashsih.blog.blogappapis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ashsih.blog.blogappapis.payloads.JwtAuthRequest;
import com.Ashsih.blog.blogappapis.payloads.JwtAuthResponse;
import com.Ashsih.blog.blogappapis.security.JwtTokenHelper;

@RestController
@RequestMapping("/api/v1/auth/")
public class AuthController {
	@Autowired
	private JwtTokenHelper jwtTokenHelper;
	@Autowired
	private UserDetailsService userDetailsService;
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@PostMapping("/login")
	public ResponseEntity<JwtAuthResponse> createToken(
			@RequestBody JwtAuthRequest request
			
			){
		this.authenticate(request.getUsername(),request.getPassword());
	}

	private void authenticate(String username, String password) {
		
		
		this.authenticationManager.authenticate(null)
		
	}

}
