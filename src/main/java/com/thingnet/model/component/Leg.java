package com.thingnet.model.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("leg1")
public class Leg {
	@Value("chenjunjie's leg")
	private String legName;

	public String getLegName() {
		return legName;
	}

	public void setLegName(String legName) {
		this.legName = legName;
	}

	@Override
	public String toString() {
		return "Leg [legName=" + legName + "]";
	}
	
	
}
