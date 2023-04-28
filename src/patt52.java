/*
	E E E E E 
	D D D D 
	C C C 
	B B 
	A 
*/
import java.util.*;
public class patt52{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ch = 64+n;
		for(int i=0; i<n; i++){
			for(int j=0; j<n-i; j++){
				System.out.print((char)ch + " ");
			}
			ch--;
			System.out.println();
		}
	}
}