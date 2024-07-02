
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
System.out.println("[INST]13;n;scanner.nextInt();"+n);
		int c = scanner.nextInt();
System.out.println("[INST]14;c;scanner.nextInt();"+c);
		int[] num = new int[n];
		if (c < 0) {
			if (n == 1)
				System.out.println(11);
			else {
				for (int i = 0; i < n * 2; i++)
					System.out.print(9);
				System.out.println();
			}
		} else {
			int a = 1;
			for (int i = 0; i < n; i++)
				a *= 10;
			int b = a / 10;
			a--;
			for (int i = a; i >= b; i--) {
				if (check(i, c))
					return;

			}
		}
	}

	private boolean check(int i, int c) {
		StringBuilder builder = new StringBuilder(String.valueOf(i));
System.out.println("[INST]39;None;String.valueOf(i);"+String.valueOf(i));
		StringBuilder builder2 = new StringBuilder(String.valueOf(i)).reverse();
System.out.println("[INST]40;builder2;new StringBuilder(String.valueOf(i)).reverse();"+builder2);
System.out.println("[INST]40;None;String.valueOf(i);"+String.valueOf(i));
		builder.append(c).append(builder2);
System.out.println("[INST]41;None;builder.append(c).append(builder2);"+builder.append(c).append(builder2));
System.out.println("[INST]41;None;builder.append(c);"+builder.append(c));
		if (prime(Integer.valueOf(builder.toString()))) {
System.out.println("[INST]42;None;Integer.valueOf(builder.toString());"+Integer.valueOf(builder.toString()));
System.out.println("[INST]42;None;builder.toString();"+builder.toString());
			System.out.println(builder);
			return true;
		} else
			return false;

	}

	private boolean prime(int b) {
		for (int i = 2; i * i <= b; i++)
			if (b % i == 0)
				return false;
		return true;
	}
}