package EmpresaAlm;

import java.util.Scanner;

public class PrincipalDptos {
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Empresas empresas=new Empresas();
		
		int opcion;
		 
		do {
			
			System.out.println("MENU");
			System.out.println(" 1.- Dar de alta departamentos");
			System.out.println(" 2.- Asignar un empleado a un departamento ");
			System.out.println(" 3.- Listar datos de un departamento");
			System.out.println(" 4.- Buscar un empleado en un departamento por código");
			System.out.println(" 5.- Buscar un empleado en un departamento por nombre");
			System.out.println(" 6.- Incrementar el sueldo de un empleado");
			System.out.println(" 7.- Borrar un empleado");
			System.out.println(" 8.- Borrar un departamento");		
			System.out.println(" 9.- Buscar el empleado de mayor sueldo en el departamento");
			System.out.println("10.- Buscar el empleado de mayor sueldo en la empresa");
			System.out.println("11.- Salir");
			
			do {
				System.out.println("Introduce opcion (1-11)");
				opcion =in.nextInt();
			} while (opcion < 1 || opcion > 11);
		
			switch (opcion){
			case 1: empresas.altaDpto() ;break;
			case 2: empresas.asignarEmpDpto();break;
			case 3: empresas.listarDpto();break;
			case 4: empresas.buscarEmpDptoCod();break;
			case 5: empresas.buscrEmpDptoNombre();break;
			case 6: empresas.incremSueldoEmpl();break;
			case 7: empresas.borrarEmpl();break;			
			case 8: empresas.borrarDpto();break;
			case 9: empresas.mayorSueldoDpto();break;
			case 10: empresas.mayorSueldo();break;
			case 11: System.out.println("Fin de programa");break;
			}	
		}
		while (opcion!=11);
		

	}

}
