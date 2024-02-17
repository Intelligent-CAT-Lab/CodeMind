import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int s = 0;
		int count =0;
		for (int i=0;i<S.length();i++) {
			if (S.charAt(i)=='S') {
				s++;
			} else if(s>0) {
				s--;
				count +=2;
			}
		}
		System.out.println(S.length()-count);
	}
}