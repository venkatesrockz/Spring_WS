package com.surya_spring.example.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.surya_spring.example.Model.UserData;
import com.surya_spring.example.service.UserDataService;

@RestController
public class UserDataController {
	
	@Autowired
	private UserDataService userDataService;
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity getAllUserData(){
		List<UserData> userList = userDataService.getAllUserData();
		//System.out.println("User List is :"+userList.get(0).toString());
		return new ResponseEntity(userList, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getOne/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity getSingleUserData(@PathVariable(value="id") Long id){
		UserData userData = userDataService.getUser(id);
		//System.out.println("User List is :"+userList.get(0).toString());
		return new ResponseEntity(userData, HttpStatus.OK);
	}

}
