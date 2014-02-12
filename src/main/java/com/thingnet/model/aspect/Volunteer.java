package com.thingnet.model.aspect;


/**
 * 被拦截者，参与心灵游戏者
 * @author chenjunjie
 *
 */
public class Volunteer {
	private String mythought;
	
	public void thinkOfSomething(String thought){
		this.mythought  = thought;
	}

	public String getMythought() {
		return mythought;
	}

	public void setMythought(String mythought) {
		this.mythought = mythought;
	}
	
	
}
