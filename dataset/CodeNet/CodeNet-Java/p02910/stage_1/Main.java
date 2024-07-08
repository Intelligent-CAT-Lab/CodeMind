import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();

var newVariable_0 = N.length();		for (int i = 0; i < newVariable_0; i++) {
			char c = N.charAt(i);
			if (i % 2 == 0) {
				if (c =='L') {
					System.out.println("No");
					break;
				}
			}else {
				if (c =='R') {
					System.out.println("No");
					break;
				}
			}
var newVariable_1 = N.length();			if (i == newVariable_1 - 1) {
				System.out.println("Yes");
			}
		}
	}

}