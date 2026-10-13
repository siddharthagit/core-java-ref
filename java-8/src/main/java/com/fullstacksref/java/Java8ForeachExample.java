package com.fullstacksref.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForeachExample {
  public static void main(String[] args) {
    List<Integer> myList = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++)
      myList.add(i);

    // traversing using Iterator
    Iterator<Integer> it = myList.iterator();
    while (it.hasNext()) {
      Integer i = it.next();
      System.out.println("Iterator Value::" + i);
    }



    // Using Foreach with annonymous class
    myList.forEach(new Consumer<Integer>() {

      @Override
      public void accept(Integer t) {
        System.out.println("Foreach " + t);
      }
    });

    // Using For each
    myList.forEach(t -> {
      System.out.println("Foreach " + t);
    });
  }
}
