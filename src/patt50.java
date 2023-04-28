/*
	        E 
	      D E 
	    C D E 
	  B C D E 
	A B C D E 
*/
import java.util.Scanner;
public class patt50 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ch = 64+n;
		
		for(int i=1; i<=n; i++){
			for(int k=1; k<=n-i; k++){
				System.out.print("  ");
			}
			for(int j=1; j<=i ; j++){
				System.out.print((char)ch++ + " ");
			}
			ch = 64+n-i;
			System.out.println();
		}
	}
}
