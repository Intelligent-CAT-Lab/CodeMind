import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
System.out.println("[INST]6;x;sc.nextInt();"+x);
		int y = sc.nextInt();
System.out.println("[INST]7;y;sc.nextInt();"+y);
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
