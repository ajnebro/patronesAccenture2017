package org.cursoaccenture.builder;

public class AlgorithmBuilder {
  private String name;
  private int maximumNumberOfEvaluations;
  private int maximumComputingTime;
  private int memoryRequirement;
  private String operator;

  public AlgorithmBuilder() {
    name = "";
    maximumNumberOfEvaluations = 10;
    maximumComputingTime = 10;
    memoryRequirement = 20;
    operator = "QuickSort";
  }

  public AlgorithmBuilder setName(String name) {
    this.name = name;
    return this;
  }

  public AlgorithmBuilder setMaximumNumberOfEvaluations(int maximumNumberOfEvaluations) {
    this.maximumNumberOfEvaluations = maximumNumberOfEvaluations;
    return this;
  }

  public AlgorithmBuilder setMaximumComputingTime(int maximumComputingTime) {
    this.maximumComputingTime = maximumComputingTime;
    return this;
  }

  public AlgorithmBuilder setMemoryRequirement(int memoryRequirement) {
    this.memoryRequirement = memoryRequirement;
    return this;
  }

  public AlgorithmBuilder setOperator(String operator) {
    this.operator = operator;
    return this;
  }

  public Algorithm build() {
    return new Algorithm(name, maximumNumberOfEvaluations, maximumComputingTime, memoryRequirement,
        operator);
  }
}
