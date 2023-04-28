/*
	        A 
	      C B A 
	    E D C B A 
	  G F E D C B A 
	I H G F E D C B A 
*/
import java.util.Scanner;
public class patt48 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ch = 65;
		
		for(int i=1; i<=n; i++){
			for(int k=1; k<=n-i; k++){
				System.out.print("  ");
			}
			int temp = ch;
			for(int j=1; j<=(2*i)-1 ; j++){
				System.out.print((char)temp-- + " ");
			}
			System.out.println();
			ch = ch+2;
		}
	}
}
