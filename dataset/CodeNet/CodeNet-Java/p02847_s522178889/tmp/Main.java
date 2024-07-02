import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String s = scan.next();
System.out.println("[INST]8;s;scan.next();"+s);
		int a = 1;
		if (s.equals("SUN")) {
System.out.println("[INST]10;None;s.equals('SUN');"+s.equals("SUN"));
			a = 7;
		} else if (s.equals("MON")) {
System.out.println("[INST]12;None;s.equals('MON');"+s.equals("MON"));
			a = 6;
		} else if (s.equals("TUE")) {
System.out.println("[INST]14;None;s.equals('TUE');"+s.equals("TUE"));
			a = 5;
		} else if (s.equals("WED")) {
System.out.println("[INST]16;None;s.equals('WED');"+s.equals("WED"));
			a = 4;
		} else if (s.equals("THU")) {
System.out.println("[INST]18;None;s.equals('THU');"+s.equals("THU"));
			a = 3;
		} else if (s.equals("FRI")) {
System.out.println("[INST]20;None;s.equals('FRI');"+s.equals("FRI"));
			a = 2;
		} else {

		}

		System.out.println(a);

	}
}