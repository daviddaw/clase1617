package ejercicio_2;

public class Articulo {
private static int contador;	
private int codigo;
public String  nombre;
private String color;
private Double precio;


public Articulo( String nombre, String color, Double precio) {
	
	contador++;
	codigo=contador;
	this.nombre = nombre;
	this.color = color;
	this.precio = precio;
}



public Articulo() {
	
	contador++;
	codigo=contador;
	this.precio = 6.0;
	//
	nombre = "tijeras";
	color = "amarillo";
	//
}



public Articulo(String nombre, String color) {
	contador++;
	codigo=contador;
	this.nombre=nombre;
	this.color=color;
	//
	precio = 5.0;
	//
}



public int getCodigo() {
	return codigo;
}



public void setCodigo(int codigo) {
	this.codigo = codigo;
}



public String getColor() {
	return color;
}



public void setColor(String color) {
	this.color = color;
}



public Double getPrecio() {
	return precio;
}



public void setPrecio(Double precio) {
	this.precio = precio;
}

public void incrementarPrecio(double precio){
	this.precio=this.precio+precio;
}

public void rebajarPrecio(double precio){
	this.precio=this.precio*100/10;
}



@Override
public String toString() {
	return "Articulo [codigo=" + codigo + ", nombre=" + nombre + ", color="
			+ color + ", precio=" + precio + "]";
}






}
