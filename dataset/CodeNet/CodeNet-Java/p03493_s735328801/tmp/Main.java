import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
System.out.println("[INST]6;s;sc.next();"+s);

		int counter = 0;
		for (int i=0; i<s.length(); i++) {
System.out.println("[INST]9;None;s.length();"+s.length());
			if ( s.charAt(i) == '1') counter++;
System.out.println("[INST]10;None;s.charAt(i);"+s.charAt(i));
		}
		System.out.println(counter);
	}

}
