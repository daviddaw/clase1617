package ejercicio04bis;


public class Principal {

	public static void main(String[] args) {
		
		Autor autor1 = new Autor("Pedro", "España", 1984, 1985);
		
		Libro librito = new Libro("1234", "El perro verde",autor1);
		System.out.println(autor1.toString());
		System.out.println(librito.toString());
	}

}
