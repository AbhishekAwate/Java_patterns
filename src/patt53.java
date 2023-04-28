/*
	A B C D E 
	A B C D E 
	A B C D E 
	A B C D E 
	A B C D E 
*/
import java.util.*;
public class patt53{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ch = 65;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print((char)ch++ + " ");
			}
			ch = 65;
			System.out.println();
		}
	}
}