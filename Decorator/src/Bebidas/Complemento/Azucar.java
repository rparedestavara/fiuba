package Bebidas.Complemento;

import org.bebidas.Bebidas;

public class Azucar extends Complemento{
	
	public Azucar(Bebidas bebida) {
		this.bebida=bebida;
	}


	@Override
	public double getPrecio() {
		return this.bebida.getPrecio()+3;
	}

	@Override
	public String getDescripcion() {
		if(this.cantAzucar>1) 
		return this.bebida.getDescripcion() +" con "+ this.cantAzucar + " Azucar ";
		return this.bebida.getDescripcion() +" con Azucar ";
	}
	
}
