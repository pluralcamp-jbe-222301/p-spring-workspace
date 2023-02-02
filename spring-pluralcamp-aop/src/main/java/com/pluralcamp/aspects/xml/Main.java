package com.pluralcamp.aspects.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext(
						"spring-config.xml");
		Shopping shopping = (Shopping)context.getBean("purchase");
		try {
//			System.out.println("Invoquem sense problemes");
//			shopping.buy(false);
			
			System.out.println("Invoquem per a obtenir un error");
			shopping.buy(true);
		} catch(Exception e) {
			System.out.println("Obtenim l'excepció " + e);
		}		
		context.close();
	}
	

}
