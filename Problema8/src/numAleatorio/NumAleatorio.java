package numAleatorio;

import java.util.Scanner;
import java.util.Random;
public class NumAleatorio {

	public static void main(String[] args) {
		int a,b,r;
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese el primer numero(limite inferior): ");
		a=s.nextInt();
		System.out.println("Ingrese el segundo numero(limite superior): ");
		b=s.nextInt();
		Random nums= new Random();
		r=nums.nextInt(b-a+1)+a;
		String uni[] = {"Cero", "Uno", "Dos" ,"Tres" ,"Cuatro" ,"Cinco" ,  
	            "Seis" ,"Siete" ,"Ocho" ,"Nueve","Diez"};  
	    String esp[] = {"Once", "Doce","Trece","Catorce", "Quince",   
	            "Diezciseis", "Diecisiete", "Dieciocho", "Diecinueve",};  
	    String des[] = {"Veinte","Treinta","Cuarenta","Cincuenta", "Sesenta",  
	            "Setenta", "Ochenta", "Noventa"};
	    if(r<11)
	    	System.out.println("El numero aleatorio en el intervalo es: "+uni[r]);
	    else if(r<20)
	    	System.out.println("El numero aleatorio en el intervalo es: "+esp[r-11]);
	    else if (r<100){
	    	int u=0,d=0;
	    	String num=Integer.toString(r);
	    	u=Integer.parseInt(num.substring(1,2));
	    	d=Integer.parseInt(num.substring(0,1));
	    	System.out.println("El numero aleatorio en el intervalo es: \n"+des[d-2]+" y "+uni[u]);
	    }
	    else 
	    	System.out.println("El mumero está fuera del rango");
	   	
	}

}
