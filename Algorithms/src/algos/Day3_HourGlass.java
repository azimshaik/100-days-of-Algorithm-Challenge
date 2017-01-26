package algos;
//https://www.hackerrank.com/challenges/2d-array
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;


public class Day3_HourGlass {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int M = 6;
		int N = 6;
		int[][] A = new int[M][N];
		ArrayList arr = new ArrayList();
		for(int i=0 ; i<M; i++){
			for(int j=0; j<N ; j++){
				A[i][j] = sc.nextInt();
			}
		}
		for(int indexi=0; indexi<M-2; indexi++){
			for(int indexj=0; indexj<N-2; indexj++){
				//hourSum(A,indexi,indexj);
				int sum =0;
				int flag =0;
				for(int i=indexi; i<indexi+3;i++){
					for(int j=indexj; j<indexj+3;j++){
						if(!(flag==3|flag==5)){
							sum = sum+A[i][j];
						}
						flag++;
					}
				}
				//System.out.println("Sum"+sum);
				//arr.add(sum);
			}
		}
		System.out.println(Collections.max(arr));
	}

}
