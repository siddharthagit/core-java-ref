package com.fullstacksref.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

public class ArrayDequeExample {

  public static void main(String[] args) {
    ArrayDequeExample example = new ArrayDequeExample();

    example.asStack();
    example.asQueue();
  }

  private void asStack() {
    System.out.println(" ==========================");
    Deque<String> stack = new ArrayDeque<String>();

    // push items to stack
    stack.push("Transformers (2007)");
    stack.push("Transformers: Revenge of the Fallen (2009)");
    stack.push("Transformers: Dark of the Moon (2011)");
    stack.push("Transformers: Age of Extinction (2014)");
    stack.push("Transformers: The Last Knight (2017)");
    stack.push("Bumblebee (2018)");

    // Size of the stack
    System.out.println("Size of the stack = " + stack.size());

    // Peek the top of the stack
    System.out.println("Peek top of the stack = " + stack.peek());
    
    assert "Bumblebee (2018)" == stack.peek(): "Should be the last object pushed to stack";

    // Pop the top of the stack
    System.out.println("Pop top of the stack = ");
    assert "Bumblebee (2018)" == stack.pop(): "Should be the last object pushed to stack";

    // Print entries of the Stack
    System.out.println("Entries in the Stack");
    stack.forEach(a -> System.out.println(a));

    // Print entries of the Stack Using Iterator
    System.out.println("Entries in the Stack Using Iterator");
    Iterator<String> it2 = stack.iterator();
    while (it2.hasNext()) {
      String item = it2.next();
      System.out.println(item);
    }


  }

  private void asQueue() {
    System.out.println(" ==========================");
    Queue<String> queue = new ArrayDeque<String>();

    // push items to stack
    queue.offer("Transformers (2007)"); // offer == addLast
    queue.offer("Transformers: Revenge of the Fallen (2009)");
    queue.offer("Transformers: Dark of the Moon (2011)");
    queue.offer("Transformers: Age of Extinction (2014)");
    queue.offer("Transformers: The Last Knight (2017)");
    queue.offer("Bumblebee (2018)");

    // Size of the queue
    System.out.println("Size of the queue = " + queue.size());

    // Peek the top of the queue
    System.out.println("Peek top of the queue = " + queue.peek());
    assert "Transformers (2007)" == queue.peek(): "Should be the last object pushed to stack";


    // Peek the top of the queue
    System.out.println("Poll top of the queue = ");
    assert "Transformers (2007)" == queue.poll(): "Should be the last object pushed to stack";


    // Print entries of the queue
    System.out.println("Entries in the queue");
    queue.forEach(a -> System.out.println(a));

    // Print entries of the Stack Using Iterator
    System.out.println("Entries in the queue Using Iterator");
    Iterator<String> it2 = queue.iterator();
    while (it2.hasNext()) {
      String item = it2.next();
      System.out.println(item);
    }
  }
}
