/*
	        5 
	      4 5 
	    3 4 5 
	  2 3 4 5 
	1 2 3 4 5
*/
import java.util.*;
public class patt44 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++){
			int count = n-i+1;
			for(int k=1; k<=n-i; k++){
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++){
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}
}
