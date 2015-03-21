package Problema3;

import java.util.Scanner;

public class notacionHora {

	public static void main(String[] args){
		String x;
		int h,m;
		System.out.println("Ingrese la hora en formato de 24:00 hrs:");
		Scanner s = new Scanner(System.in);
		x = s.nextLine();
		System.out.println("Usted ingreso "+x+" hr(s)");
		h= Integer.parseInt(x.substring(0,2));
		m= Integer.parseInt(x.substring(3,5));
		if(h>12 && m!=0){
			h=(h-12);
		System.out.println("La hora equivalente es "+h+":"+m+" PM");
		}
		else if(h>12){
			h=(h-12);
			System.out.println("La hora equivalente es "+h+":"+m+"0 PM");
		}
		else if(m==0)
			System.out.println("La hora equivalente es "+h+":"+m+"0 AM");
		else
			System.out.println("La hora equivalente es "+h+":"+m+" AM");
	}

}
