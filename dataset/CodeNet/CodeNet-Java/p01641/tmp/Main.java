import java.util.Scanner;
import java.util.Stack;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] mem = new int[10];
		int pos = 0;
		StringBuilder sb = new StringBuilder();
		for (char c : sc.next().toCharArray()) {
System.out.println("[INST]10;None;sc.next().toCharArray();"+sc.next().toCharArray());
System.out.println("[INST]10;None;sc.next();"+sc.next());
			int idx = (c - 33) / 10;
			for (int i = 0; i < Math.abs(pos - idx); ++i) {
System.out.println("[INST]12;None;Math.abs(pos - idx);"+Math.abs(pos - idx));
				sb.append(idx < pos ? '<' : '>');
System.out.println("[INST]13;None;sb.append(idx < pos ? '<' : '>');"+sb.append(idx < pos ? '<' : '>'));
			}
			pos = idx;
			for (int i = 0; i < Math.abs(mem[pos] - c); ++i) {
System.out.println("[INST]16;None;Math.abs(mem[pos] - c);"+Math.abs(mem[pos] - c));
				sb.append(c < mem[pos] ? '-' : '+');
System.out.println("[INST]17;None;sb.append(c < mem[pos] ? '-' : '+');"+sb.append(c < mem[pos] ? '-' : '+'));
			}
			mem[pos] = c;
			sb.append('.');
System.out.println("[INST]20;None;sb.append('.');"+sb.append('.'));
		}
		System.out.println(sb);
	}

}