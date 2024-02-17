import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		boolean flg = false;
		for (int i = 0; i <= x; i++) {
			int sum = 2*i + 4*(x-i);
			if (sum == y) {
				flg = true;
				break;
			}
		}
		if (flg) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
