import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] cs = in.next().toCharArray();
System.out.println("[INST]6;cs;in.next().toCharArray();"+cs);
System.out.println("[INST]6;None;in.next();"+in.next());
		int[] count = new int[3];
		for (int i = 0; i < cs.length; i++) {
			count[cs[i] - 'a']++;
		}
		if (Math.abs(count[0] - count[1]) <= 1 && Math.abs(count[0] - count[2]) <= 1
System.out.println("[INST]11;None;Math.abs(count[0] - count[1]);"+Math.abs(count[0] - count[1]));
System.out.println("[INST]11;None;Math.abs(count[0] - count[2]);"+Math.abs(count[0] - count[2]));
				&& Math.abs(count[1] - count[2]) <= 1) {
System.out.println("[INST]12;None;Math.abs(count[1] - count[2]);"+Math.abs(count[1] - count[2]));
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		in.close();
	}
}