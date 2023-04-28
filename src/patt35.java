/*
	1 1 1 1 1 
	1 2 1 1 1 
	1 1 3 1 1 
	1 1 1 4 1 
	1 1 1 1 5 
*/

import java.util.*;
public class patt35 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				if(i==j){
					System.out.print(j + " ");
				}
				else{
					System.out.print("1 ");
				}
			}
			System.out.println();
		}
	}
}
