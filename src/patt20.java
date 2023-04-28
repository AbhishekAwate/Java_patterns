/*
	1 2 3 4 5 
	2 3 4 5 
	3 4 5 
	4 5 
	5 
*/
import java.util.*;
public class patt20{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++){
			for(int j=1; j<=n-i ; j++){
				System.out.print(j+i + " ");
			}
			System.out.println();
		}
	}
}