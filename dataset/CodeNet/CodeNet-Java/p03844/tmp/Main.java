import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System. in);
		int c = 0;
		int a = sc.nextInt();
System.out.println("[INST]5;a;sc.nextInt();"+a);
		String s = sc.next();
System.out.println("[INST]6;s;sc.next();"+s);
		int b = sc.nextInt();
System.out.println("[INST]7;b;sc.nextInt();"+b);
		if(s.equals("+")) {
System.out.println("[INST]8;None;s.equals('+');"+s.equals("+"));
			c = a + b;
		}else if(s.equals("-")) {
System.out.println("[INST]10;None;s.equals('-');"+s.equals("-"));
			c = a - b;
		}
		System.out.print(c);
	}
}