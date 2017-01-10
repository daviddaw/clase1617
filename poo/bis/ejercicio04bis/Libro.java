package ejercicio04bis;


public class Libro {
	private String isbn;
	private String titulo;
	private boolean prestado; 
	private Autor autor;
	
	public Libro(String isbn, String titulo,  Autor autor) {
		this.prestado = false;
		this.isbn= isbn;
		this.titulo=titulo;
		this.autor=autor;
	}
	
	
	public Libro() {
	}



	


	/*public Libro(int i, String string, String string2) {
		// TODO Auto-generated constructor stub
	}
*/

	public Libro(int i, String titulo2, String string) {
		// TODO Auto-generated constructor stub
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public boolean isPrestado() {
		return prestado;
	}


	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}


	public Autor getAutor() {
		return autor;
	}


	public void setAutor(Autor autor) {
		this.autor = autor;
	}


	public void prestarLibro(boolean prestado){
		if (!this.prestado){
			System.out.println("El libro está disponible");
		}else{
			System.out.println("El libro no está disponible");
			this.prestado = true;
		}
	}
	public void devolverLibro(){
		if (this.prestado){
		 System.out.println("no se puede devolver,el libro no esta prestado");
		}else {
			System.out.println("libro devuelto");
			this.prestado = false;
		}

	}


	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", prestado=" + prestado + ", autor=" + autor + "]";
	}


	

}
