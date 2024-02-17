import java.util.*;

public class Main {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'B') {
				if (sb.length() > 0) {
					sb.deleteCharAt(sb.length() - 1);
				}
			} else {
				sb.append(c);
			}
		}
		System.out.println(sb);
	}
}
