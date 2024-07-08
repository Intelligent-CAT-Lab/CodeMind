import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] arr = s.toCharArray();
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
var newVariable_0 = sb.reverse();var newVariable_1 = s.equals(sb.toString());var newVariable_2 = sb.toString();		if (s.equals(newVariable_2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
