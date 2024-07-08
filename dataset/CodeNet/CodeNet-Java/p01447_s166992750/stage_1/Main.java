import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = loop(n);
		System.out.println(r);
		sc.close();
	}

	static int loop(int n) {
		if (n > 0 && n < 4)
			return 1;
		else if (n % 3 == 0)
			return loop(n / 3) + 1;
		else
			return Math.max(loop(n / 3 + 1) + 1, loop(n / 3) + 1);
	}
}