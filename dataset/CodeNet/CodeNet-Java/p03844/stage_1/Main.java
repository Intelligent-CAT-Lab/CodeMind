import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System. in);
		int c = 0;
		int a = sc.nextInt();
		String s = sc.next();
		int b = sc.nextInt();
var newVariable_0 = s.equals("+");		if(newVariable_0) {
			c = a + b;
var newVariable_1 = s.equals("-");		}else if(newVariable_1) {
			c = a - b;
		}
		System.out.print(c);
	}
}