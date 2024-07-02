import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
System.out.println("[INST]7;a;sc.nextInt();"+a);
		int b = sc.nextInt();
System.out.println("[INST]8;b;sc.nextInt();"+b);
		int c = sc.nextInt();
System.out.println("[INST]9;c;sc.nextInt();"+c);
		int count = 0;

		while (b >= a) {
			count++;
			b -= a;
			if (count >= c) {
				break;
			}
		}
		System.out.print(count);

	}
}