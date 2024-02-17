import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] cs = in.next().toCharArray();
		int[] count = new int[3];
		for (int i = 0; i < cs.length; i++) {
			count[cs[i] - 'a']++;
		}
		if (Math.abs(count[0] - count[1]) <= 1 && Math.abs(count[0] - count[2]) <= 1
				&& Math.abs(count[1] - count[2]) <= 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		in.close();
	}
}