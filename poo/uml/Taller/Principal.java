package Taller;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//objeto
		Scanner sc = new Scanner(System.in);
		int opcion;

		do {
			do {
				System.out.println("Elige una opción:" + "\n	1. ." + "\n	2. ." + "\n	3. ." + "\n	4. ." + "\n	5. ."
						+ "\n	6. ." + "\n	7. ." + "\n	8. ." + "\n	9. ." + "\n	10. ." + "\n	11. ." + "\n	12. ."
						+ "\n	13. .");
				opcion = sc.nextInt();
			} while (opcion < 1 || opcion > 14);

			switch (opcion) {
			case 1:
				//	objeto.metodo(sc);

				break;
			case 2:
				//objeto.metodo(sc);
				break;
			case 3:
				//objeto.metodo(sc);;
				break;
			case 4:
				//Metodos
				break;
			case 5:
				//Metodos
				break;
			case 6:
				//Metodos
				break;
			case 7:
				//Metodos
				break;
			case 8:
				//Metodos;
				break;
			case 9:
				//Metodos
				break;
			case 10:
				//Metodos
				break;
			case 11:
				//Metodos
				break;
			case 12:
				//Metodos
				break;
			default:
				break;
			}
		} while (opcion != 13);

		sc.close();
	}

}