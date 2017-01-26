package algos;

import java.util.Scanner;
import java.util.*;
//https://www.hackerrank.com/challenges/sparse-arrays
public class Day4_SparseArrays {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		String[] A = new String[N];
		for(int i=0; i<N; i++){
			A[i] = sc.next();
		}

		int q = sc.nextInt();
		String[] Q = new String[q];
		for(int i =0; i<q ; i++){
			Q[i] = sc.next();
		}
		
		for(int i=0;i<q;i++){
			int count =0;
			for(int j=0;j<N;j++){
			
				if(Q[i].equals(A[j])){
					//System.out.println(Q[i]+" "+A[j]);
					count++;
				}
			}
			System.out.println(count);
		}

	}

}
