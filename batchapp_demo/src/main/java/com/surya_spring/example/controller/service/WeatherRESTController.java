package com.surya_spring.example.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.surya_spring.example.wscomponent.WeatherWSClientComponent;

@RestController
public class WeatherRESTController {
	
	@Autowired
	private WeatherWSClientComponent weatherwsService;
	
	@RequestMapping(value = "/getAllCitiesByCountry", method = RequestMethod.GET, produces = "application/json")
	public String getAllCitiesByCountryName(@RequestBody String countryIn){
		String countries = weatherwsService.getCitiesByCountry(countryIn);
		return countries;
	}

}
