package com.surya_spring.example.wscomponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surya_spring.example.config.WeatherSOAPClientConfig;

@Service
public class WeatherWSClientComponent {
	@Autowired
	private WeatherSOAPClientConfig weatherClient;
	
	public String getCitiesByCountry(String countryName){
		return weatherClient.weatherPortType().getCitiesByCountry(countryName);
	}

}
