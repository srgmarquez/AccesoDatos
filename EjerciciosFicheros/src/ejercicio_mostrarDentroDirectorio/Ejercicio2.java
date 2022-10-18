package ejercicio_mostrarDentroDirectorio;

import java.io.File;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Dime el nombre de la carpeta");
		String nombre=sc.nextLine();
		System.out.println("Dime el nombre de la extensión");
		String extension=sc.nextLine();
		File carp = new File(nombre);
		String[] lista = carp.list();
		if (lista != null) {
			System.out.println("Los ficheros y directorios que contiene son: ");
			for (int i = 0; i < lista.length; i++) {
				System.out.println(lista[i]);
			}
		} else {
			System.out.println("La carpeta no contiene nada");
		}
	}

}
