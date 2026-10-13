package com.fullstacksref.concurrency;

public class JavaScopedVariable {

	static final ScopedValue<String> USER = ScopedValue.newInstance();
	static final ScopedValue<String> ACCOUNT = ScopedValue.newInstance();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScopedValue.where(USER, "Sidd").run(() -> {
            greet();
        });
		
	}
	static void greet() {
        System.out.println("Hello " + USER.get());
    }

}
