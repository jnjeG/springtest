package com.thingnet.model.aspect;

/**
 * 拦截者,读心者
 * @author chenjunjie
 *
 */
public class Magician {

	private String thoughts;
	
	public void interceptThougths(String though){
		System.out.println("intercept thoughts: "+ though);
		this.thoughts  =though;
	}

	public String getThoughts() {
		return thoughts;
	}
}
