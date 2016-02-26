package com.mark;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LDate {
	public static void main(String[] args){
		System.out.println(getDate());
		System.out.println(getDate(2015,6,6));
		
		System.out.println(getDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
		System.out.println(getDate(2015,6,6).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
	}
	
	public static LocalDate getDate(){
		return LocalDate.now();
	}
	
	public static LocalDate getDate(int year,int month,int day){
		return LocalDate.of(year, month, day);
	}	
}
