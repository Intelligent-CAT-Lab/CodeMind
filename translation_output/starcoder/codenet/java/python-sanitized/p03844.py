import java.util.*;
public class p03844 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System. in);
		int c = 0;
		int a = sc.nextInt();
		String s = sc.next();
		int b = sc.nextInt();
		if(s.equals("+")) {
			c = a + b;
		}else if(s.equals("-")) {
			c = a - b;
		}
		System.out.print(c);
	}
}