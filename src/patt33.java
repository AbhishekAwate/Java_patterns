/*
	A 
	C B 
	D E F 
	J I H G 
	K L M N O  
*/
import java.util.*;
public class patt33{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char ch = 'A';
		
		for(int i=1; i<=n; i++){
			if(i%2 == 0){
				char chRev = (char)(ch+i-1);
				for(int j=1; j<=i; j++){
					System.out.print(chRev-- + " ");
					ch++;
				}
				System.out.println();
			}
			else{
				for(int j=1; j<=i; j++){
					System.out.print(ch + " ");
					ch++;
				}
				System.out.println();
			}
		}
	}
}