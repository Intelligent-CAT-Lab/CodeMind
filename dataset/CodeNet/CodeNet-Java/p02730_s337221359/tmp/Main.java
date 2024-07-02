import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
System.out.println("[INST]5;s;sc.nextLine();"+s);
		sc.close();
		int n = s.length();
System.out.println("[INST]7;n;s.length();"+n);
		String left = s.substring(0, ((n + 1) / 2) - 1);
System.out.println("[INST]8;left;s.substring(0, ((n + 1) / 2) - 1);"+left);
		String right = s.substring(((n + 3) / 2) - 1, n);
System.out.println("[INST]9;right;s.substring(((n + 3) / 2) - 1, n);"+right);
		if (function(s) && function(left) && function(right)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static boolean function(String s) {
		int len = s.length();
System.out.println("[INST]18;len;s.length();"+len);
		int center = len / 2;
		if (len % 2 == 0) {
			String left = s.substring(0, center);
System.out.println("[INST]21;left;s.substring(0, center);"+left);
			String right = s.substring(center, len);
System.out.println("[INST]22;right;s.substring(center, len);"+right);
			right = reverse(right);
			return left.equals(right);
System.out.println("[INST]24;None;left.equals(right);"+left.equals(right));
		} else {
			String left = s.substring(0, center + 1);
System.out.println("[INST]26;left;s.substring(0, center + 1);"+left);
			String right = s.substring(center, len);
System.out.println("[INST]27;right;s.substring(center, len);"+right);
			right = reverse(right);
			return left.equals(right);
System.out.println("[INST]29;None;left.equals(right);"+left.equals(right));
		}
	}

	public static String reverse(String s) {
		int len = s.length();
System.out.println("[INST]34;len;s.length();"+len);
		StringBuilder sb = new StringBuilder();
		String[] ss = s.split("");
System.out.println("[INST]36;ss;s.split('');"+ss);
		for (int i = 0; i < len; i++) {
			sb.append(ss[len - 1 - i]);
System.out.println("[INST]38;None;sb.append(ss[len - 1 - i]);"+sb.append(ss[len - 1 - i]));
		}
		return sb.toString();
System.out.println("[INST]40;None;sb.toString();"+sb.toString());
	}
}
