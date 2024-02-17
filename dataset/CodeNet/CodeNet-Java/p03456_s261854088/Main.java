import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next() + sc.next();

		int n = Integer.parseInt(s);
		double sqr = Math.sqrt((double) n);
		if (Math.floor(sqr) == sqr) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}
}