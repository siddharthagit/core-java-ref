package com.fullstacksref.javastream;

import java.util.Arrays;
import java.util.OptionalInt;

public class JavaStreamReduceExample {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    //find the sum of array
    int iarray[] = {9, 10, 11, 12, 15, 15, 25};
    Integer result1 = Arrays.stream(iarray).reduce(0, (x1, x2) -> x1 + x2);
    System.out.println("Sum of Array using reduce " + result1);
    
    OptionalInt result3 = Arrays.stream(iarray).reduce((left, right) ->left + right );
    System.out.println("Sum of Array " + result3);
    
    Integer result2 = Arrays.stream(iarray).sum();
    System.out.println("Sum of Array " + result1);
    
    
    //find the concatenation of character array
    String bc[] = {"a", "b"};
    String totalAgeReduce = Arrays.stream(bc).reduce("", (x1, x2) -> x1.concat(x2));
    System.out.println("Characters Concatenation " + totalAgeReduce);
   
    
    OptionalInt result22 = Arrays.stream(iarray).reduce((left, right) ->left + right );
    System.out.println("Sum of Array " + result2);

    
    OptionalInt result32 = Arrays.stream(new int [1]).reduce((left, right) ->left + right );
    System.out.println("Sum of Array " + result3);

    
  }



}
