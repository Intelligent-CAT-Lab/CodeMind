import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
System.out.println("[INST]8;r;sc.nextInt();"+r);
		int d = sc.nextInt();
System.out.println("[INST]9;d;sc.nextInt();"+d);
		int x = sc.nextInt();
System.out.println("[INST]10;x;sc.nextInt();"+x);

		for (int i = 0; i < 10; i++) {
			x = r * x - d;
			System.out.println(x);
		}

		sc.close();
	}
}