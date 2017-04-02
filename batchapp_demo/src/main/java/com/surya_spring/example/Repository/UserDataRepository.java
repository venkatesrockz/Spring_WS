/**
 * 
 */
package com.surya_spring.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surya_spring.example.Model.UserData;

/**
 * @author suryaprakash.raj
 *
 */
public interface UserDataRepository extends JpaRepository<UserData, Long>{

}
