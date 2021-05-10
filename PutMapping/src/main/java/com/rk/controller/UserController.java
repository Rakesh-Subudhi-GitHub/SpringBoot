package com.rk.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rk.helper.User;

@RestController
public class UserController {

	@PutMapping(value = "/updateUser",consumes = {MediaType.APPLICATION_JSON_VALUE})//indirectly application/json
	public ResponseEntity<String> updateUserMethod(@RequestBody User user)
	{
		//logic for save the data automatically it update
		System.out.println(user);
		String msg="User data is updated...";
		
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
}
