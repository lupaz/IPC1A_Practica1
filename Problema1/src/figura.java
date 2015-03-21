
public class figura {

	public static void main(String[] args) {
		for (int m=1;m<6;m++){
				for(int k=m;k<5;k++)
					System.out.print(" ");
					for (int n=(2*m-1);n>0;n--)
						System.out.print("*");
			System.out.println();
		}
		for (int m=4;m>0;m--){
			for(int k=m;k<5;k++)
				System.out.print(" ");
				for (int n=(2*m+7);n>8;n--)
					System.out.print("*");
		System.out.println();
		}
	}	
}
