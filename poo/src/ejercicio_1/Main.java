package ejercicio_1;

public class Main {

	public static void main(String[] args) {
		double lado;
		double lado2;
		System.out.println("Escribe el lado del primer triangulo:");
		lado=LeerTeclado.readInteger();
		TrianguloEquilatero t1 = new TrianguloEquilatero(lado);
		System.out.println("Su lado es: "+t1.getLado()+" Su altura es "+t1.getAltura()+" su area es "+t1.getArea()+" y su perimetro es"+t1.getPerimetro());
		System.out.println(t1.toString());
		System.out.println("media");
		
		
		System.out.println("Escribe el lado del segundo triangulo");
		lado2=LeerTeclado.readDouble();
		TrianguloEquilatero t2 = new TrianguloEquilatero(lado2);
		
		System.out.println("Su lado es "+t2.getLado()+" Su altura es "+t2.getAltura()+" su area es "+t2.getArea()+" y su perimetro es"+t2.getPerimetro());
		System.out.println(t2.toString());
		
		System.out.println("introduce otro lado para modificar el primer triangulo");
		lado=LeerTeclado.readInteger();
		t1.setLado(lado);
		System.out.println("el nuevo area es "+t1.getArea()+", el nuevo perimetro es "+t1.getPerimetro());
		
	}

}
