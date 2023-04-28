/*
	A B C D E 
	B C D E 
	C D E 
	D E 
	E 
*/
import java.util.*;
public class patt45 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ch = 64;
	
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n-i+1; j++){
				System.out.print((char)(ch+j) + " ");
			}
			ch++;
			System.out.println();
		}
	}
}
