import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		int ans = a - 1;
		ans += a <= b ? 1 : 0;

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
