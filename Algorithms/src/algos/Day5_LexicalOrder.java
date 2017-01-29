package algos;
import java.util.Scanner;
public class Day5_LexicalOrder {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(s1.length()+s2.length());
		int x = s1.compareTo(s2);
		String status;
		if(x<0){
			status = "Yes";
		}else if(x>0){
			status = "No";
		}else{
			status = "Lexically Equivalent";
		}
		System.out.println(status);
		System.out.println(s1.substring(0, 1).toUpperCase()+s1.substring(1)+" "+s2.substring(0, 1).toUpperCase()+s2.substring(1));
	}
}
