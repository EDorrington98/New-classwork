package com.qa.exceptions;

public class Runner {

	public static void main(String[] args) {
		try {
		System.out.println(Maths.divide(6, 0));
		}
		catch(ZeroDividingException e) {
			System.out.println(e.getMessage());
		}
	}

}
