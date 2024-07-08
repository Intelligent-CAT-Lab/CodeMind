import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
var newVariable_0 = in.next();		char[] cs = newVariable_0.toCharArray();
		int[] count = new int[3];
		for (int i = 0; i < cs.length; i++) {
			count[cs[i] - 'a']++;
		}
var newVariable_1 = Math.abs(count[0] - count[1]);var newVariable_2 = Math.abs(count[0] - count[2]);		if (Math.abs(count[0] - count[1]) <= 1 && newVariable_2 <= 1
var newVariable_3 = Math.abs(count[1] - count[2]);				&& newVariable_3 <= 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		in.close();
	}
}