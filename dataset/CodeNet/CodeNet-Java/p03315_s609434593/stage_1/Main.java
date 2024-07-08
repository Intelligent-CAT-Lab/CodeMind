import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = 0;

var newVariable_0 = s.length();		for (int i = 0; i < newVariable_0; i++) {
var newVariable_1 = s.charAt(i);			if (newVariable_1 == '+') {
				count++;
			} else {
				count--;
			}
		}

		System.out.print(count);
	}
}