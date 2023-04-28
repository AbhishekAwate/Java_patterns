/*
	1 1 1 1 1 
	0 1 1 1 1 
	0 0 1 1 1 
	0 0 0 1 1 
	0 0 0 0 1 
*/
import java.util.*;
public class patt41 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++){
			for(int k=0; k<i; k++){
				System.out.print("0 ");
			}
			for(int j=0; j<n-i; j++){
				System.out.print("1 ");
			}
			System.out.println();
		}
	}
}
