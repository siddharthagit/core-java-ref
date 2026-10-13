package com.fullstacksref.javastream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraysStreamExample {

  public static void main(String[] args) {
    int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    Stream<int[]> stream1 = Stream.of(a);
    stream1.forEach(s->System.out.println(s));
    
    Stream<int []> stream2 = Arrays.stream(a);
    stream2.forEach(p -> System.out.println(p));
    
    Stream<int []> stream3 = Arrays.stream(a);
    //arraycopy: element type mismatch: can not cast one of the elements of java.lang.Object[] to the type of the destination array, java.lang.Integer
    //Integer result [] = stream3.flatMap(Stream::of).toArray(Integer[]::new);
    
    //Type mismatch: cannot convert from IntStream to Stream<? extends Object>
    Integer[] result = stream3.flatMap(list -> Arrays.stream(list).mapToObj(Integer::valueOf)).toArray(Integer[]::new);
    System.out.println(result);

    
    int b[] = {9,10,11,12, 15, 15, 25};
    System.out.println("Min = " + Arrays.stream(b).min());
    
    System.out.println("Max = " + Arrays.stream(b).max());
    
    System.out.println("Sum = " + Arrays.stream(b).sum());
    
    System.out.println("Count = " + Arrays.stream(b).count());
    
    System.out.println("Disctinct Count = " + Arrays.stream(b).distinct().count());
    
    System.out.println("Average = " + Arrays.stream(b).average());
    
    System.out.println("Items greater then 10");
    Arrays.stream(b).filter(item->item>10).forEach(x -> System.out.println(x));
    
    
  }

}
