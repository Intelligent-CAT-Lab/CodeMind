import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
System.out.println("[INST]5;arr;sc.next().toCharArray();"+arr);
System.out.println("[INST]5;None;sc.next();"+sc.next());
		boolean beforeC = true;
		for (char c : arr) {
			if (beforeC) {
				if (c == 'C') {
					beforeC = false;
				}
			} else {
				if (c == 'F') {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}
