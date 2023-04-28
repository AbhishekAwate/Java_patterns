/*
	 A B C D E 
	  B C D E 
	    C D E 
	      D E 
	        E 
*/
import java.util.*;
public class patt54 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ch = 65;
		for(int i=0; i<n; i++){
			for(int k=0; k<i ; k++){
				System.out.print("  ");
			}
			for(int j=0; j<n-i; j++){
				System.out.print((char)ch++ + " ");
			}
			ch = 65+i+1;
			System.out.println();
		}
	}
}
