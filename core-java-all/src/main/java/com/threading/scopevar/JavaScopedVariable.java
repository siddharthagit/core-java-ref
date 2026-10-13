package com.threading.scopevar;

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
		ACCOUNT.
        System.out.println("Hello " + USER.get());
    }

}
