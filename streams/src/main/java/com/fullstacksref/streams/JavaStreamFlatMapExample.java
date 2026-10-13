package com.fullstacksref.streams;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamFlatMapExample {

  public static void main(String[] args) {
    
    // Use map to convert to upper case
    Stream<String> stream = Stream.of("a", "b", "c", "d", "e");
    stream.map(String::toUpperCase).forEach(a -> System.out.println(a));
    
    
    // Create DoubleStream using mapToDouble
    Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);
    stream2.mapToDouble(a->a).forEach(a -> System.out.println(a));
    
    // Create IntStream using mapToInt
    Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5);
    stream3.mapToInt(a->a).forEach(a -> System.out.println(a));
    
    // Create LongStream using mapToLong
    Stream<Integer> stream4 = Stream.of(1, 2, 3, 4, 5);
    stream4.mapToLong(a->a).forEach(a -> System.out.println(a));
    
    // Create LongStream using mapToLong
    Stream<Integer> stream5 = Stream.of(1, 2, 3, 4, 5);
    stream5.flatMap(a->Stream.of(a)).collect(Collectors.toList()).forEach(a -> System.out.println(a));
    
  
  }
}
