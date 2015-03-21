package numPrimos;

import java.util.Scanner;

public class NumPrimos {

	public static void main(String[] args) {
		int num=0,div=0, i=0,j=0,raiz=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese un numero entero: ");
		num=s.nextInt();
		for(i=2;i<num+1;i++){
			div=0;
			raiz=(int)Math.sqrt(i);
			for(j=1;j<=raiz;j++){
				if (i%j==0)
				div++;
				}
			if (div<=1)
				System.out.println (i + " es numero primo" );
		}	
	}

}
