package Ejercicio04;

public class Autor {
	private String nombre;
	private String nacion;
	private int anionaci;
	private int aniomue;

	public Autor(){
	}
	public Autor(String nombre, String nacion, int anionaci){
		this.nombre=nombre;
		this.nacion=nacion;
		this.anionaci=anionaci;
	}
	public String getNombre(){
		return this.nombre;
	}
	public String getNacion() {
		return nacion;
	}
	public void setNacion(String nacion) {
		this.nacion = nacion;
	}
	public int getAnionaci() {
		return anionaci;
	}
	public void setAnionaci(int anionaci) {
		this.anionaci = anionaci;
	}
	public int getAniomue() {
		return aniomue;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void fallecer(int anio){
		this.aniomue=anio;
	}
	@Override
	public String toString() {
		return  nombre+" nacion=" + nacion + ", anionaci="
				+ anionaci + ", aniomue=" + aniomue + "]";
	}
	
	
	
	
		
	

}
