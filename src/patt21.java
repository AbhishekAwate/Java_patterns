/*
	1 2 3 4 5 
	2     5 
	3   5 
	4 5 
	5 
*/
import java.util.*;
public class patt21{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n-i ; j++){
				if(i==0 || i==n-1 || j==0 || j==n-i-1 ){
					System.out.print(i+j+1 + " ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}