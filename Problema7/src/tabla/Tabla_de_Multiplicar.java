package tabla;

import java.util.Scanner;

public class Tabla_de_Multiplicar {

	public static void main(String[] args) {
		int v;
		String tab;
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese un numero entre 0 y 10: ");
		v=s.nextInt();
		for(int i=10;i>0;i--){
		tab= v+"X"+i+"="+(v*i);
		System.out.println(tab);
		}
	}

}
