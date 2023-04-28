/*
	5 5 5 5 5 
	4 4 4 4 4 
	3 3 3 3 3 
	2 2 2 2 2 
	1 1 1 1 1 
*/
import java.util.*;
public class patt38 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				System.out.print(temp + " ");
			}
			temp--;
			System.out.println();
		}
	}
}
