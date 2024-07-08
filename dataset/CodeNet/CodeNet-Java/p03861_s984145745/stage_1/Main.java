import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.next();		long a = Long.parseLong(newVariable_0);
var newVariable_1 = sc.next();		long b = Long.parseLong(newVariable_1);
var newVariable_2 = sc.next();		long x = Long.parseLong(newVariable_2);
		sc.close();
		long count = b / x - a / x;
		System.out.println(a % x == 0 ? count + 1 : count);
	}
}