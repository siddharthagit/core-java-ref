package com.fullstacksref.java;

@FunctionalInterface
public interface MyValidFI {

  public abstract String padding(String in, int count);

  default String padding(String in) {
    return in + in;
  }

  static void printME(String s) {
    System.out.println(s);
  }

}
