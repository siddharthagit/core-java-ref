package com.fullstacksref.streams;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

  public static void main(String[] args) {
    System.out.println("Hello World!");

    // Create Stream of similar data types
    Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

    // Generate Unlimited limit of streams
    Stream<String> stream2 = Stream.generate(() -> {
      return "abc";
    });
    // stream2.forEach(a->System.out.println(a));

    // Generate Stream of random numbers between 0 to 9
    Stream<Double> stream3 = Stream.generate(() -> {
      return new Random().nextDouble(9);
    });
    // stream3.forEach(a->System.out.println(a));

    // Generate Stream by using anonymous class
    Stream.generate(new Supplier<Double>() {

      @Override
      public Double get() {
        return new Random().nextDouble(9);
      }
    });

    // Empty stream
    Stream<Double> stream5 = Stream.empty();
    stream5.forEach(a -> System.out.println(a));

    // Generate stream of character values from string
    IntStream stream6 = "abc".chars();
    stream6.forEach(a -> System.out.println(a));



    // Converting Streams to Collection
    Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5);
    List<Integer> list = intStream.collect(Collectors.toList());
    System.out.println(list); // prints [1, 2, 3, 4, 5]
    
    
    Stream<Integer> numStream = Stream.of(1, 2, 3, 4, 5);
    double x = numStream.collect(Collectors.averagingInt(num -> num));
    System.out.println(x);
    
    
    Stream<Integer> numStream2 = Stream.of(1, 2, 3, 4, 5);
    double x2 = numStream2.map(a->a*2).count();
    System.out.println(x2);
    
    
  }
}
