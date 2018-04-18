package Taller;

public class Vehiculo {
	//A
	String marca;

	public Vehiculo(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + "]";
	}

}
