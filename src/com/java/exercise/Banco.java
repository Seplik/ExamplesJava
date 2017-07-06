package com.java.exercise;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private  List clientes = new ArrayList(10); 
	private int nClientes = 0;  
	
	
	public int getNClientes(){
		return nClientes; 
	}
	public void setNClientes(int i){
		nClientes = i; 
	}
	
	public void addCliente(Cliente c ){
		clientes.add(c); 
		nClientes ++; 
	 }
    public  Cliente getCliente(int i){
    	return (Cliente) clientes.get(i);
     }
   
}

