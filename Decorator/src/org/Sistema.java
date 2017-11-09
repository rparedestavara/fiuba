package org;

import org.bebidas.Bebidas;
import org.bebidas.Cafe;

import Bebidas.Complemento.Azucar;
import Bebidas.Complemento.Crema;
import Bebidas.Complemento.Leche;

public class Sistema {
	public static void main(String[] args) {
		Bebidas bebida= new Cafe();
		System.out.println(bebida.getDescripcion()+" Cuesta: "+bebida.getPrecio());
		bebida=new Crema(bebida);
		System.out.println(bebida.getDescripcion()+" Cuesta: "+bebida.getPrecio());
		bebida= new Leche(bebida);
		System.out.println(bebida.getDescripcion()+" Cuesta: "+bebida.getPrecio());
		bebida= new Azucar(bebida);
		System.out.println(bebida.getDescripcion()+" Cuesta: "+bebida.getPrecio());
	}

}
