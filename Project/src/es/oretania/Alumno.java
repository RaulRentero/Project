package es.oretania;

public class Alumno {

	public static void main(String[] args) {
		String nombre, apellido;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre: ");
		nombre = sc.NextLine();
		System.out.println("Apellido: ");
		apellido = sc.NextLine();
		
		System.out.println(nombre + apellido);
	}
	
}
