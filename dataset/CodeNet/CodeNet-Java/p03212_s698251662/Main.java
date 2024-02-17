import java.util.Scanner;

public class Main {
	private static int n = 0;
	private static int ans = 0;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();

		dfs("0");
		System.out.println(ans);
	}

	private static void dfs(String val) {
		if (Long.parseLong(val) > n) {
			return;
		}
		if (val.indexOf("3") != -1 && val.indexOf("5") != -1 && val.indexOf("7") != -1) {
			ans++;
		}

		dfs(val + "3");
		dfs(val + "5");
		dfs(val + "7");
	}
}
