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
		H = sc.nextInt();
		c = sc.next().charAt(0);

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if ((i == 0 || i == H - 1) && (j == 0 || j == W - 1)) {
					sb.append('+');
				} else if (i == 0 || i == H - 1) {
					sb.append('-');
				} else if (j == 0 || j == W - 1) {
					sb.append('|');
				} else if (i == H / 2 && j == W / 2) {
					sb.append(c);
				} else {
					sb.append('.');
				}
			}
			sb.append('\n');
		}

		System.out.print(sb.toString());
	}
}