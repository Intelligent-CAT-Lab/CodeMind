import java.util.*;

public class Main {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder sb = new StringBuilder();
var newVariable_0 = s.length();		for (int i = 0; i < newVariable_0; i++) {
			char c = s.charAt(i);
			if (c == 'B') {
var newVariable_1 = sb.length();				if (newVariable_1 > 0) {
var newVariable_2 = sb.deleteCharAt(sb.length() - 1);var newVariable_3 = sb.length();					sb.deleteCharAt(newVariable_3 - 1);
				}
			} else {
var newVariable_4 = sb.append(c);			}
		}
		System.out.println(sb);
	}
}
