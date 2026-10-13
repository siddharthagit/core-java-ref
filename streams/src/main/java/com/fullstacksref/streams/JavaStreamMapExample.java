package com.fullstacksref.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamMapExample {

  /**
   * The function you pass to stream.map has to return one object. That means each object in the
   * input stream results in exactly one object in the output stream.
   * 
   * The function you pass to stream.flatMap returns a stream for each object. That means the
   * function can return any number of objects for each input object (including none). The resulting
   * streams are then concatenated to one output stream.
   * 
   * @param args
   */
  public static void main(String[] args) {

    // Use map to convert to upper case
    Stream<String> stream = Stream.of("a", "b", "c", "d", "e");
    stream.map(String::toUpperCase).forEach(x->System.out.println(x));


    // Example 1: Convert Stream to List
    Stream<String> stream2 = Stream.of("a", "b", "c", "d", "e");
    List<String> x2 = stream2.flatMap(a -> Stream.of(a)).collect(Collectors.toList());
    x2.forEach(a->System.out.println(a));
    
    List<List<Integer>> listOfLists = Arrays.asList(
        Arrays.asList(1, 2, 3),
        Arrays.asList(4, 5),
        Arrays.asList(6, 7, 8)
      );


    listOfLists.stream().map(a->a).forEach(x->System.out.println(x));
    /*
     * Output
     * 
     * [1, 2, 3]
       [4, 5]
       [6, 7, 8]
     * */
   
    listOfLists.stream().flatMap(a->a.stream()).forEach(x->System.out.print(x));
    //12345678
  }
}
