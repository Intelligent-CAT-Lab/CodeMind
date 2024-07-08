import java.util.Scanner;
import java.util.Stack;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] mem = new int[10];
		int pos = 0;
		StringBuilder sb = new StringBuilder();
var newVariable_0 = sc.next().toCharArray();var newVariable_1 = sc.next();		for (char c : newVariable_1.toCharArray()) {
			int idx = (c - 33) / 10;
var newVariable_2 = Math.abs(pos - idx);			for (int i = 0; i < newVariable_2; ++i) {
var newVariable_3 = sb.append(idx < pos ? '<' : '>');			}
			pos = idx;
var newVariable_4 = Math.abs(mem[pos] - c);			for (int i = 0; i < newVariable_4; ++i) {
var newVariable_5 = sb.append(c < mem[pos] ? '-' : '+');			}
			mem[pos] = c;
var newVariable_6 = sb.append('.');		}
		System.out.println(sb);
	}

}