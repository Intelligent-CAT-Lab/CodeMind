import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
System.out.println("[INST]6;x;sc.nextInt();"+x);
		int y = sc.nextInt();
System.out.println("[INST]7;y;sc.nextInt();"+y);

		System.out.println(x % y == 0 ? -1 : x );

		sc.close();
	}
}

