package com.sunbeam;

/*Q1. Define a new exception, called ExceptionLineTooLong, that prints out the error message "The
strings is too long". Write a program that reads a String from user and calculates its length. and
throws an exception of type ExceptionLineTooLong in the case where a string of length is more
than 80 characters.
(Hint- Use String class length() method)*/

public class ExceptionLineTooLong extends Exception {

	private String fieldName;
	private String fieldValue;

	ExceptionLineTooLong() {

	}

	public ExceptionLineTooLong(String fieldName, String fieldValue) {
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	public ExceptionLineTooLong(String string, Exception exception) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ExceptionLineTooLong [fieldName=" + fieldName + ", fieldValue=" + fieldValue + "]";
	}

}
