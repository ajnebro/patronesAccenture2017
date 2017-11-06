package org.cursoaccenture.builder;

public class Client {
  private Algorithm algorithm1;
  private Algorithm algorithm2;

  public Client() {
    algorithm1 = new Algorithm("QuickSort", 10, 10, 20, "Sum");

    algorithm2 = new AlgorithmBuilder()
        .setName("MergeSort")
        .setMaximumNumberOfEvaluations(10)
        .setMemoryRequirement(10)
        .setOperator("Sum")
        .build();
  }
}
