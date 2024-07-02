import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int a = sc.nextInt();
System.out.println("[INST]5;a;sc.nextInt();"+a);
			int b = sc.nextInt();
System.out.println("[INST]6;b;sc.nextInt();"+b);
			int c = sc.nextInt();
System.out.println("[INST]7;c;sc.nextInt();"+c);

			System.out.println(String.format("%d %d", Math.min(Math.min(a, b), c), Math.max(Math.max(a, b), c)));
		}
	}
}
