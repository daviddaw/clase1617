package ejercicio03bis;

import ejercicio01.LeerTeclado;

public class Main {


	public static void main(String[] args) {
		int x;
		int y;
     Posicion posicion1 = new Posicion(5,3);
     Posicion posicion2 = new Posicion (7,9);

     
     System.out.println("Punto 1 "+posicion1);
     System.out.println("Punto 2 "+posicion2);
     System.out.println("opuesto p1"+posicion1.opuestoXY(posicion1));     
     System.out.println("opuesto p2"+posicion2.opuestoXY(posicion1));
		System.out.println("Introduce un valor para incrementar X en el punto 1");
		x=LeerTeclado.readInteger();
		System.out.println("Introduce un valor para incrementar Y en el punto 1");
		y=LeerTeclado.readInteger();
	   posicion1.incXY(x, y);
	   System.out.println("Punto 1 incrementado"+posicion1.getXY());
	   
	   System.out.println(posicion2.recta(posicion1));
     
	}

}
