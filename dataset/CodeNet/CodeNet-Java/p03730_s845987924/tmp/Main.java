import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(),B = sc.nextInt(),C = sc.nextInt();
System.out.println("[INST]5;A;sc.nextInt();"+A);
System.out.println("[INST]5;B;sc.nextInt();"+B);
System.out.println("[INST]5;C;sc.nextInt();"+C);
		for(int i = 1; i <= B; i++) {
			if(A*i%B == C) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}
}