package com.java.exercise;

import java.util.List;
import java.util.Scanner;

public class TestBanco {
	public static void main(String []args){
		Cliente cliente = new Cliente();
		CuentaAhorro ca = new CuentaAhorro(3000);
		cliente.setNombre("jose");
		cliente.setApellido("hernandez");
		cliente.setCuenta(ca);
		Banco b = new Banco();
		b.addCliente(cliente);
	  /*  if(cliente.getCuenta().Retiro(4000)== true){
	    	System.out.println("Exito _ " + cliente.getCuenta().getBalance()); 
	    }else{
	    	System.out.println("ya la cagaste"); 
	    }
		*/
		
		System.out.println(b.getCliente(0).getNombre());
	}
	

}
