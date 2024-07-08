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
var newVariable_0 = Long.parseLong(val);		if (newVariable_0 > n) {
			return;
		}
var newVariable_1 = val.indexOf("3");var newVariable_2 = val.indexOf("5");var newVariable_3 = val.indexOf("7");		if (val.indexOf("3") != -1 && val.indexOf("5") != -1 && newVariable_3 != -1) {
			ans++;
		}

		dfs(val + "3");
		dfs(val + "5");
		dfs(val + "7");
	}
}
