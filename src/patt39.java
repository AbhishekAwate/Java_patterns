/*
	5 4 3 2 1 
	5 4 3 2 1 
	5 4 3 2 1 
	5 4 3 2 1 
	5 4 3 2 1
*/
import java.util.*;
public class patt39 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				System.out.print(temp-- + " ");
			}
			temp = n;
			System.out.println();
		}
	}
}
