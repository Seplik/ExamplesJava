package com.java.exercise;

public class CuentaAhorro extends Cuenta {

	public CuentaAhorro(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}
	public boolean Retiro(double cantidad){
		boolean bandera = false;
		if(balance < cantidad){
			balance -=cantidad; 
			bandera = true; 
		}
		
		return bandera; 
	}

}
