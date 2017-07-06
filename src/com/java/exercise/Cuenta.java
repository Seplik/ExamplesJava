package com.java.exercise;

public class Cuenta {
	
	protected double balance = 0;
	public Cuenta(double balance) {
		// TODO Auto-generated constructor stub
		this.balance = balance; 
	}
	public double getBalance(){
		return balance;
	}
	public void Deposito(double monto){
		balance +=monto;
	}
	public boolean Retiro(double cantidad){
		boolean bandera = false;
		if(balance < cantidad){
			bandera = false; 
			
		}else{
			balance -=cantidad;
			bandera = true; 
		}
		
		return bandera; 
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
    
}
