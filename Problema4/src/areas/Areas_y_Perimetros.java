package areas;

import java.util.Scanner;

public class Areas_y_Perimetros {

	
	private static final double PI = 3.141592654;
	public static void main(String[] args) {
		int v=0;
		String op;
		char l,h='C',m='U',n='T';
		Scanner s = new Scanner (System.in);
		System.out.println("Ingrese la instruccion a realizar, Ejemplo C,05 /Resulta el area y perimetro de una circunferencia de radio 5");
		op=s.nextLine();
		l=op.charAt(0);
		v=Integer.parseInt(op.substring(2,4));//el rango de numeros aceptados es [01,99]
		if(l==h){
			double p=0,a=0;
			p=(2*PI*v);
			a=(PI*(v*v));
			System.out.println("El area es: "+a+" El perimetro es:"+p);
		}
		if(l==m){
			int p=0,a=0;
			p=4*v;
			a=(v*v);
			System.out.println("El area es: "+a+" El perimetro es:"+p);
		}
		if(l==n){
			int p=0;
			double H=0,a=0;
			p=3*v;
			a=(0.5)*(v*v);
			H=Math.sqrt((v*v)-((0.5*v)*(0.5*v)));
			System.out.println("El area es: "+a+" El perimetro es:"+p+" La altura es: "+H);
		}		
	}

}       
