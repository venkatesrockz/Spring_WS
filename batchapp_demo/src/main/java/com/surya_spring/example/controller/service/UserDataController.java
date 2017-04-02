package com.surya_spring.example.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.surya_spring.example.Model.UserData;
import com.surya_spring.example.service.UserDataService;

@RestController
public class UserDataController {
	
	@Autowired
	private UserDataService userDataService;
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = "application/json")
	public List<UserData> getAllUserData(){
		List<UserData> userList = userDataService.getAllUserData();
		//System.out.println("User List is :"+userList.get(0).toString());
		return userList;
	}
	
	@RequestMapping(value = "/getOne/{id}", method = RequestMethod.GET, produces = "application/json")
	public UserData getSingleUserData(@PathVariable(value="id") Long id){
		UserData userData = userDataService.getUser(id);
		//System.out.println("User List is :"+userList.get(0).toString());
		return userData;
	}
	
	@RequestMapping(value = "/addUser", method = RequestMethod.GET, consumes = "application/json")
	public UserData addUserData(UserData userIn){
		UserData userOut=userDataService.addUser(userIn);		
		return userOut;
	}

}
