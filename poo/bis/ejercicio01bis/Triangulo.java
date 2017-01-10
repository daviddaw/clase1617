package ejercicio01bis;

public class Triangulo {
	// Creamos  atibutos
	private double lado;

//CREAMOS    METODO    CONSTRUCTOR       //creamos su estado inicial (le damos valores)
    //con parametro
	public Triangulo(double lado)
	{
		this.lado=lado;
	}
	
    //por defecto
	public Triangulo()
	{
		lado=1;	
	}



//setter por valor fijo
public void setLado(){
	this.lado=14;
}
//Setter modificar con parametro
public void setLado(double lado){//parametro introducido por teclado
	this.lado=lado;
}
//getter
public String getLado(){
	return " es "+lado;
}
//getter
public String getBase(){
	return "" +lado;
}
//getter
public double getAltura(){
	return Math.sqrt( Math.pow(lado, 2)-Math.pow(lado/2, 2));	
}

//getter
public double getarea(){
	return (lado*getAltura())/2;
}
//getter
public double getPerimetro(){
	return lado*3;
}

@Override
public String toString() {
	return "Triangulo [lado=" + lado + ", Base=" + getBase()
			+ ", Altura=" + getAltura() + ", Area=" + getarea()
			+ ", Perimetro=" + getPerimetro() + "]";
}



}