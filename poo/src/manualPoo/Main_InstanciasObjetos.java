package manualPoo;



public class Main_InstanciasObjetos {

	public static void main(String[] args) {
		//M E T O D O    Q U E   C R E A      O B J E T O S
		
        //C R E A R      O B J E T O r1
        //Nombre_clase  Nombre_objeto = new   Nombre_del_constructor(); 
		ClaseRectanguloConstructor r1 = new ClaseRectanguloConstructor();
		
		System.out.println("Rectangulo r1: base "+r1.getBase()+" altura "+r1.getAltura()+" color "+r1.getColor());// Es privado
		System.out.println(r1.toString());//toString
		
		//Metodos 
		//incrementar la altura en 1
		r1.setAltura(r1.getAltura()+1);
		System.out.println("altura "+r1.getAltura());
		
		 //Nombre_clase  Nombre_objeto = new   Nombre_del_constructor(base, altura, color);
		//C R E A R      O B J E T O r2
		ClaseRectanguloConstructor r2 =new ClaseRectanguloConstructor(2, 3,"verde");//Dar valores
		
		System.out.println("Rectangulo r2");
		System.out.println("base "+r2.getBase()+" altura "+r2.getAltura()+" color "+r2.getColor());
		System.out.println(r2.toString());
		
		
		System.out.println("area del rectangulo r1 "+r1.area());
		System.out.println("area del rectangulo r2 "+r2.area());
		
		
	}

}




























/*		ClaseRectanguloConstructor	r1; 
		r1=new ClaseRectanguloConstructor();
		System.out.println("Rectangulo r1: base "+r1.getBase()+" altura "+r1.getAltura()+" color "+r1.getColor());
		System.out.println(r1.toString());*/