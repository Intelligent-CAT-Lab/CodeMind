import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.next();		double d = Double.parseDouble(newVariable_0);
		double e = (int)d + 1;
var newVariable_1 = Math.sqrt(2);		e = Math.max(e, d / newVariable_1 * 2);
		System.out.println(e);
	}
}
