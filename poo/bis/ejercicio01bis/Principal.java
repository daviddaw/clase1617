package ejercicio01bis;

public class Principal {

	public static void main(String[] args) {
		
		double lado;
		System.out.println("Introduce el lado del triangulo");
		lado=LeerTeclado.readInteger();
		
		
		
		
		
		
		
		//triangulo 1
		Triangulo equilatero1=new Triangulo();//triangulo 1
		System.out.println("Triangulo 1");
		
		System.out.println("Lado del constructor por defecto ");
		System.out.println(equilatero1.getLado());
		
		System.out.println("Con toString ");
		System.out.println(equilatero1.toString());
		
		System.out.println("Modificamos lado a un valor fijo");
		equilatero1.setLado();//modificacion
		System.out.println(equilatero1.getLado());
		
		System.out.println("Con toString ");
		System.out.println(equilatero1.toString());
		
		
		
		//triangulo 2
		System.out.println(" ");
		Triangulo equilatero2=new Triangulo(lado);//triangulo 2
		System.out.println("Triangulo 2");
		System.out.println("Lado del constructor con el dato introducido por teclado");//parametro
		System.out.println(equilatero2.getLado());
		
		System.out.println("Modificamos sumandole uno al lado" );
		equilatero2.setLado(lado+1);//modificacion
		System.out.println(equilatero2.getLado());
		
		System.out.println("Con toString ");
		System.out.println(equilatero2.toString());
	}

}
