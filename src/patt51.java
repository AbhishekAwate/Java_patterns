/*
	1 
	3 2 
	4 5 6 
	10 9 8 7 
	11 12 13 14 15
*/
import java.util.Scanner;
public class patt51 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		
		for(int i=1; i<=n; i++){
			if(i%2 == 0){
				int count_1 = count+i-1;
				for(int j=1; j<=i; j++){
					System.out.print(count_1-- + " ");
					count++;
				}
				System.out.println();
			}
			else{
				for(int j=1; j<=i; j++){
					System.out.print(count++ + " ");
				}
				System.out.println();
			}
		}
	}
}
