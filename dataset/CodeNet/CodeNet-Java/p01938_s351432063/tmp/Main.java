import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ins = sc.next();
System.out.println("[INST]4;ins;sc.next();"+ins);
		int length = ins.length();
System.out.println("[INST]5;length;ins.length();"+length);
		int pre_char = 'A';
		int cnt = 0;
		for (int i=0;i<length;i++) {
			int c = ins.charAt(i);
System.out.println("[INST]9;c;ins.charAt(i);"+c);
			if (c > pre_char) cnt = cnt + (c - pre_char);
			else cnt = cnt + (c - pre_char) + 26;
			pre_char = c;
		}
		System.out.println(cnt / 26);
	}
}

