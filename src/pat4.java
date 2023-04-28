/*
	11111
	22222
	33333
	44444
	55555
*/
import java.util.Scanner;
public class pat4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){				
				System.out.print(i);         // i = row and j = column.
			}
			System.out.println();    //println take cursor down after printing one row.
		}
	}
}
