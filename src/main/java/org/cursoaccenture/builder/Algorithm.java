package org.cursoaccenture.builder;

public class Algorithm {
	private String name ;
	private int maximumNumberOfEvaluations ;
	private int maximumComputingTime ;
	private int memoryRequirement ;
	private String operator ;
	
  public Algorithm(String name, int maximumNumberOfEvaluations, int maximumComputingTime, int memoryRequirement, String operator) {
	  this.name = name ;
	  this.maximumNumberOfEvaluations = maximumNumberOfEvaluations ;
	  this.maximumComputingTime = maximumComputingTime ;
	  this.memoryRequirement = memoryRequirement ;
	  this.operator = operator ;
  }
 }
