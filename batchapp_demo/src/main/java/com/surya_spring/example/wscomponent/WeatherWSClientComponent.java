package com.surya_spring.example.wscomponent;

import org.springframework.stereotype.Service;

import net.webservicex.GlobalWeather;

@Service
public class WeatherWSClientComponent {
		
	public String getCitiesByCountry(String countryName){
		GlobalWeather globalWeatherService = new GlobalWeather();
		String cityNames = globalWeatherService.getGlobalWeatherHttpGet().getCitiesByCountry(countryName);
		return cityNames;
	}

}
