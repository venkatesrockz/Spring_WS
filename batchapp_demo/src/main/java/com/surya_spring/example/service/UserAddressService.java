package com.surya_spring.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.surya_spring.example.Model.UserAddress;
import com.surya_spring.example.Repository.UserAddressRepository;

@Service
@Repository
public class UserAddressService {
	
	@Autowired
	private UserAddressRepository useraddressrepository;
	
	@Transactional(readOnly=true)	
	public List<UserAddress> getAllUserAddress()
	{
		List<UserAddress> useraddrall =useraddressrepository.findAll();
				return useraddrall;
	}
	
	@Transactional(readOnly=true)
	public UserAddress getOneUserAddress(Long id)
	{
		UserAddress Useraddrone = useraddressrepository.findOne(id);
		return Useraddrone;
	}

	@Transactional
	public UserAddress saveorupdateaddr(UserAddress Userin)  /*to update the address*/
	
	{
		UserAddress saveorupdateaddr = useraddressrepository.saveAndFlush(Userin);
		return saveorupdateaddr;
	}
	
	@Transactional
	public boolean deleteaddress (Long id)
	{
		 boolean rtnval = false;
		 
		 try
		 {
		 useraddressrepository.delete(id);
				return true; 
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 
		 return rtnval;
	}
	
	
}
