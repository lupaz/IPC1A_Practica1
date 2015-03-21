package fechas;

import java.util.Scanner;

public class Fechas{
	
	public static void main(String[] args){
		int D=0,d=0,M=0,m=0,A=0,a=0,dif=0;
		String f,F;
		Scanner s=new Scanner(System.in);
		System.out.println("ingrese la primera Fecha: / Ejemplo(dd/mm/aaaa)");
		f=s.nextLine();
		System.out.println("ingrese la segunda fecha: ");
		F=s.nextLine();
		D=Integer.parseInt(F.substring(0,2));
		d=Integer.parseInt(f.substring(0,2));
		M=Integer.parseInt(F.substring(3,5));
		m=Integer.parseInt(f.substring(3,5));
		A=Integer.parseInt(F.substring(6,10));
		a=Integer.parseInt(f.substring(6,10));
		dif=((Math.abs((D-d))+(Math.abs((M-m)*30)))+(Math.abs((A-a)*365)));
		System.out.println("La diferencia de dias es: "+dif);
	}
	

}
