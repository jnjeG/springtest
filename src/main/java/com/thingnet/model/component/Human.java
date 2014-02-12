package com.thingnet.model.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("chenjunjie")
public class Human {
	@Autowired
	private Head head;
	@Autowired
	private Leg leg;
	
	public Head getHead() {
		return head;
	}
	public void setHead(Head head) {
		this.head = head;
	}
	public Leg getLeg() {
		return leg;
	}
	public void setLeg(Leg leg) {
		this.leg = leg;
	}
	
	@Override
	public String toString() {
		return "Human [head=" + head + ", leg=" + leg + "]";
	}
	
}
