import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
System.out.println("[INST]4;A;sc.nextInt();"+A);
		int B = sc.nextInt();
System.out.println("[INST]5;B;sc.nextInt();"+B);
		int C = sc.nextInt();
System.out.println("[INST]6;C;sc.nextInt();"+C);
		
		if (A > C || A + B < C) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
		
	}
}