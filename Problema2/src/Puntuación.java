import java.util.Scanner;


public class Puntuación {

	public static void main(String[] args) {
		int a,b,c,d,e,f;
		int p=0; 
		System.out.println("Introdusca sus notas sobre 100 de cada unidad, una por una:");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		d = s.nextInt();
		e = s.nextInt();
		f = s.nextInt();
		p=((a+b+c+d+e+f)/6);
		
		System.out.println("Media:"+p);
		
		if(0<p && p<60)
			System.out.println("Su nota es E");
		if (59<p && p<70)
			System.out.println("Su nota es D");
		if (69<p && p<80)
			System.out.println("Su nota es C");	
		if (79<p && p<90)
			System.out.println("Su nota es B");
		if (89<p && p<101)
			System.out.println("Su nota es A");
	}
	

}
