import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
System.out.println("[INST]6;S;sc.next();"+S);
		int s = 0;
		int count =0;
		for (int i=0;i<S.length();i++) {
System.out.println("[INST]9;None;S.length();"+S.length());
			if (S.charAt(i)=='S') {
System.out.println("[INST]10;None;S.charAt(i);"+S.charAt(i));
				s++;
			} else if(s>0) {
				s--;
				count +=2;
			}
		}
		System.out.println(S.length()-count);
	}
}