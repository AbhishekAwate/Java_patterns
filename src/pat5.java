/*
	12345
	12345
	12345
	12345
	12345
*/
import java.util.Scanner;
public class pat5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){				
				System.out.print(j);         // i = row and j = column.
			}
			System.out.println();    //println take cursor down after printing one row.
		}
	}
}