package cadena;

import java.util.Scanner;

public class CadenaAsteriscos {

	public static void main(String[] args) {
		int n=0,i=0;
		String texto;
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese cualquier texto:");
		texto=s.nextLine();
		n=texto.length();
		System.out.print("La cadena de caracteres es: \n");
		while(i<n){
		 	System.out.print("*");
		 	i++;
		}
	}

}
