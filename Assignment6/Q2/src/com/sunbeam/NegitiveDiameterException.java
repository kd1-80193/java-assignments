package com.sunbeam;

public class NegitiveDiameterException extends Exception {
	private String fieldName;
	private double diameterValue;

	NegitiveDiameterException() {

	}

	public NegitiveDiameterException(String fieldName, double diameterValue) {
		this.fieldName = fieldName;
		this.diameterValue = diameterValue;
	}

	@Override
	public String toString() {
		return "NegitiveDiameterException [fieldName=" + fieldName + ", diameterValue=" + diameterValue + "]";
	}

}
