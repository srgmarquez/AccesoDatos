package ejercicio_leerNumeroCaracteres;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LecturaDeCaracteres {

	public static void main(String[] args) {
		String nombreMiFichero = "src//ejercicio_leerNumeroCaracteres//Fichero.txt";
		File miFichero = new File(nombreMiFichero);
		Map <Integer, Integer> numeroVeces = new HashMap<>();
		
		int contador = 0;
		try(FileReader lectorMiFichero = new FileReader(miFichero)) {
			int caracter = lectorMiFichero.read();
			while(caracter > 0) {
				for(Integer clave:numeroVeces.keySet()) {
					int claveInt = (int) clave;
					int valor = (int) numeroVeces.get(clave);
					if(claveInt == caracter) {
						valor = valor +1;
						contador = 1;
						numeroVeces.replace(clave, valor);
					}
				}
				if(contador == 0) {
					int valor = 1;
					int clave = caracter;
					numeroVeces.put(clave,valor);
				}
				contador = 0;
				caracter = lectorMiFichero.read();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(Integer clave:numeroVeces.keySet()) {
			int valor = (int) numeroVeces.get(clave);
			System.out.println("Numero ASCII "+clave+" está "+valor+" veces");
		}
		

	}

}
