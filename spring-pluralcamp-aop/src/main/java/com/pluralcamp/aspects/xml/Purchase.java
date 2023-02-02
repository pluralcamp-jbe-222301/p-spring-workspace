package com.pluralcamp.aspects.xml;

public class Purchase implements Shopping {
	
	public void buy(boolean error) throws Exception {
		if(error) {
			throw new Exception("Something went wrong");
		}
		System.out.println("Processing the purchase...");		
	}

}
