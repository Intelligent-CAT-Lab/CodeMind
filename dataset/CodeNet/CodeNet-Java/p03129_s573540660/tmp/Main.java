import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N = Integer.parseInt(sc.next());
System.out.println("[INST]4;N;Integer.parseInt(sc.next());"+N);
System.out.println("[INST]4;None;sc.next();"+sc.next());
	static int K = Integer.parseInt(sc.next());
System.out.println("[INST]5;K;Integer.parseInt(sc.next());"+K);
System.out.println("[INST]5;None;sc.next();"+sc.next());
	public static void main(String[] args) {
		if (N >= K*2-1 ) {
			System.out.println("YES");

		} else {

			System.out.println("NO");
		}
	}
}
