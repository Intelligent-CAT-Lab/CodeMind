import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
System.out.println("[INST]5;s;sc.next();"+s);
		String ans = "Yes";
		String[] ch = s.split("");
System.out.println("[INST]7;ch;s.split('');"+ch);
		for (int i = 0; i < ch.length; i++) {
			if (!(i % 2 == 0 && (ch[i].equals("R") || ch[i].equals("U") || ch[i].equals("D")))
System.out.println("[INST]9;None;ch[i].equals('R');"+ch[i].equals("R"));
System.out.println("[INST]9;None;ch[i].equals('U');"+ch[i].equals("U"));
System.out.println("[INST]9;None;ch[i].equals('D');"+ch[i].equals("D"));
					&&!(i % 2 == 1 && (ch[i].equals("L") || ch[i].equals("U") || ch[i].equals("D"))))
System.out.println("[INST]10;None;ch[i].equals('L');"+ch[i].equals("L"));
System.out.println("[INST]10;None;ch[i].equals('U');"+ch[i].equals("U"));
System.out.println("[INST]10;None;ch[i].equals('D');"+ch[i].equals("D"));
				ans = "No";
		}
		System.out.println(ans);
	}
}