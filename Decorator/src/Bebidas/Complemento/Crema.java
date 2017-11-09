package Bebidas.Complemento;

import org.bebidas.Bebidas;

public class Crema extends Complemento{
	
	public Crema(Bebidas bebida) {
		this.bebida=bebida;
	}

	@Override
	public double getPrecio() {
		return this.bebida.getPrecio()+7;
	}

	@Override
	public String getDescripcion() {
		if(this.cantCrema>1)
		return this.bebida.getDescripcion() +" con "+ this.cantCrema+ "Crema";
		return this.bebida.getDescripcion() +" con Crema";
	}
	
}
