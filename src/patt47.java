/*
	    A 
	   B B 
	  C C C 
	 D D D D 
	E E E E E 
*/
import java.util.Scanner;
public class patt47 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ch = 65;
		
		for(int i=1; i<=n; i++){
			for(int k=1; k<=n-i; k++){
				System.out.print(" ");
			}
			for(int j=1; j<=i ; j++){
				System.out.print((char)ch + " ");
			}
			ch++;
			System.out.println();
		}
	}
}
