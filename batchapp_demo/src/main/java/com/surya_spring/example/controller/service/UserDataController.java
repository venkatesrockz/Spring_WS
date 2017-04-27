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
	
	@RequestMapping(value = "/saveorUpdateUser", method = RequestMethod.POST, consumes = "application/json")
	public UserData saveOrUpdateUserData(@RequestBody UserData userIn){
		UserData userOut=userDataService.saveOrUpdateUser(userIn);
		return userOut;
	}
	
	@RequestMapping(value = "/getSingleUsrStrtName/{name}", method = RequestMethod.GET, produces = "application/json")
	public String getSingleUsrStrtName(@PathVariable(value="name") String name){
		String userData = userDataService.getUserStrtname(name);
		return userData;
	}

}
