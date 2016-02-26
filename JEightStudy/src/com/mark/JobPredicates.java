package com.mark;

import java.util.function.Predicate;

//IF NEED TO PREDICATE INTERFACE CAN BE IMPLEMENTED
//BUT THEN WOULD HAVE TO IMPLEMENT TEST METHOD

public class JobPredicates{ // implements Predicate<Job>{
	
	public static Predicate<Job> writeCode(){
		return j -> j.isWriteCode();
	}
	
	public static Predicate<Job> saleryGreaterThen(int salery){
		return j -> j.getSalery() > salery;
	}
	
	public static Predicate<Job> saleryLessThan(int salery){
		return j -> j.getSalery() < salery;
	}

	//@Override
	//public boolean test(Job t) {	
		//	ADD LOGIC
	//}
}
