package com.fullstacksref.streams;

import java.util.stream.Stream;

public class JavaStreamFilterExample {

  public static void main(String[] args) {
    
    //Filter all numbers greater then 2
    Stream<Integer> numStream2 = Stream.of(1, 2, 3, 4, 5);
    long x2 = numStream2.filter(num -> num > 2).count();
    System.out.println(x2);
    
    //Filter all Even Numbers 
    Stream<Integer> numStream3 = Stream.of(1, 2, 3, 4, 5);
    long x3 = numStream3.filter(num -> num % 2 == 0).count();
    System.out.println(x3);

  }

}
