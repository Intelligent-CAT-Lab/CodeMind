import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
System.out.println("[INST]8;a;sc.nextInt();"+a);
		int b = sc.nextInt();
System.out.println("[INST]9;b;sc.nextInt();"+b);
		
		sc.close();
		
		int d = a/b;
		int r = a%b;
		String f = String.format("%.5f",  1.0 * a / b);
System.out.println("[INST]15;f;String.format('%.5f',  1.0 * a / b);"+f);
		
		System.out.printf("%d %d %s", d, r, f);
System.out.println("[INST]17;None;System.out.printf('%d %d %s', d, r, f);"+System.out.printf("%d %d %s", d, r, f));
		
	}

}