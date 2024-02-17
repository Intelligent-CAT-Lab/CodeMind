import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d = Double.parseDouble(sc.next());
		double e = (int)d + 1;
		e = Math.max(e, d / Math.sqrt(2) * 2);
		System.out.println(e);
	}
}
