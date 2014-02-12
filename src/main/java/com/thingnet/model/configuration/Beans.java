package com.thingnet.model.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Beans {
	@Bean
	public Foot cjjLeg(){
		Foot leg = new Foot();
		leg.setFootName("chenjunjie's legg");
		return leg;
	}
}
