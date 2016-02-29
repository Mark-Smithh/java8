package com.mark;

import java.util.function.Predicate;

import org.apache.commons.lang3.StringUtils;

public class lamdaExamples {
	@SuppressWarnings("unused")
	public void sameLambdaDiffWays(){
		Predicate<Integer> pred = (Integer num)->{return StringUtils.isEmpty(num.toString());};
		
		Predicate<Integer> pred1 = (Integer num)-> StringUtils.isEmpty(num.toString());
		
		Predicate<Integer> pred2 = (Integer num)-> { //same as pred just added carriage returns
			return StringUtils.isEmpty(num.toString());
		};
					
		Predicate<Integer> pred3 = (Integer num)-> {
			int f = 0;			
			return num.equals(f)?true:false;
		};		
	}
}
