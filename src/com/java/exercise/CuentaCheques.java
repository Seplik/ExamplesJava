package com.java.exercise;

public class CuentaCheques extends Cuenta {

	public CuentaCheques(double balance) {
		super(balance);
		
	}
	public boolean Retiro(double cantidad){
		boolean bandera = false;
		if(cantidad != 0){
			bandera = true; 
			balance -=cantidad; 
		}
		
		return bandera; 
	}
	

}
