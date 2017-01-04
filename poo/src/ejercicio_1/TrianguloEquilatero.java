package ejercicio_1;

public class TrianguloEquilatero {
	private double lado;
public TrianguloEquilatero() {
	
}
public TrianguloEquilatero(double lado) {
	super();
	this.lado = lado;
}
public double getLado()   {
	return lado;
}
public void setLado(double lado) {
	this.lado = lado;
}
public double getAltura() {
	return Math.sqrt( Math.pow(lado, 2)-Math.pow(lado/2, 2));
}
public double getArea() {
	return (lado*getAltura())/2;

}
 public double  getPerimetro() {
	return lado*3;
}
@Override
public String toString() {
	return "TrianguloEquilatero [lado=" + lado + ",Altura=" + getAltura()
			+ ", Area=" + getArea() + ", Perimetro=" + getPerimetro()
			+ "]";
}





}