import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long a = Long.parseLong(sc.next());
		long b = Long.parseLong(sc.next());
		long x = Long.parseLong(sc.next());
		sc.close();
		long count = b / x - a / x;
		System.out.println(a % x == 0 ? count + 1 : count);
	}
}