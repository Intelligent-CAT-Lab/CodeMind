import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int p = s.nextInt();
System.out.println("[INST]5;p;s.nextInt();"+p);
		int m = s.nextInt();
System.out.println("[INST]6;m;s.nextInt();"+m);
		int c = s.nextInt();
System.out.println("[INST]7;c;s.nextInt();"+c);
		
		System.out.println(p+m+c);
		
		
	}
}