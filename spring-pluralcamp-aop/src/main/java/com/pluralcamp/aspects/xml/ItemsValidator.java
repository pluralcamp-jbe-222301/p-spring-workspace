package com.pluralcamp.aspects.xml;

//https://www.arquitecturajava.com/spring-aop-y-aspectos/
//https://www.arquitecturajava.com/el-concepto-de-java-proxy-pattern/
/*
 * Terminologia
 * ------------
 * Advice: Aquest és el codi que es vol introduir,
 * és a dir, la funcionalitat que farà l'aspecte.
 * 
 * Punts d'entrada i punts de tall:
 * (join points / point cuts)
 * Join Points: indica els punts del codi on es pot
 * aplicar l'aspecte.
 * Point Cuts: és el join point o subconjunt de join points
 * seleccionats on s'aplicarà l'aspecte.
 * 
 * Aspecte: és l'associació entre el consell (advice)
 * i els punts de tall (point cuts).
 * 
 * Introduction: quan parlem d'introduir nous mètodes
 * o atributs a les classes ja existents.
 * 
 * Exercici:
 * ---------
 * 
 * En aquest exemple interceptarem l'execució del bean
 * Purchase de manera que abans que s'executi el mètode buy()
 * es comprovi la quantitat del producte a comprar, i després 
 * que s'executi el mètode, s'empaquetarà el producte.
 * 
 * També realitzarem una altra acció en cas que el procés 
 * de compra sigui erroni. A continuació es mostra la classe
 * ItemsValidator, que és la classe que implementa el
 * consell (advice).
 * 
 */

public class ItemsValidator {

	//Abans
	public void checkAmount() {
		System.out.println("Comprovant que la quantitat de producte sigui correcte.");		
	}
	
	//Després
	public void pack() {
		System.out.println("S'empaqueten els productes.");
	}
	
	//En llençar una excepció
	public void fileComplain() {
		System.out.println("Complain issued for defective products.");
	}
	
}
