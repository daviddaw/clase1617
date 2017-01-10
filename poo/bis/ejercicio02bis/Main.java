package ejercicio02bis;



import ejercicio01bis.LeerTeclado;


// mejor con get y set pedir 
public class Main {

	public static void main(String[] args) {
		String nombre,color,nombre2,color2;
		Double precio;
		
		System.out.println("articulo 1");
		System.out.println("Introduzca el nombre");
		nombre2=LeerTeclado.readString();
		System.out.println("Introduzca el color");
		color2=LeerTeclado.readString();
		Articulo Articulo1 = new Articulo(nombre2, color2);
		Articulo1.setColor(color2);
		
		
		System.out.println("articulo 2");
		System.out.println("Introduzca el nombre");
		nombre=LeerTeclado.readString();
		System.out.println("Introduzca el color");
		color=LeerTeclado.readString();
		System.out.println("Introduzca el precio");
		precio=LeerTeclado.readDouble();
		Articulo Articulo2 = new Articulo(nombre, color, precio);
		
		
		System.out.println("articulo 3 datos automaticos");
		Articulo Articulo3 = new Articulo();
		Articulo3.setPrecio(3.0);
		System.out.println("");
		System.out.println("");
		
		

		
		System.out.println("Articulo 1 "+Articulo1);
		System.out.println("Articulo 2 "+Articulo2);
		System.out.println("Articulo 3 "+Articulo3);
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");

		System.out.println("Articulo 1 "+Articulo1);
		System.out.println("Articulo 2 "+Articulo2);
		System.out.println("Articulo 3 "+Articulo3);
		
		
		
	}

}
