/*   EXAM QUESTION ANGULAR MINDS.
	1 2 
	2 4 8 
	3 6 12 24 
	4 8 16 32 64 
*/
import java.util.*;
public class patt34 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count;
		
		for(int i=1; i<=n; i++){
			count = i;
			for(int j=1; j<=i+1; j++){
				System.out.print(count + " ");
				count = count*2;
			}
			System.out.println();
		}
	}
}