package dad.maven.gson;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		String nombre;
		String apellidos;
		int edad;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Nombre: ");
		nombre = scanner.nextLine();

		System.out.print("Apellidos: ");
		apellidos = scanner.nextLine();

		System.out.print("Edad: ");
		edad = scanner.nextInt();
		scanner.close();
		Persona p = new Persona(nombre, apellidos, edad);

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
	}

}
