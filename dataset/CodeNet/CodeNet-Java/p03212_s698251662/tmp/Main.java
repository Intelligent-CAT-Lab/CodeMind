import java.util.Scanner;

public class Main {
	private static int n = 0;
	private static int ans = 0;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
System.out.println("[INST]7;n;sc.nextInt();"+n);
		sc.close();

		dfs("0");
		System.out.println(ans);
	}

	private static void dfs(String val) {
		if (Long.parseLong(val) > n) {
System.out.println("[INST]15;None;Long.parseLong(val);"+Long.parseLong(val));
			return;
		}
		if (val.indexOf("3") != -1 && val.indexOf("5") != -1 && val.indexOf("7") != -1) {
System.out.println("[INST]18;None;val.indexOf('3');"+val.indexOf("3"));
System.out.println("[INST]18;None;val.indexOf('5');"+val.indexOf("5"));
System.out.println("[INST]18;None;val.indexOf('7');"+val.indexOf("7"));
			ans++;
		}

		dfs(val + "3");
		dfs(val + "5");
		dfs(val + "7");
	}
}
