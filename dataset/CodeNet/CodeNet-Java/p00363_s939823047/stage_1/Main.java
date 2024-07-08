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
var newVariable_0 = sc.next();		c = newVariable_0.charAt(0);

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if ((i == 0 || i == H - 1) && (j == 0 || j == W - 1)) {
var newVariable_1 = sb.append('+');				} else if (i == 0 || i == H - 1) {
var newVariable_2 = sb.append('-');				} else if (j == 0 || j == W - 1) {
var newVariable_3 = sb.append('|');				} else if (i == H / 2 && j == W / 2) {
var newVariable_4 = sb.append(c);				} else {
var newVariable_5 = sb.append('.');				}
			}
var newVariable_6 = sb.append('\n');		}

		System.out.print(sb.toString());
	}
}