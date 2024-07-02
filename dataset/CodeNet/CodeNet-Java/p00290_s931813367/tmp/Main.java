import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c,sum;
		a = scan.nextInt();
System.out.println("[INST]6;a;scan.nextInt();"+a);
		b = scan.nextInt();
System.out.println("[INST]7;b;scan.nextInt();"+b);
		
		sum = a * b;
		
		System.out.println(sum);
	}
}
