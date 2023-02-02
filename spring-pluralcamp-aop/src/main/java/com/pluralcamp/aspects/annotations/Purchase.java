package com.pluralcamp.aspects.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.pluralcamp.aspects.annotations")
@Component
public class Purchase implements Shopping {
	
	public void buy(boolean error) throws Exception {
		if(error) {
			throw new Exception("Something went wrong");
		}
		System.out.println("Processing the purchase...");		
	}

}
