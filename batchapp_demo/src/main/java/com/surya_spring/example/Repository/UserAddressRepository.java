package com.surya_spring.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surya_spring.example.Model.UserAddress;

public interface UserAddressRepository extends JpaRepository<UserAddress, Long>{
	

}
