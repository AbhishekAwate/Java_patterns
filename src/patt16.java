/*
	    1 
	   1 2 
	  1   3 
	 1     4 
	1 2 3 4 5 
*/
import java.util.*;
public class patt16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n ;i++){
			for(int k=0; k<n-1-i; k++){
				System.out.print(" ");
			}
			for(int j=0 ; j<=i ; j++){
				if(j==0 || j==i || i==n-1){
					System.out.print(j+1 + " ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
