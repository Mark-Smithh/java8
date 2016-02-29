package com.mark;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

public class JobFilter {	
	public static void main(String[] args) {
		JobFilter me = new JobFilter();
		me.testPredicate();
	}
	
	private void testPredicate(){				
		List<Job> allJobs = new ArrayList<Job>();
		createAllJobs(allJobs);
		List<Job> softwareDevJobs = allJobs.stream().filter(JobPredicates.writeCode()).collect(Collectors.<Job>toList());	
		System.out.println("num software development jobs " + softwareDevJobs.size());
		
		List<Job> highPaid = allJobs.stream().filter(JobPredicates.saleryGreaterThen(70_000)).collect(Collectors.<Job>toList());
		System.out.println("num high paid jobs " + highPaid.size());
	
		List<Job> considerSaleryIncrease = allJobs.stream().filter(JobPredicates.saleryLessThan(30_000)).collect(Collectors.<Job>toList());
		System.out.println("consider for raise jobs " + considerSaleryIncrease.size());

//----------------------------------------ANOTHER WAY TO USE PREDICATE BELOW
		List<Job> incomplete = new ArrayList<Job>();
		Predicate<Job> pred = jj -> StringUtils.isEmpty(jj.getJobTitle()) || jj.getSalery() == 0;		
		for(Job j:allJobs){		
			if (pred.test(j)){
				incomplete.add(j);
			}
		}		
		System.out.println("incomplete jobs " + incomplete.size());
	}
	
	private void createAllJobs(List<Job> allJobs){
		createJob(50_000,false,"Security Guard",allJobs);
		createJob(75_000,false,"Recruiter",allJobs);
		createJob(99_000,true,"Software Engineer",allJobs);
		createJob(0,false,"Senior Software Engineer",allJobs);
	}
	
	private void createJob(Integer salery,boolean coder, String jobTitle, List<Job> allJobs){
		Job job = new Job(salery,coder,jobTitle);		
		allJobs.add(job);
	}
}
