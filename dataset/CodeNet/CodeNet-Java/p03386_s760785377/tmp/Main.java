import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
System.out.println("[INST]9;A;scan.nextInt();"+A);
		int B = scan.nextInt();
System.out.println("[INST]10;B;scan.nextInt();"+B);
		int K = scan.nextInt();
System.out.println("[INST]11;K;scan.nextInt();"+K);
		Set<Integer> nums = new TreeSet<>();

		for (int i = 0; i < K; i++) {
			if (A + i > B) break;
			nums.add(A + i);
System.out.println("[INST]16;None;nums.add(A + i);"+nums.add(A + i));
		}
		for (int i = K - 1; i >= 0; i--) {
			if (B - i < A) break;
			nums.add(B - i);
System.out.println("[INST]20;None;nums.add(B - i);"+nums.add(B - i));
		}

		nums.forEach(System.out::println);
System.out.println("[INST]23;None;nums.forEach(System.out::println);"+nums.forEach(System.out::println));
 	}
}