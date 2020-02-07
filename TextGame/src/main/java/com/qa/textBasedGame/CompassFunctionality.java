package com.qa.textBasedGame;

public class CompassFunctionality implements Player, InterestPoints {
	int disXSq = (((interestX - playX) % 1) * ((interestX - playX) % 1));
	int disYSq = (((interestY - playY) % 1) * ((interestY - playY) % 1));
	int disXYSq = disXSq + disYSq;
	double distanceToInterest = Math.sqrt(disXYSq);

}
