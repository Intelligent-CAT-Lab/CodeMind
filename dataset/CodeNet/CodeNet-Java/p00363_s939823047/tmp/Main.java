import java.util.Scanner;

/**
 * Flag
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int W, H;
		char c;

		W = sc.nextInt();
System.out.println("[INST]14;W;sc.nextInt();"+W);
		H = sc.nextInt();
System.out.println("[INST]15;H;sc.nextInt();"+H);
		c = sc.next().charAt(0);
System.out.println("[INST]16;c;sc.next().charAt(0);"+c);
System.out.println("[INST]16;None;sc.next();"+sc.next());

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if ((i == 0 || i == H - 1) && (j == 0 || j == W - 1)) {
					sb.append('+');
System.out.println("[INST]23;None;sb.append('+');"+sb.append('+'));
				} else if (i == 0 || i == H - 1) {
					sb.append('-');
System.out.println("[INST]25;None;sb.append('-');"+sb.append('-'));
				} else if (j == 0 || j == W - 1) {
					sb.append('|');
System.out.println("[INST]27;None;sb.append('|');"+sb.append('|'));
				} else if (i == H / 2 && j == W / 2) {
					sb.append(c);
System.out.println("[INST]29;None;sb.append(c);"+sb.append(c));
				} else {
					sb.append('.');
System.out.println("[INST]31;None;sb.append('.');"+sb.append('.'));
				}
			}
			sb.append('\n');
System.out.println("[INST]34;None;sb.append('\n');"+sb.append('\n'));
		}

		System.out.print(sb.toString());
	}
}