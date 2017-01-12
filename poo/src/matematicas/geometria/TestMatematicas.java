package matematicas.geometria;
import matematicas.Ecuacion1Grado;
import matematicas.LeerTeclado;


public class TestMatematicas {

	public static void main(String[] args) {
		int a,b,c;
		double cateto1;
		double cateto2;
	System.out.println("Escribe un numero");
	a=LeerTeclado.readInteger();
	
    System.out.println("Escribe otro numero");
    b=LeerTeclado.readInteger();
    System.out.println("Escribe un ultimo numero");
    c=LeerTeclado.readInteger();
    System.out.println("escribe un cateto");
    cateto1=LeerTeclado.readInteger();
    System.out.println("escribe otro cateto");
    cateto2=LeerTeclado.readInteger();
    
    Ecuacion1Grado ecuacion=new Ecuacion1Grado(a, b, c);
    System.out.println(ecuacion.toString());
    
	TrianguloRectangulo triangulo1 = new TrianguloRectangulo(cateto1, cateto2);
    System.out.println(triangulo1.toString());
    
	}

}
