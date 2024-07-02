import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long count =0;
		String s = sc.next();
System.out.println("[INST]7;s;sc.next();"+s);

		int i=0;
		int black=0;
		for (;i<s.length();i++) {
System.out.println("[INST]11;None;s.length();"+s.length());
			if (s.charAt(i)=='W') {
System.out.println("[INST]12;None;s.charAt(i);"+s.charAt(i));
				count +=black;
			} else {
				black++;
			}
		}
		System.out.println(count);
	}
}