/*
	1 
	3 * 2 
	6 * 5 * 4 
	10 * 9 * 8 * 7 
	15 * 14 * 13 * 12 * 11 
*/
import java.util.*;
public class patt30{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++){     
			int count = (i*(i+1))/2;    //count is important here.
			for(int j=1; j<=i ; j++){  
				System.out.print(count-- + " ");
				if(j<i){
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}