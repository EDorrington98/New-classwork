package com.qa.exceptions;

public class Maths{
	public static int divide(int num1, int num2) {
	if (num2 == 0 ) {
		throw new ZeroDividingException();}
	else {
		return num1/num2;
	}
	}
	}

