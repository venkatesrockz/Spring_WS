package com.surya_spring.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.cxf.jaxws.support.JaxWsServiceFactoryBean;

import net.webservicex.GlobalWeatherHttpGet;

@Configuration
public class WeatherSOAPClientConfig {
	@Value("${soap.service.address}")
	private String soapServiceAddress;

	@Bean(name = "globalWeatherClientProxyBean")
	public GlobalWeatherHttpGet weatherPortType() {
		JaxWsServiceFactoryBean jaxWsProxyFactoryBean = new JaxWsServiceFactoryBean();
		jaxWsProxyFactoryBean.setServiceClass(GlobalWeatherHttpGet.class);
		jaxWsProxyFactoryBean.setWsdlURL(soapServiceAddress);

		return (GlobalWeatherHttpGet) jaxWsProxyFactoryBean.create();
	}
	
	/*@Bean(name = "globalWeatherClientProxyBean")
	public GetCityHttpGet getCityPortType() {
		JaxWsServiceFactoryBean jaxWsProxyFactoryBean = new JaxWsServiceFactoryBean();
		jaxWsProxyFactoryBean.setServiceClass(GlobalWeatherHttpGet.class);
		jaxWsProxyFactoryBean.setWsdlURL(soapServiceAddress);

		return (GetCityHttpGet) jaxWsProxyFactoryBean.create();
	}*/

}
