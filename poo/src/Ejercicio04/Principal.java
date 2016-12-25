package Ejercicio04;

public class Principal {

	public static void main(String[] args) {
		Autor aut1,aut2;
		String nombre;
		String nacion;
		int anionaci;
		int aniomue;
		//AUTOR 1
		System.out.println("[Autor]Introduce un nombre");
		nombre=LeerTeclado.readString();
		System.out.println("[Autor]Introduce una nacionalidad");
		nacion=LeerTeclado.readString();
		System.out.println("[Autor]Introduce año de nacimiento");
		anionaci=LeerTeclado.readInteger();
		aut1 = new Autor(nombre, nacion, anionaci);
		// AUTOR 2 (muerto)
		System.out.println("[Autor]Introduce un nombre");
		nombre=LeerTeclado.readString();
		System.out.println("[Autor]Introduce una nacionalidad");
		nacion=LeerTeclado.readString();
		System.out.println("[Autor]Introduce año de nacimiento");
		anionaci=LeerTeclado.readInteger();
		System.out.println("[Autor]Introduce año de defuncion");
		aniomue=LeerTeclado.readInteger();
		aut2 = new Autor(nombre, nacion, anionaci);
		aut2.fallecer(aniomue);

		String isbn,titulo;
		Libro lib1,lib2;
		//LIBRO 1
		System.out.println("[Libro]Introduce un ISBN");
		isbn=LeerTeclado.readString();
		System.out.println("[Libro]Introduce un titulo");
		titulo=LeerTeclado.readString();
		lib1=new Libro(isbn, titulo, aut1);
		//LIBRO 2
		System.out.println("[Libro]Introduce un ISBN");
		isbn=LeerTeclado.readString();
		System.out.println("[Libro]Introduce un titulo");
		titulo=LeerTeclado.readString();
		lib2=new Libro(isbn, titulo, aut2);
		//MUESTRA VALORES
		System.out.println(lib1.toString());
		System.out.println(lib2.toString());
		lib1.setPrestado(true);
		lib1.prestarLibro();
		lib1.setPrestado(false);
		lib1.devolverLibro();
	}
}
