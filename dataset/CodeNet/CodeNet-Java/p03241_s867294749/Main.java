import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		TreeSet<Integer> x = new TreeSet<>();
		for (int i = 1; i*i <= M; i++) {
			if (M % i == 0) {
				x.add(i);
				x.add(M / i);
			}
		}

		System.out.println(M/x.ceiling(N));

	}
}
