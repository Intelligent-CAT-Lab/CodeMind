

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int ans = 0;

		for (int i = 0; i < 100000; i++) {
			if (x <= i * (i + 1) / 2) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}

}
