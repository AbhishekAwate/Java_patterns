/*
	E D C B A 
	E D C B 
	E D C 
	E D 
	E
*/
import java.util.Scanner;
public class patt46 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ch = 65 + n-1;
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n-i+1 ; j++){
				System.out.print((char)ch-- + " ");
			}
			ch = 65 + n-1;
			System.out.println();
		}
	}
}
