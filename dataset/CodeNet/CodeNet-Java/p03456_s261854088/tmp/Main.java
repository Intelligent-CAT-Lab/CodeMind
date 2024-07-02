import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next() + sc.next();
System.out.println("[INST]6;None;sc.next();"+sc.next());
System.out.println("[INST]6;None;sc.next();"+sc.next());

		int n = Integer.parseInt(s);
System.out.println("[INST]8;n;Integer.parseInt(s);"+n);
		double sqr = Math.sqrt((double) n);
System.out.println("[INST]9;sqr;Math.sqrt((double) n);"+sqr);
		if (Math.floor(sqr) == sqr) {
System.out.println("[INST]10;None;Math.floor(sqr);"+Math.floor(sqr));
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}
}