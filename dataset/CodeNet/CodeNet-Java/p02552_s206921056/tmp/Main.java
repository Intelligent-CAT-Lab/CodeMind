import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
System.out.println("[INST]7;i;sc.nextInt();"+i);
		int ans = 1;
		if (i == 1) {
			ans = 0;
		}

		System.out.println(ans);

	}
}