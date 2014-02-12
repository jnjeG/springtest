package com.thingnet.model.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("head1")
public class Head {

	@Value("chenjunjie's head")
	private String headName;

	public String getHeadName() {
		return headName;
	}

	public void setHeadName(String headName) {
		this.headName = headName;
	}

	@Override
	public String toString() {
		return "Head [headName=" + headName + "]";
	}
}
