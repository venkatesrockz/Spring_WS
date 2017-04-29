/**
 * 
 */
package com.surya_spring.example.Repository;

import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.surya_spring.example.Model.UserData;

/**
 * @author suryaprakash.raj
 *
 */
public interface UserDataRepository extends JpaRepository<UserData, Long>{
	
	@Query("SELECT ua.streetName from UserAddress ua, UserData ud where ud.userName=:username "
			+ "and ud.userId = ua.userdata.userId")
	public String getStreetName_ForUserName(@Param(value = "username") String username) throws DataAccessResourceFailureException;
	
	@Query("SELECT ua.userage from UserData ua where ua.userId=:id")
	public Long getSingleUserAgeque(@Param(value = "id") Long id) throws DataAccessResourceFailureException;
	
	
	
}
