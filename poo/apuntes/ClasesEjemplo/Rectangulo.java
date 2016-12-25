package ClasesEjemplo;

public class Rectangulo {
	
	private int base;
	int altura;
	public String color;
	
	
	
	//constructor vacío: (pone por defecto valores a los atributos)

public Rectangulo(){
	base=1;
	this.altura=2;
	this.color="rojo";
}




	
	//constructor con dos par�metros: deja el color a null
	public Rectangulo(int base, int altura) {
		
		this.base = base;
		this.altura = altura;
	}
	
	//constructor con tres par�metros que invoca al 2� constructor con this(...)
	public Rectangulo (int base, int altura, String color){
		this(base, altura);
		this.color=color;
	}

	
	/*Este constructor dar�a error porque coincide con la definici�n del constructor anterior
	 * public Rectangulo(int base, int altura, String color) {
		this.base = base;
		this.altura = altura;
		this.color = color;
	}
*/
	//obligatorio los m�todos get y set para base por ser privada, no lo ser�a para el resto de atributos
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void incrementarBase(int inc){
		this.base+=inc;
	}
	
	public void incrementar(int inc){
		this.altura+=inc;
		this.base+=inc;
	}
	
	public double area(){
		return base*altura;
	}
	
	public double perimetro(){
		return 2*base+2*altura;
	}
	
	public boolean areaMayor(Rectangulo r){
		/*if (this.area()>r.area())
			return true;
		else return false;
		*/
		return (this.area()>r.area());
	}

	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + ", color="
				+ color + ", area=" + area() + ", perimetro=" + perimetro()
				+ "]";
	}
	
	
	
	
	
}
