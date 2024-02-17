import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		call(new Scanner(System.in).nextInt());
	}

	static void call(int n) {
		for (int i = 1; i <= n; i++) {
			int x = i;
			if (x % 3 == 0) {
				System.out.print(" " + i);
			} else {
				while (true) {
					if (x % 10 == 3) {
						System.out.print(" " + i);
						break;
					}
					
					x /= 10;
					if (x == 0) {
						break;
					}
				}
			}
		}
		System.out.println();
	}
}