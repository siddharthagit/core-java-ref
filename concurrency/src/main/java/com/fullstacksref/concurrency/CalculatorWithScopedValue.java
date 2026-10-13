package com.fullstacksref.concurrency;

import java.lang.ScopedValue;

public class CalculatorWithScopedValue {

    static final ScopedValue<Integer> A = ScopedValue.newInstance();
    static final ScopedValue<Integer> B = ScopedValue.newInstance();

    public static void main(String[] args) {

        ScopedValue.where(A, 5)
            .where(B, 10)
            .run(() -> {

                int sum = add();
                int product = multiply();

                System.out.println("Sum = " + sum);
                System.out.println("Product = " + product);
            });
        
        //this would fail
        //int sum = add();
        //int product = multiply();
        
        ScopedValue.where(A, 5)
        .where(B, 10)
        .run(() -> {

            int sum2 = add();
            int product2 = multiply();

            System.out.println("Sum = " + sum2);
            System.out.println("Product = " + product2);
            
        });
    }

    static int add() {
        return A.get() + B.get();
    }

    static int multiply() {
        return A.get() * B.get();
    }
}
