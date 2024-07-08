import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String s = scan.next();
		int a = 1;
var newVariable_0 = s.equals("SUN");		if (newVariable_0) {
			a = 7;
var newVariable_1 = s.equals("MON");		} else if (newVariable_1) {
			a = 6;
var newVariable_2 = s.equals("TUE");		} else if (newVariable_2) {
			a = 5;
var newVariable_3 = s.equals("WED");		} else if (newVariable_3) {
			a = 4;
var newVariable_4 = s.equals("THU");		} else if (newVariable_4) {
			a = 3;
var newVariable_5 = s.equals("FRI");		} else if (newVariable_5) {
			a = 2;
		} else {

		}

		System.out.println(a);

	}
}