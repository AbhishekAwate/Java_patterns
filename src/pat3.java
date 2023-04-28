/*
 	*****
 	*****
 	*****
 	*****
 	***** 
 */
import java.util.Scanner;
public class pat3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){				
				System.out.print("*");  
			}
			System.out.println();    
			//println will take the cursor down after printing one row.
		}
	}
}
