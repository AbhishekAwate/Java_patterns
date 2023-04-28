/*
	1 1 1 1 2 
	2 2 2 2 3 
	3 3 3 3 4 
	4 4 4 4 5 
	5 5 5 5 6 
*/
import java.util.*;
public class patt27{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n ; j++){  
				if(j<n){
					System.out.print(i + " ");
				}
				else{
					System.out.print(i+1 + " ");
				}
			}
			System.out.println();
		}
	}
}