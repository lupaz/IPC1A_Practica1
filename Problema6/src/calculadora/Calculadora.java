package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		int op,a,b;
		String p; 
		Scanner l=new Scanner(System.in);
		System.out.println("Ingrese el primer numero: ");
		a=l.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		b=l.nextInt();
		System.out.println("Ingrese el caracter de la operacion deseada: / ejemplo s=suma, r=resta");
		p=l.next();
		char j=p.charAt(0);
		if(j=='s'){
			op=a+b;
			System.out.println("La suma es: "+op);	
		}
		if(j=='r'){
			op=a-b;
			System.out.println("La resta es: "+op);
		}
		if(j=='m'){
			op=a*b;
			System.out.println("La multiplicacion: "+op);
		}
		if(j=='d'){
			op=a/b;
			System.out.println("La division: "+op);
		}
	}
}
