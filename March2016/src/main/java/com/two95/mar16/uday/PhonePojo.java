package com.two95.mar16.uday;

import java.util.Date;
import java.util.List;

public class PhonePojo {
	private String modeli;
	private String os;
	private String memory;
	private Date orderedDate;
	private List<String>features;
	private RadioClass radio;
	public PhonePojo(){
		
	}

	public PhonePojo(String modeli, String os, String memory, Date orderedDate, List<String> features, RadioClass radio) {
		super();
		this.modeli = modeli;
		this.os = os;
		this.memory = memory;
		this.orderedDate = orderedDate;
		this.features = features;
		this.radio = radio;
	}

	public RadioClass getRadio() {
		return radio;
	}

	public void setRadio(RadioClass radio) {
		this.radio = radio;
	}

	public List<String> getFeatures() {
		return features;
	}
	public void setFeatures(List<String> features) {
		this.features = features;
	}
	public Date getOrderedDate() {
		return orderedDate;
	}
	public void setOrderedDate(Date orderedDate) {
		this.orderedDate = orderedDate;
	}
	public String getModeli() {
		return modeli;
	}
	public void setModeli(String modeli) {
		this.modeli = modeli;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}

}
