import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String s = scan.next();
		int a = 1;
		if (s.equals("SUN")) {
			a = 7;
		} else if (s.equals("MON")) {
			a = 6;
		} else if (s.equals("TUE")) {
			a = 5;
		} else if (s.equals("WED")) {
			a = 4;
		} else if (s.equals("THU")) {
			a = 3;
		} else if (s.equals("FRI")) {
			a = 2;
		} else {

		}

		System.out.println(a);

	}
}