package anuncio;

public abstract class Anuncio {
private String	nombre;
private String producto;
private int diasEmision;

public Anuncio(String nombre, String producto, int diasEmision) {
	this.nombre = nombre;
	this.producto = producto;
	this.diasEmision = diasEmision;
}

public abstract double costeAnuncio();

@Override
public String toString() {
	return "Anuncio [nombre=" + nombre + ", producto=" + producto + ", diasEmision=" + diasEmision + "]";
}

public String getNombre() {
	return nombre;
}

public String getProducto() {
	return producto;
}

public int getDiasEmision() {
	return diasEmision;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public void setProducto(String producto) {
	this.producto = producto;
}

public void setDiasEmision(int diasEmision) {
	this.diasEmision = diasEmision;
}



}
