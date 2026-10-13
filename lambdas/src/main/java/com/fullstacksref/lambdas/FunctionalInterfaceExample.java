package com.fullstacksref.lambdas;

public class FunctionalInterfaceExample {

  public static void main(String[] args) {

    //By Implementing the interface
    MyValidFIImpl func = new MyValidFIImpl();
    MyValidFI.printME(func.padding("java", 4));


    //By using Lambda expressions
    MyValidFI in = (String s, int count) -> {
      for (int i = 0; i < count; i++)
        s = s + s;
      return s;
    };

    MyValidFI.printME(in.padding("Java", 4));
  }

}


class MyValidFIImpl implements MyValidFI {

  @Override
  public String padding(String in, int count) {
    for (int i = 0; i < count; i++)
      in = in + in;
    return in;
  };
}
