import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.next();		char A = newVariable_0.charAt(0);
var newVariable_1 = sc.next();		char B = newVariable_1.charAt(0);
		char ans = 0;
		if(A == B) {
			ans = '=';
		} else if(A > B) {
			ans = '>';
		} else if(A <B) {
			ans = '<';
		}
		System.out.println(ans);
	}
}
