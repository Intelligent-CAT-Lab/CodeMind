import java.util.Scanner;

/**
 * A : ???????????°?????? / Finger Counting
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;

		long n = sc.nextLong();
System.out.println("[INST]11;n;sc.nextLong();"+n);
		int count = 0;

		if (n > 0) {
			while (n >= 2) {
				n /= 2;
				count++;
			}
			count++;
		}
		System.out.println(count);
	}
}