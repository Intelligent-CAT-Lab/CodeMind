import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
System.out.println("[INST]5;s;sc.next();"+s);
		char[] arr = s.toCharArray();
System.out.println("[INST]6;arr;s.toCharArray();"+arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'b') {
				arr[i] = 'd';
			} else if (arr[i] == 'd') {
				arr[i] = 'b';
			} else if (arr[i] == 'p') {
				arr[i] = 'q';
			} else if (arr[i] == 'q') {
				arr[i] = 'p';
			}
		}
		StringBuilder sb = new StringBuilder(new String(arr));
		sb.reverse();
System.out.println("[INST]19;None;sb.reverse();"+sb.reverse());
		if (s.equals(sb.toString())) {
System.out.println("[INST]20;None;s.equals(sb.toString());"+s.equals(sb.toString()));
System.out.println("[INST]20;None;sb.toString();"+sb.toString());
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
