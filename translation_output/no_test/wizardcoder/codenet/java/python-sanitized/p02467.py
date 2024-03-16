import java.util.Scanner;

public class p02467 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.nextLine());
		System.out.print(n + ":");
		for (int i = 2; n >= i * i; i++) {
			if (n % i == 0) {
				n /= i;
				System.out.print(" " + i);
			}
		}
		System.out.println(" " + n);
	}

}