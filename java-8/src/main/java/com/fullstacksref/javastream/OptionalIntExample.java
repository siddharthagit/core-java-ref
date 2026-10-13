package com.fullstacksref.javastream;

import java.util.Arrays;
import java.util.OptionalInt;

public class OptionalIntExample {

  public static void main(String[] args) {
    int iarray[] = {9, 10, 11, 12, 15, 15, 25};
    
    OptionalInt result = Arrays.stream(iarray).reduce((left, right) ->left );
    
    if (result.isPresent() ) {
      System.out.println("Sum of Array " + result.getAsInt());
    }
    

  }

}
