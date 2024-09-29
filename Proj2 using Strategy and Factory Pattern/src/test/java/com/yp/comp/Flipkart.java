package com.yp.comp;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private Courier courier;

	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	public String Shopping(String items[],float prices[]) {
		float bill=0.0f;
		for(int i=0;i<items.length;i++) {
			bill=bill+prices[i];
		}
		int oid=new Random().nextInt(100);
        String status=courier.deliver(oid);
		String fmsg=Arrays.toString(items)+"are purchased with prices "+Arrays.toString(prices)+"The generated bill amount is:"+bill;
		return fmsg+"::::"+status;
				
	}
   
    
}
