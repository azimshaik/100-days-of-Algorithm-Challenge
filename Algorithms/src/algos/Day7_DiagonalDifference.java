package algos;
import java.util.Scanner;
public class Day7_DiagonalDifference {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] A = new int[n][n];
		int sumD1 = 0;
		int sumD2 = 0;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				A[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(A[i][j]+" ");
			}
			System.out.print("\n");
		}
		//Calcualte the sum of the Diagonal one
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(i==j){
					sumD1 = sumD1+A[i][j];
				}
				if(i+j == n-1){
					sumD2 = sumD2+A[i][j];
				}
			}
		}
		//Calculate the sum of the diagonal two
//		int flag = 0;
//		for(int i=0;i<n;i++){
//			for(int j =0; j<n;j++){
//				if(i+j == n-1){
//					sumD2 = sumD2+A[i][j];
//				}
//			}
//		}
		//System.out.print(sumD1+""+sumD2);
        System.out.println(sumD2-sumD1);
		
	}
}
//00 01 02 03 04
//10 11 12 13 14
//20 21 22 23 24
//30 31 32 33 34
//40 41 42 43 44

//D1 --> i==j
//D2 --> i+j == n-1