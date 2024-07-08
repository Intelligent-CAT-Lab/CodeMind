import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
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