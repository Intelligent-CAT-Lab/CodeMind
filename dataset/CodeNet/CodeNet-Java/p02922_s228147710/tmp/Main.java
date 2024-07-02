import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tap = 1;
		int ans = 0;
		int a = sc.nextInt();
System.out.println("[INST]8;a;sc.nextInt();"+a);
		int b = sc.nextInt();
System.out.println("[INST]9;b;sc.nextInt();"+b);
		while(tap < b) {
			tap += a-1;
			ans++;
		}
		System.out.println(ans);

	}

}
