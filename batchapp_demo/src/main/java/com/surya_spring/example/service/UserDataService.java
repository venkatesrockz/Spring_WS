package com.surya_spring.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.surya_spring.example.Model.UserData;
import com.surya_spring.example.Repository.UserDataRepository;

@Service
@Repository
public class UserDataService {
	
	@Autowired
	private UserDataRepository userRepository;
	
	@Transactional(readOnly=true)
	public List<UserData> getAllUserData(){
		List<UserData> userList = userRepository.findAll();
		return userList;		
	}
	
	@Transactional(readOnly=true)
	public UserData getUser(Long a){
		UserData user = userRepository.findOne(a);
		return user;		
	}
	
	@Transactional
	public UserData addUser(UserData userIn){
		UserData user = userRepository.save(userIn);
		return user;
	}

}
