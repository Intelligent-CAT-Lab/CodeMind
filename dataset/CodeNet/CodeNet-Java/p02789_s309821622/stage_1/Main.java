import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！

		Scanner sc = new Scanner(System.in);

		// 問題数
		int n = sc.nextInt();
		// 提出数
		int m = sc.nextInt();

		String re = "No";
		if (n == m)
			re = "Yes";

		System.out.println(re);

	}

}