package ClasesEjemplo;

public class Principal {

	public static void main(String[] args) {
		//m�todo que crea objetos de clase Rect�ngulo y C�rculo
		//r1
		Rectangulo r1; 
		r1=new Rectangulo();
		System.out.println("Rectangulo r1: base "+r1.getBase()+" altura "+r1.getAltura()+" color "+r1.getColor());
		System.out.println(r1.toString());
		
		
		
		
		//r2
		Rectangulo r2=new Rectangulo(2,3,"verde");
		System.out.println("Rectangulo r2: base "+r2.getBase()+" altura "+r2.getAltura()+" color "+r2.color);
		System.out.println(r2.toString());
		
		
		
		//r3
		Rectangulo r3=new Rectangulo(4, 6);
		System.out.println("Rectangulo r3: base "+r3.getBase()+" altura "+r3.getAltura()+" color "+r3.color);
		
		//incrementar la altura de r1 sum�ndole 1
		
		/*int aux=r1.getAltura()+1; //guardo en aux el valor actual de la altura de r1 y le sumo 2
		r1.setBase(aux);
		System.out.println("Rectangulo r1: base "+r1.getBase()+" altura "+r1.getAltura()+" color "+r1.getColor());*/
		
		//mejor:
		r1.setBase(r1.getBase()+1);
		
		//tambi�n:		
		r1.incrementarBase(1); //ya que tenemos ese m�todo definido
		
		System.out.println(r1.toString());
		System.out.println("area del rectangulo r1 "+r1.area());
		System.out.println("area del rectangulo r2 "+r2.area());
		//Decir que triangulo es mayor
		if (r1.area()>r2.area())
			System.out.println("El area del rectangulo r1 es mayor que el del r2");
		else
			System.out.println("El area del rectangulo r1 es menor que el del r2");
	    //Otra forma
		if (r1.areaMayor(r2))
			System.out.println("El area del rectangulo r1 es mayor que el del r2");
		else
			System.out.println("El area del rectangulo r1 es menor que el del r2");
		
		Circulo c1, c2;
		c1=new Circulo();
		c2=new Circulo(3,5,8);
		
		System.out.println(Circulo.PI);
		System.out.println(Circulo.getPi());
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		//desplazo las coordenadas del centro del punto (lo que hace es invocar al m�todo desplazar() de su atributo centro que es un Punto)
		c1.desplazar(3);
		System.out.println(c1.toString());
		
		//podemos comparar �reas de C�rculos y Rect�ngulos
		
		if (r1.area()> c1.area())
			System.out.println("El area del rectangulo r1 es mayor que el del c�rculo 1");
			else
				System.out.println("El area del rectangulo r1 es menor que el del c�rculo 1");
		
		
	}

}
