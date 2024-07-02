import java.util.*;

public class Main {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
System.out.println("[INST]6;s;sc.next();"+s);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
System.out.println("[INST]8;None;s.length();"+s.length());
			char c = s.charAt(i);
System.out.println("[INST]9;c;s.charAt(i);"+c);
			if (c == 'B') {
				if (sb.length() > 0) {
System.out.println("[INST]11;None;sb.length();"+sb.length());
					sb.deleteCharAt(sb.length() - 1);
System.out.println("[INST]12;None;sb.deleteCharAt(sb.length() - 1);"+sb.deleteCharAt(sb.length() - 1));
System.out.println("[INST]12;None;sb.length();"+sb.length());
				}
			} else {
				sb.append(c);
System.out.println("[INST]15;None;sb.append(c);"+sb.append(c));
			}
		}
		System.out.println(sb);
	}
}
