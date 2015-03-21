package numRomanos;

import java.util.Scanner;

public class NumRomanos {

	public static void main(String[] args) {
		int n=0,M=0,C=0,D=0,U=0;
		String num;
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese un numero entero en el rango (0,3999): ");
		n=s.nextInt();
		String uni[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
		String des[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String cen[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String mil[]={"M","MM","MMM"};
		num=Integer.toString(n);
		if(n<10)
			System.out.println("El numero romano equivalente es: \n"+uni[n]);
		//M=Integer.parseInt(num.substring(0,1));
		//System.out.println(M);
		else if(n<100){
			D=Integer.parseInt(num.substring(0,1));
			U=Integer.parseInt(num.substring(1,2));
			System.out.println("El numero romano equivalente es: \n"+des[D]+uni[U]);
		}
		else if(n<1000){
			C=Integer.parseInt(num.substring(0,1));
			D=Integer.parseInt(num.substring(1,2));
			U=Integer.parseInt(num.substring(2,3));
			System.out.println("El numero romano equivalente es: \n"+cen[C]+des[D]+uni[U]);
		}
		else if(n<4000){
			M=Integer.parseInt(num.substring(0,1));
			C=Integer.parseInt(num.substring(1,2));
			D=Integer.parseInt(num.substring(2,3));
			U=Integer.parseInt(num.substring(3,4));
			System.out.println("El numero romano equivalente es: \n"+mil[M-1]+cen[C]+des[D]+uni[U]);
			}
		else
			System.out.println("El numero ingresado está fuera de rango");
	}

}
