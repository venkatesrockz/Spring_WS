package com.surya_spring.example.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.surya_spring.example.Model.UserData;
import com.surya_spring.example.Repository.UserDataRepository;
import com.surya_spring.example.service.UserDataService;

@RestController
public class UserDataController {
	
	@Autowired
	private UserDataService userDataService;
	
	@Autowired UserDataRepository udr;
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = "application/json")
	public List<UserData> getAllUserData(){
		List<UserData> userList = userDataService.getAllUserData();
		return userList;
	}
	
	@RequestMapping(value = "/getOne/{id}", method = RequestMethod.GET, produces = "application/json")
	public UserData getSingleUserData(@PathVariable(value="id") Long id){
		UserData userData = userDataService.getUser(id);
		return userData;
	}
	
	@RequestMapping(value = "/addUser", method = RequestMethod.POST, consumes = "application/json")
	public UserData addUserData(@RequestBody UserData userIn){
		UserData userOut=userDataService.addUser(userIn);		
		return userOut;
	}

}
