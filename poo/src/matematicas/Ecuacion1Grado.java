package matematicas;

public class Ecuacion1Grado {
public static void main(String[] args) {
		

	}
    private int a;
	private int b;
	private int c;
	public Ecuacion1Grado(int a, int b, int c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}
	
	 public int solucion() {
		
		 return  (c-b)/a;
		 
		
	}
	@Override
	public String toString() {
		return "Ecuacion1Grado [a=" + a + ", b=" + b + ", c=" + c
				+ ", solucion()=" + solucion() + "]";
	}
	
}
