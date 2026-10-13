package com.fullstacksref.streams;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class IntSummaryStatisticsExample {

  public static void main(String[] args) {
   
    System.out.println("IntSummaryStatistics Example" );
    
    Stream<Integer> numStream = Stream.of(1, 2, 3, 4, 5);
    IntSummaryStatistics summary = numStream.mapToInt(p-> p).summaryStatistics();
    
    System.out.println("Max From the Data is " + summary.getMax());
    System.out.println("Min From the Data is " + summary.getMin());
    System.out.println("Average From the Data is " + summary.getAverage());
    System.out.println("Sum From the Data is " + summary.getSum());
    System.out.println("Count From the Data is " + summary.getCount());
    
    //Add a new number to the stream
    System.out.println("\nAdding number 10 to the data");
    summary.accept(10);
    
    System.out.println("Max From the Data is " + summary.getMax());
    System.out.println("Min From the Data is " + summary.getMin());
    System.out.println("Average From the Data is " + summary.getAverage());
    System.out.println("Sum From the Data is " + summary.getSum());
    System.out.println("Count From the Data is " + summary.getCount());
   
  }
}
