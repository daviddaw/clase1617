package matematicas.geometria;
import matematicas.Ecuacion1Grado;
import matematicas.LeerTeclado;


public class TestMatematicas {

	public static void main(String[] args) {
		int a,b,c;
	System.out.println("Escribe un numero");
	a=LeerTeclado.readInteger();
	
    System.out.println("Escribe otro numero");
    b=LeerTeclado.readInteger();
    System.out.println("Escribe un ultimo numero");
    c=LeerTeclado.readInteger();
    
    Ecuacion1Grado ecuacion=new Ecuacion1Grado(a, b,c);
    System.out.println(ecuacion.toString());
	}

}
