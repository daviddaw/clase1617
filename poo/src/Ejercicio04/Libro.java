package Ejercicio04;

public class Libro {
	private String isbn,titulo;
	private boolean prestado;
	private Autor autor;
	
	public Libro (String isbn, String titulo, Autor autor) {
		this.isbn=isbn;
		this.titulo=titulo;
		this.autor=autor;
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
	public void prestarLibro () {
		if (this.prestado==false){
			System.out.println("El libro está disponible");
		}else{
			System.out.println("El libro no está disponible");
		}
	}
	public void devolverLibro () {
		if (this.prestado==true){
			System.out.println("El libro está prestado");
		}else{
			System.out.println("El libro no está prestado");
		}
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", prestado="
				+ prestado + ", autor=" + autor + "]";
	}
	

}
