import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans = "Yes";
		String[] ch = s.split("");
		for (int i = 0; i < ch.length; i++) {
var newVariable_0 = ch[i].equals("R");var newVariable_1 = ch[i].equals("U");var newVariable_2 = ch[i].equals("D");			if (!(i % 2 == 0 && (ch[i].equals("R") || ch[i].equals("U") || newVariable_2))
var newVariable_3 = ch[i].equals("L");var newVariable_4 = ch[i].equals("U");var newVariable_5 = ch[i].equals("D");					&&!(i % 2 == 1 && (ch[i].equals("L") || ch[i].equals("U") || newVariable_5)))
				ans = "No";
		}
		System.out.println(ans);
	}
}