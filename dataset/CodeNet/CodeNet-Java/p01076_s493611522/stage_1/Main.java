import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long N = sc.nextLong();
		long D = sc.nextLong();
		long ans;
		if (D == 1) {
			ans = N * (N - 1) / 2;
		} else {
			long dense = N - D;
			ans = dense * (dense - 1) / 2;
			ans += 2 * dense;
			ans += D - 2;
		}
		System.out.println(ans);
	}

}