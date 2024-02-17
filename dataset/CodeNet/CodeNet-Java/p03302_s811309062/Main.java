import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String ans;
		if (a + b == 15) {
			ans = "+";
		} else if (a * b == 15) {
			ans = "*";
		} else {
			ans = "x";
		}
		System.out.println(ans);
	}
}