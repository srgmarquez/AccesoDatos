package ejercicio_objetosFichero;

import java.io.*;
import java.util.*;

public class TestAgenda {

	public static void main(String[] args) {
		String nombreFichero = "src//ejercicio_objetosFichero//agenda.dat";
				
		Agenda a1 = new Agenda("Ana", "Mart�nez", "Fern�ndez");
		Agenda a2 = new Agenda("Ernesto", "Garc�a", "P�rez");
		try{
			FileOutputStream fs = new FileOutputStream(nombreFichero);//Creamos el archivo
			ObjectOutputStream os = new ObjectOutputStream(fs);//Esta clase tiene el m�todo writeObject() que necesitamos
			os.writeObject(a1);//El m�todo writeObject() serializa el objeto y lo escribe en el archivo
			os.writeObject(a2);
			os.close();//Hay que cerrar siempre el archivo
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		ArrayList<Agenda> listAgenda = new ArrayList<Agenda>();
		try{
			 FileInputStream fis = new FileInputStream(nombreFichero);
			 ObjectInputStream ois = new ObjectInputStream(fis);
			 boolean finalArchivo = false; 
			 while(!finalArchivo) {
				 Agenda a = (Agenda)ois.readObject();
				 listAgenda.add((Agenda)a);	 
			 }	
			 ois.close(); 
			 fis.close();
		}catch(FileNotFoundException e){
			 e.printStackTrace();
		}catch(IOException e){
			 e.printStackTrace();
		}catch(ClassNotFoundException e){
		  e.printStackTrace();
		}
		
		for (int i = 0; i < listAgenda.size(); i++) {
			System.out.println(listAgenda.get(i));
		}
		
		
	}

}
