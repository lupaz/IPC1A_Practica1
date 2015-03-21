package numsPiramide;

import java.util.Scanner;

public class NumsPiramide {

	public static void main(String[] args) {
		int num=0,i=1,j=1,a=1;
		System.out.println("Ingrese un numero entero: ");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		
		while(i<num+1){
			while(j<num+1){
			System.out.print(i);
			j++;
			}
			System.out.println();
			i++;
			a++;
			j=a;
		}
	}

}