package ficheroTarjetas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LeeryEscribirTarjetas {

	public static void main(String[] args) {
		
		File mifichero = new File("datos.txt");	
		File nuevoFichero = new File("tarjetas.txt");
		
		try {
			String arrayTextos[] = {"Nombre:", "Apellidos:", "Altura:", "Fecha de nacimiento:", "Teléfono:"};
			int indiceDelArray = 0;
			
			FileReader lectorMiFichero = new FileReader(mifichero);
			FileWriter escribirNuevoFichero = new FileWriter(nuevoFichero, false);

			
			int caracter = lectorMiFichero.read();
			escribirNuevoFichero.write(arrayTextos[indiceDelArray]);
			System.out.print(arrayTextos[indiceDelArray]);
			indiceDelArray++;
			while (caracter > 0) {
				
				if((char)caracter==','){
					caracter = lectorMiFichero.read();
					escribirNuevoFichero.write("\n"+arrayTextos[indiceDelArray]);
					System.out.print("\n"+arrayTextos[indiceDelArray]);
					indiceDelArray++;		 
				}else if((char)caracter=='\n') {
					indiceDelArray = 0;
					escribirNuevoFichero.write("\n" + "\n" + arrayTextos[indiceDelArray]);
					System.out.print("\n" + "\n" + arrayTextos[indiceDelArray]);
					/*if(arrayTextos[indiceDelArray] != "Altura:") {
						caracter = lectorMiFichero.read();
					}*/
					indiceDelArray++;
				} /*else if((char)caracter==',' && arrayTextos[indiceDelArray] == "Altura:") {
					do {
						caracter = lectorMiFichero.read();
					}while((char)caracter!='\n');
				}*/
				escribirNuevoFichero.write(caracter);
				System.out.print((char)caracter);
				caracter = lectorMiFichero.read();
			}
			lectorMiFichero.close();
			escribirNuevoFichero.close(); 				
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
