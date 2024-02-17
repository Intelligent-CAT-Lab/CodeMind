import java.util.Scanner;

/**
 * Red Dragonfly
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x1 = sc.nextInt();
		int x2 = sc.nextInt();

		System.out.println(Math.abs(x1 - x2));
	}
}

