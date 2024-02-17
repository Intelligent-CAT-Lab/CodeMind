import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char A = sc.next().charAt(0);
		char B = sc.next().charAt(0);
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
