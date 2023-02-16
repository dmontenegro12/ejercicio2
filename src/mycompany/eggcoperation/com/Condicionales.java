package mycompany.eggcoperation.com;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		int opinion;
		Scanner leer = new Scanner(System.in);
		System.out.println("Clasifique la pelicula de 1 a 5 estrellas");
		opinion = leer.nextInt();
		if (opinion >= 1 && opinion < 5) {
			switch (opinion) {
			case 1:
				System.out.println("La peli taba fea");
				break;
			case 2:
				System.out.println("la peli taba ahi mas o menos");
				break;
			case 3:
				System.out.println("estaba pasable");
				break;
			case 4:
				System.out.println("muy discreta");
				break;
			case 5:
				System.out.println("estaba buenisima");
				break;
			}
		} else if (opinion < 0) {
			System.out.println("Una opnnion negativa");
		} else if (opinion == 0) {
			System.out.println("el valor  " + opinion + "  no es valido y no se tomara en cuenta");
		} else {
			System.out.println("te gusto mucho nos alegramos por eso gracias");
		}
	}

}


