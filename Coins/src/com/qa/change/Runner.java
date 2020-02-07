package com.qa.change;

import java.util.function.DoubleToIntFunction;

public class Runner {

	public static void main(String[] args) {
		float payed = Utils.payedInput();
		float cost = Utils.costInput();
	
	float change = payed - cost;
	
	change = (change / 100);
	int hund = Math.round(change);
	if (hund != 0) {
		System.out.println(hund + "x £100 note");
	}
	
}
}