import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int s = 0;
		int count =0;
var newVariable_0 = S.length();		for (int i=0;i<newVariable_0;i++) {
var newVariable_1 = S.charAt(i);			if (newVariable_1=='S') {
				s++;
			} else if(s>0) {
				s--;
				count +=2;
			}
		}
		System.out.println(S.length()-count);
	}
}