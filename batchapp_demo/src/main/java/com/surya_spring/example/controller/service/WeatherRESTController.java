package com.surya_spring.example.controller.service;

import javax.jws.soap.SOAPBinding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.surya_spring.example.wscomponent.WeatherWSClientComponent;

@RestController
public class WeatherRESTController {
	
	@Autowired
	private WeatherWSClientComponent weatherwsService;
	
	@RequestMapping(value = "/getAllCitiesByCountry/{countryIn}", method = RequestMethod.GET, produces = "application/json")
	@SOAPBinding(parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)
	public String getAllCitiesByCountryName(@PathVariable(value="countryIn") String countryIn){
		String countries = weatherwsService.getCitiesByCountry(countryIn);
		return countries;
	}

}
