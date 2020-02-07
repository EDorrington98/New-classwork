package com.qa.enumeration;

public enum Day {
MONDAY ("Blue"),
TUESDAY ("Tired"),
WEDNESDAY ("Sad"),
THURSDAY ("Scared"),
FRIDAY ("Drunk"),
SATURDAY ("Hungover"),
SUNDAY ("Lazy");
private String feeling;
 Day (String feeling) {
	this.feeling = feeling;
			}
	
//TUESDAY ("Tired");
//private String feeling;
//Day (String feeling) {
//	this.feeling = feeling;
//			}
//WEDNESDAY ("Sad");
//private String feeling;
//Day (String feeling) {
//	this.feeling = feeling;
//			}
//THURSDAY ("Scared");
//private String feeling;
//Day (String feeling) {
//	this.feeling = feeling;
//			}
//FRIDAY ("Drunk");
//private String feeling;
//Day (String feeling) {
//	this.feeling = feeling;
//			}
//SATURDAY ("Hungover");
//private String feeling;
//Day (String feeling) {
//	this.feeling = feeling;
//			}
//SUNDAY ("Lazy");
//private String feeling;
//Day (String feeling) {
//	this.feeling = feeling;
//			}

public String getFeeling() {
	return feeling;
}
public void setFeeling(String feeling) {
	this.feeling = feeling;
}}
