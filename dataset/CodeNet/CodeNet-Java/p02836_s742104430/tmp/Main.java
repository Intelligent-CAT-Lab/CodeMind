//Atcoder ABC147 B

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
System.out.println("[INST]9;S;sc.next();"+S);
		int length = S.length();
System.out.println("[INST]10;length;S.length();"+length);
		char c =' ';
		char d =' ';
		int cnt = 0;

		for(int i=0;i<length/2;i++) {
			c = S.charAt(i);
System.out.println("[INST]16;c;S.charAt(i);"+c);
			d = S.charAt(length-i-1);
System.out.println("[INST]17;d;S.charAt(length-i-1);"+d);
			if(c!=d) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
