import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
System.out.println("[INST]9;N;sc.nextInt();"+N);
		int M = sc.nextInt();
System.out.println("[INST]10;M;sc.nextInt();"+M);

		TreeSet<Integer> x = new TreeSet<>();
		for (int i = 1; i*i <= M; i++) {
			if (M % i == 0) {
				x.add(i);
System.out.println("[INST]15;None;x.add(i);"+x.add(i));
				x.add(M / i);
System.out.println("[INST]16;None;x.add(M / i);"+x.add(M / i));
			}
		}

		System.out.println(M/x.ceiling(N));

	}
}
