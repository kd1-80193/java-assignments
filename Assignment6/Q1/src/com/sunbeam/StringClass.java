package com.sunbeam;

public class StringClass {
	private String str;

	public StringClass() {
	}

	public StringClass(String str) {
		this.str = str;
	}

	public void setStr(String str)  {
		if (str.length() < 0 || str.length() > 80)
			//Exception Chaining unchecked Exception 
			throw new RuntimeException("The strings is too long", new ExceptionLineTooLong("String",str));
		else
			this.str = str;
	}

	@Override
	public String toString() {
		return "StringClass [str=" + str + "]";
	}

}
