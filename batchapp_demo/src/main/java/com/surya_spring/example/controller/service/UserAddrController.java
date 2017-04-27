package com.surya_spring.example.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.surya_spring.example.Model.UserAddress;
import com.surya_spring.example.service.UserAddressService;

@RestController
public class UserAddrController {

	@Autowired UserAddressService uas;
		
	@RequestMapping(value="/getalladdr", method = RequestMethod.GET,  produces="application/json")
	@ResponseBody
	public List<UserAddress> getAllUserAddress()
	{
		List<UserAddress> useraddr = uas.getAllUserAddress();
		return useraddr;
		
	}
	
	@RequestMapping(value="/getoneaddr/{id}", method = RequestMethod.GET,  produces="application/json")
	public  UserAddress getOneUserAddress(@PathVariable (value="id") Long id)
	{
		UserAddress useraddr = uas.getOneUserAddress(id);
		return useraddr;
	}
	
	@RequestMapping(value="/saveorupdateaddr", method=RequestMethod.POST, consumes="application/json")
	public UserAddress saveordeladdr(@RequestBody UserAddress Userin)
	{
		UserAddress useraddr = uas.saveorupdateaddr(Userin);
		return useraddr;
	}
	
	@RequestMapping(value="/delete/{id}" ,method=RequestMethod.POST , consumes="application/json")
	public String deleteuser(@PathVariable(value="id") Long id)
	{
		try{
		uas.deleteaddress(id);
		return "Success";
		}
		catch(Exception e){
			e.printStackTrace();
			return "Failure";
		}
	}
	
}
