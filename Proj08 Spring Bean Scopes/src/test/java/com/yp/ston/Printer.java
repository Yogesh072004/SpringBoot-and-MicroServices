package com.yp.ston;

public class Printer {
    private static Printer INSTANCE;
    
    private Printer() {
    	System.out.println("printer::0-param");
    }
    public static Printer getInstance() {
    	if(INSTANCE== null) {
    		INSTANCE=new Printer();
    		
    	}
    	return INSTANCE;
    	
    }
    public void print(String msg) {
    	System.out.println(msg);
    }
}
