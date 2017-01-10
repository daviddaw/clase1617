package ejercicio03bis;

public class Posicion {
private int x;
private int y;


public Posicion() {
	x=0;
	y=0;
}

public Posicion(int x, int y) {

	this.x = x;
	this.y = y;
}
public Posicion(Posicion posicion1) {//constructor
	this.x=posicion1.x;
	this.y=posicion1.y;
	
}

public int getX() {
	return x;
}

public void setXY(int x,int y) {
	this.x = x;
	this.y= y;
}

public int getY() {
	return y;
}
public String getXY(){
	return "("+x+", "+y+")";
}

public void decXY(int x,int y) {
	this.x = this.x-x;
	this.y= this.y-y;
}
public void incXY(int x,int y) {
	this.x = this.x+x;
	this.y= this.y+y;
}
public String recta(Posicion posicion2) {
double m;

	m=(double)((posicion2.y-this.y)/(posicion2.x-this.x));

	
	return  "La ecuacion es igual y-"+this.y+" = "+m+" *(x-"+this.x+")";
	

}

public Posicion opuestoXY(Posicion posicion1){

	Posicion opuesto= new Posicion(y,x);
	return opuesto;
	
}

@Override
public String toString() {
	return "Posicion [x=" + x + ", y=" + y + "]";
}
}

