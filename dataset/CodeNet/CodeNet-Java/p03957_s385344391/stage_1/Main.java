import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.next();		char[] arr = newVariable_0.toCharArray();
		boolean beforeC = true;
		for (char c : arr) {
			if (beforeC) {
				if (c == 'C') {
					beforeC = false;
				}
			} else {
				if (c == 'F') {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}
