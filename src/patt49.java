/*
	        E         
	      D   D       
	    C       C     
	  B           B   
	A               A 
	  B           B   
	    C       C     
	      D   D       
	        E          
*/
import java.util.*;
public class patt49{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ch = 64+n;
		
		//UPPER DIAMOND
		for(int i=1; i<=n; i++){
			for(int j=1; j<=2*n-1; j++){
				if(j == n-(i-1) || j == n+(i-1)){
					System.out.print((char)ch + " ");
				}
				else{
					System.out.print("  ");
				}
			}
			ch--;
			System.out.println();
		}
		//LOWER DIAMOND
		ch = ch+2;
		for(int i=n-1; i>0; i--){
			for(int j=1; j<=(2*n)-1; j++){
				if(j == n-(i-1) || j == n+(i-1)){
					System.out.print((char)ch + " ");
				}
				else{
					System.out.print("  ");
				}
			}
			ch++;
			System.out.println();
		}
	}
}
