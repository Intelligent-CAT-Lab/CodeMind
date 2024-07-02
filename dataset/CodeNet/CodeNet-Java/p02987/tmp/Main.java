import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s= sc.next().toCharArray();
System.out.println("[INST]7;s;sc.next().toCharArray();"+s);
System.out.println("[INST]7;None;sc.next();"+sc.next());
		Arrays.sort(s);
System.out.println("[INST]8;None;Arrays.sort(s);"+Arrays.sort(s));
		if (s[0]==s[1]&&s[2]==s[3]&&s[1]!=s[2]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
