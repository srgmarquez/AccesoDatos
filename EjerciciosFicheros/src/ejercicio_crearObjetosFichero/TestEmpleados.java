package ejercicio_crearObjetosFichero;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import ejercicio_objetosFichero.Agenda;

public class TestEmpleados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombreFichero = "src//ejercicio_crearObjetosFichero//empleados.dat";

		try (FileOutputStream fs = new FileOutputStream(nombreFichero);
				ObjectOutputStream os = new ObjectOutputStream(fs);) {
			String opcion = "";
			do {
				System.out.println("Dime el nombre del empleado");
				String nombre = sc.nextLine();
				System.out.println("Dime el sueldo");
				int sueldo = sc.nextInt();
				System.out.println("Dime el año de nacimiento");
				int año = sc.nextInt();
				System.out.println("Dime la antiguedad del empleado");
				int antiguedad = sc.nextInt();
				sc.nextLine();
				Empleado e1 = new Empleado(nombre, sueldo, año, antiguedad);
				os.writeObject(e1);
				System.out.println("Desea salir? escriba: salir");
				opcion = sc.nextLine();
			} while (!opcion.equals("salir"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		ArrayList<Empleado> listEmpleados = new ArrayList<Empleado>();

		try (FileInputStream fis = new FileInputStream(nombreFichero);
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Empleado e = (Empleado) ois.readObject();
			listEmpleados.add((Empleado) e);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < listEmpleados.size(); i++) {
			System.out.println(listEmpleados.get(i));
		}

	}

}
