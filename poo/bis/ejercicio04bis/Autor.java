package ejercicio04bis;

public class Autor {
	private	 String Nombre;
	private	String Nacionalidad;
	private	int nacimiento;
	private	int defuncion;
	public Autor(String nombre, String nacionalidad, int nacimiento, int defuncion) {
		Nombre = nombre;
		Nacionalidad = nacionalidad;
		this.nacimiento = nacimiento;
		
	}
	public Autor() {
		
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getNacionalidad() {
		return Nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}
	public int getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(int nacimiento) {
		this.nacimiento = nacimiento;
	}
	public int getDefuncion() {
		return defuncion;
	}
	public void setDefuncion(int defuncion){
		this.defuncion=defuncion;
	}
	@Override
	public String toString() {
		return "Autor [Nombre=" + Nombre + ", Nacionalidad=" + Nacionalidad + ", nacimiento=" + nacimiento
				+ ", defuncion=" + defuncion + "]";
	}
	

}
