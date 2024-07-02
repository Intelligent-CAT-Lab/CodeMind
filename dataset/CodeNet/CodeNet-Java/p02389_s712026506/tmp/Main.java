import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
System.out.println("[INST]5;a;sc.nextInt();"+a);
		int b = sc.nextInt();
System.out.println("[INST]6;b;sc.nextInt();"+b);
		
		String res = new Integer(a * b).toString();
System.out.println("[INST]8;res;new Integer(a * b).toString();"+res);
		res += " ";
		res += (2*a + 2*b);
		System.out.println(res);
	}
}

