import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
System.out.println("[INST]7;n;sc.nextInt();"+n);
		int m = sc.nextInt();
System.out.println("[INST]8;m;sc.nextInt();"+m);

		System.out.println((n-1)*(m-1));
	}
}