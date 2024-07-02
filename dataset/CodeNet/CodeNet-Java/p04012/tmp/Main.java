import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String w = sc.next();
System.out.println("[INST]5;w;sc.next();"+w);
		char[] c = w.toCharArray();
System.out.println("[INST]6;c;w.toCharArray();"+c);
		char a = 'a';
		int acha = (int)a;
		a = 'z';
		int zcha = (int)a;
		int count = 0;
		for (int i = acha; i < zcha + 1; i++) {
			for (char x: c) {
				if (x == (char)i) {
					count++;
				}
			}
			if (count % 2 == 1) {
				System.out.println("No");
				return;
			}
			count = 0;
		}
		System.out.println("Yes");
	}
}