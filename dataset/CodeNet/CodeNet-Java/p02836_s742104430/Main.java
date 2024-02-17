//Atcoder ABC147 B

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int length = S.length();
		char c =' ';
		char d =' ';
		int cnt = 0;

		for(int i=0;i<length/2;i++) {
			c = S.charAt(i);
			d = S.charAt(length-i-1);
			if(c!=d) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
