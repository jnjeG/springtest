package com.thingnet.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.thingnet.model.interfaces.Performer;

public class Juggler implements Performer{
	private Integer beanBags = 3;
	private List<String> wifesname;
	private Map<String,Juggler> jugglemap;
	private Properties pros;
	private String nullVal = "null?";
	
	public Juggler(){
	}
	
	public Juggler(Integer beanBags){
		this.beanBags = beanBags;
	}

	public void perform() {
		System.out.println("Juggle throw "+beanBags+" beanBags");
	}
	
	private static class SingletonJuggler{
		public static  Juggler instance(){
			return new Juggler();
		}
	}
	
	public static Juggler instance(){
		return SingletonJuggler.instance();
	}
	
	
	public void init(){
		System.out.println("Init...");
	}

	public void init2(){
		System.out.println("Init2...");
	}
	
	public void destroy(){
		System.out.println("Destroy...");
	}

	
	public Integer getBeanBags() {
		return beanBags;
	}

	public void setBeanBags(Integer beanBags) {
		this.beanBags = beanBags;
	}

	public List<String> getWifesname() {
		return wifesname;
	}

	public void setWifesname(List<String> wifesname) {
		this.wifesname = wifesname;
	}

	public Map<String, Juggler> getJugglemap() {
		return jugglemap;
	}

	public void setJugglemap(Map<String, Juggler> jugglemap) {
		this.jugglemap = jugglemap;
	}

	public Properties getPros() {
		return pros;
	}

	public void setPros(Properties pros) {
		this.pros = pros;
	}

	public String getNullVal() {
		return nullVal;
	}

	public void setNullVal(String nullVal) {
		this.nullVal = nullVal;
	}
	
	
	
}
