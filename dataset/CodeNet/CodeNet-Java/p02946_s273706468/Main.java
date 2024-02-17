import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int k = scanner.nextInt();
			int x = scanner.nextInt();

			List<Integer> integers = new ArrayList<Integer>();

			getMinCoodinate(integers, k, x);
			integers.add(x);
			getMaxCoodinate(integers, k, x);
			Collections.sort(integers);
			integers.forEach(new Consumer<Integer>() {
				private int index = 0;

				@Override
				public void accept(Integer t) {
					if (index == integers.size() - 1) {
						System.out.println(t);
					} else {
						System.out.print(t + " ");
					}
					index++;
				}
			});
		}

	}

	private static void getMaxCoodinate(List<Integer> integers, int k, int x) {
		for (int i = 1; i < k && k > 1; i++) {
			if (x > -1000000) {
				integers.add(--x);
			}
		}
	}

	private static void getMinCoodinate(List<Integer> integers, int k, int x) {
		for (int i = 1; i < k && k > 1; i++) {
			if (x < 1000000) {
				integers.add(++x);
			}
		}
	}

}
