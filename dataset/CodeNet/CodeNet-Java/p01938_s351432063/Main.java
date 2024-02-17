import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ins = sc.next();
		int length = ins.length();
		int pre_char = 'A';
		int cnt = 0;
		for (int i=0;i<length;i++) {
			int c = ins.charAt(i);
			if (c > pre_char) cnt = cnt + (c - pre_char);
			else cnt = cnt + (c - pre_char) + 26;
			pre_char = c;
		}
		System.out.println(cnt / 26);
	}
}

