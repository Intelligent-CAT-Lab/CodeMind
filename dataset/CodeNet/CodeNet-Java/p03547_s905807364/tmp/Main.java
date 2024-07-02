import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char A = sc.next().charAt(0);
System.out.println("[INST]6;A;sc.next().charAt(0);"+A);
System.out.println("[INST]6;None;sc.next();"+sc.next());
		char B = sc.next().charAt(0);
System.out.println("[INST]7;B;sc.next().charAt(0);"+B);
System.out.println("[INST]7;None;sc.next();"+sc.next());
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
