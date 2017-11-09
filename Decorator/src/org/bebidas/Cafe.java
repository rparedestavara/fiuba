package org.bebidas;

public class Cafe extends Bebidas{

	@Override
	public double getPrecio() {
		return 30;
	}

	@Override
	public String getDescripcion() {
		return "Cafe";
	}

}
