package com.rk.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rk.helper.User;

@RestController
public class UserController {

	@DeleteMapping(value = "/delete/{id}",consumes = {MediaType.APPLICATION_JSON_VALUE})//indirectly application/json
	public ResponseEntity<String> updateUserMethod(@PathVariable("id") Integer id)
	{
		//logic for delete corresponding user id
		
		System.out.println(id+"data removed");
		String msg=id+" User data is removed...";
		
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
}
