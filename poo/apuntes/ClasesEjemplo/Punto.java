package ClasesEjemplo;
//clase Punto con dos coordenadas x e y
public class Punto {
	private int x;
	private int y;
	
	public Punto(){
		//x e y valdr�n 0 por defecto
	}
	
	public Punto(int x, int y){
		this.x=x;
		this.y=y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
	public void desplazar(int longitud){
		this.x+=longitud;
		this.y+=longitud;
	}
	

}
