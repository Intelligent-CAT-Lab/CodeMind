import java.util.Scanner;

/**
 * Red Dragonfly
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x1 = sc.nextInt();
System.out.println("[INST]11;x1;sc.nextInt();"+x1);
		int x2 = sc.nextInt();
System.out.println("[INST]12;x2;sc.nextInt();"+x2);

		System.out.println(Math.abs(x1 - x2));
	}
}

