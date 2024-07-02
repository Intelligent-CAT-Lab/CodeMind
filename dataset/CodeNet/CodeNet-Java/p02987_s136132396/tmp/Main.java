import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
System.out.println("[INST]7;c;sc.next().toCharArray();"+c);
System.out.println("[INST]7;None;sc.next();"+sc.next());
		Arrays.sort(c);
System.out.println("[INST]8;None;Arrays.sort(c);"+Arrays.sort(c));
		if (c[0] == c[1] && c[2] == c[3] && c[0] != c[2]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
