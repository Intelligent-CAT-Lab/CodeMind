import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N = Integer.parseInt(sc.next());
	static int K = Integer.parseInt(sc.next());
	public static void main(String[] args) {
		if (N >= K*2-1 ) {
			System.out.println("YES");

		} else {

			System.out.println("NO");
		}
	}
}
