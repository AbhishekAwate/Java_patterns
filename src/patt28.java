/*
	1 
	2 2 
	3 3 3 
	4 4 4 4 
	5 5 5 5 5 
	4 4 4 4 
	3 3 3 
	2 2 
	1
*/
import java.util.*;
public class patt28{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//first print the upper 5 rows
		for(int i=1; i<=n; i++){     
			for(int j=1; j<=i ; j++){  
				System.out.print(i + " ");
			}
			System.out.println();
		}
		//next print the below 5 rows
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n-i ; j++){  
				System.out.print(n-i + " ");
			}
			System.out.println();
		}
	}
}