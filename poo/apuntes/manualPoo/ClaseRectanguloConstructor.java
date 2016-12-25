package manualPoo;

import ClasesEjemplo.Rectangulo;

// A T R I B U T O S   D E   LA  C L A S E
public class ClaseRectanguloConstructor {
private int base;
int altura;
public String color;





//C R E A M O S   V A R I O S   C O N S T R U C T O R E S     ( SOBRECARGA )


// V A C I O     (pone por defecto valores a los atributos)
public ClaseRectanguloConstructor ( ) 
{
	base  =  1;
	altura=2;
	color = "rojo";
}


// C O N   P A R A M E T R O S
//con dos parametros, color queda en null
public ClaseRectanguloConstructor ( int base, int altura )
{
	this.base =base;
	this.altura=altura;
}

//con tres parametros que invoca al 2º constructor con this(...)
public ClaseRectanguloConstructor (int base,int altura,String color){
	this( base , altura );
	this.color=color;
}

//  Daria error
/*Este constructor daría error porque coincide con la definición del constructor anterior
 * public Rectangulo(int base, int altura, String color) {
	this.base = base;
	this.altura = altura;
	this.color = color;
}
*/


//  M   E   T   O   D   O   S
// G E T T E R S    Y    S E T T E R S
//Getters
public int getBase() {
	return base;
}

public int getAltura() {
	return altura;
}
public String getColor() {
	return color;
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
//Setters
public void setBase(int base) {
	this.base = base;
}

public void setAltura(int altura) {
	this.altura = altura;
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


@Override
public String toString() {//Metodos getters y atributos
	return "Rectangulo [base=" + base + ", altura=" + altura
			+ ", color=" + color + ", area=" + area() + ", perimetro="
			+ perimetro() + "]";
}
 





}
