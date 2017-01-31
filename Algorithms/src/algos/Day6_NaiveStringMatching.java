package algos;
import java.util.Scanner;

public class Day6_NaiveStringMatching {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		String pat = sc.next();
		for(int i=0;i<=text.length()-pat.length();i++){
			if(pat.equals(text.substring(i, i+pat.length()))){
				System.out.println("String match found at:"+i);
			}
		}
	}

}
//helloworldjavaworld
//world