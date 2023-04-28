/*
	1 2 3 4 5 
	2 3 4 5 6 
	3 4 5 6 7 
	4 5 6 7 8 
	5 6 7 8 9  
*/
import java.util.Scanner;
public class pat9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++){
			for(int j=1; j<=n; j++){
				System.out.print(i+j + " ");
			}
			System.out.println();
		}
	}
}