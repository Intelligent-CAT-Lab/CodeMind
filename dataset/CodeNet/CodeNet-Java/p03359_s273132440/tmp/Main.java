import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int a = sc.nextInt();
System.out.println("[INST]11;a;sc.nextInt();"+a);
		int b = sc.nextInt();
System.out.println("[INST]12;b;sc.nextInt();"+b);
		sc.close();

		int ans = a - 1;
		ans += a <= b ? 1 : 0;

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
