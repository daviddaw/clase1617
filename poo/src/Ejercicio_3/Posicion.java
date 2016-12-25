package Ejercicio_3;

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
public Posicion(Posicion posicion1) {
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

public void decXY(int x,int y) {
	this.x = this.x-x;
	this.y= this.y-y;
}
public void incXY(int x,int y) {
	this.x = this.x+x;
	this.y= this.y+y;
}
public int recta(Posicion posicion2) {
int m;
	this.x=posicion2.x;
	this.y=posicion2.y;
	m=(posicion2.y-this.y)/(posicion2.x-this.x);
	return m;
	

}
}