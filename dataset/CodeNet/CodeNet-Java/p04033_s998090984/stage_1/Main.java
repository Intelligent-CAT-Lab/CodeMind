import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong(), b = sc.nextLong();
		sc.close();
		String ans[] = { "Positive", "Negative", "Zero" };
		int an = 0;
		long tmp = a * b;
		if (tmp <= 0)
			an = 2;
		else {
			if (a < 0) {
				tmp = b - a + 1;
				if (tmp % 2 != 0)
					an = 1;
			}
		}
		System.out.println(ans[an]);
	}

}
