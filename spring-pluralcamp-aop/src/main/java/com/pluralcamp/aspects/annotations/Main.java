package com.pluralcamp.aspects.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = 
				new AnnotationConfigApplicationContext();
		
		AnnotationConfigApplicationContext annotationContext = 
				(AnnotationConfigApplicationContext)context;
		
		annotationContext.scan("com.pluralcamp.aspects.annotations");
		annotationContext.refresh();
		
		Shopping shopping = (Shopping)context.getBean(Shopping.class);
		
		try {
			System.out.println("Invoquem sense problemes");
			shopping.buy(false);
			
//			System.out.println("Invoquem per a obtenir un error");
//			shopping.buy(true);
		} catch(Exception e) {
			System.out.println("Obtenim l'excepció " + e);
		}		
		context.close();
	}
	

}
