package cuadrado;

import java.util.Scanner;

public class CuadradoAsteriscos {
	
	public static void main(String[]args){
		int num=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese un numero entero: ");
		num=s.nextInt();
		for (int m=num;m>0;m--){
				for (int n=num;n>0;n--)
					System.out.print("**");//Dos asteriscos para que forme bien el cuadrado. 
		System.out.println();
		}
	}
}