import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.next();var newVariable_1 = sc.next();		String s = newVariable_1 + newVariable_1;

		int n = Integer.parseInt(s);
		double sqr = Math.sqrt((double) n);
var newVariable_2 = Math.floor(sqr);		if (newVariable_2 == sqr) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}
}