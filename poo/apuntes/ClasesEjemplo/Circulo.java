package ClasesEjemplo;

//clase C�rculo definida con un radio, un centro de clase Punto y una variable est�tica de tipo constante

public class Circulo {
	private double radio;
	public static final double PI=3.14;
	private Punto centro;
	
	
	public Circulo(){
		radio=1;
		centro=new Punto(); //el centro del c�rculo se define invocando al constructor vac�o de Punto: (0,0)
	}
	
	public Circulo (double radio){
		this.radio=radio;
		centro=new Punto(1,1);
	}
	
	public Circulo(double radio, Punto centro){
		this.radio=radio;
		this.centro=centro;
	}
	
	public Circulo (double radio, int x, int y){
		this.radio=radio;
		this.centro=new Punto(x,y);
	}
	
	public double getRadio(){
		return this.radio;
	}

	public static double getPi() {
		return PI;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double area(){
		return PI*Math.pow(radio, 2);
	}
	
	public double longitud(){
		return 2*PI*radio;
	}

	public Punto getPunto(){
		return centro;
	}
	
	public void desplazar (int longitud){
		//desplaza el centro del punto; para ello, se llama al m�todo desplazar 
		//de la clase Punto a la cual pertenece el atributo centro
		centro.desplazar(longitud);
	}

	@Override
	public String toString() {
		//a la hora de visualizar el centro, invoco al m�todo toString() de la clase Punto
		return "Circulo [radio=" + radio + ", centro=" + centro.toString() + ", area="
				+ area() + ", longitud=" + longitud() + "]";
	}

	
	
	
}
