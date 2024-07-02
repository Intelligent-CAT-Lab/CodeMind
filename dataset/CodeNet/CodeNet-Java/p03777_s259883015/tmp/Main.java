

import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
System.out.println("[INST]8;a;sc.next();"+a);
		String b = sc.next();
System.out.println("[INST]9;b;sc.next();"+b);

		System.out.println(a.equals(b) ? "H" : "D");
	}
}