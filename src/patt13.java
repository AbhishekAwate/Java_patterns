 /*
	        * 
	      * * 
	    * * * 
	  * * * * 
	* * * * * 
*/
import java.util.*;
public class patt13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i=0; i<n ;i++){
			for(int k=0; k<n-1-i; k++){    //k loop is for spaces in the pattern
				System.out.print("  ");
			}
			for(int j=0 ; j<=i ; j++){     //j loop is for printing stars in the pattern.
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
