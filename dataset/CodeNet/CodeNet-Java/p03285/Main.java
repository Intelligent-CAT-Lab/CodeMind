import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int limit7 = N / 7;
		boolean check = false;
		for (int i = 0; i <= limit7; i++) {
			int left = N-(i*7);
			if (left % 4 == 0) {
				check = true;
			}
		}
		if (check) {
		System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}