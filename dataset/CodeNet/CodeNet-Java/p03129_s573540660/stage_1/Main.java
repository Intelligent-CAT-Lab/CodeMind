import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.next();	static int N = Integer.parseInt(newVariable_0);
var newVariable_1 = sc.next();	static int K = Integer.parseInt(newVariable_1);
	public static void main(String[] args) {
		if (N >= K*2-1 ) {
			System.out.println("YES");

		} else {

			System.out.println("NO");
		}
	}
}
