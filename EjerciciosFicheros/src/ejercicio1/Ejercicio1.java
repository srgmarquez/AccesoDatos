package ejercicio1;

import java.io.File;

public class Ejercicio1 {

	public static void main(String[] args) {
		File fich1 = new File("fichero1.txt");
		File fich2 = new File("fichero2.txt");
		File carp1 = new File("carpeta1");
		File carp2 = new File("carpeta2");
		
		File arrayFicheros[] = new File[4];
		arrayFicheros[0] = fich1;
		arrayFicheros[1] = fich2;
		arrayFicheros[2] = carp1;
		arrayFicheros[3] = carp2;
		
		for (int i = 0; i < arrayFicheros.length; i++) {
			if(arrayFicheros[i].exists()) {
				if(arrayFicheros[i].isFile()) {
					System.out.println("El fichero " + arrayFicheros[i] + " existe");
				} else {
					System.out.println("La carpeta " + arrayFicheros[i] + " existe");
				}
			} else {
				System.out.println("El fichero / carpeta " + arrayFicheros[i] +" no existe");
			}
		}
		
		
		
	}

}
