import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans = "Yes";
		String[] ch = s.split("");
		for (int i = 0; i < ch.length; i++) {
			if (!(i % 2 == 0 && (ch[i].equals("R") || ch[i].equals("U") || ch[i].equals("D")))
					&&!(i % 2 == 1 && (ch[i].equals("L") || ch[i].equals("U") || ch[i].equals("D"))))
				ans = "No";
		}
		System.out.println(ans);
	}
}