package Bebidas.Complemento;

import org.bebidas.Bebidas;

public class Leche extends Complemento{
	
	public Leche(Bebidas bebida) {
		this.bebida=bebida;
	}

	@Override
	public double getPrecio() {
		return this.bebida.getPrecio()+5;
	}

	@Override
	public String getDescripcion() {
		if(this.cantLeche>1) {
		return this.bebida.getDescripcion() +" con "+ this.cantLeche+ "Leche";}
		return this.bebida.getDescripcion() +" con Leche";
	}
	
}
