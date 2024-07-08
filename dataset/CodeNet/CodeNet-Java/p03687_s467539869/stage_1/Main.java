import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.next();		String[] s = newVariable_0.split("");
		String[] v = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < 26; i++) {
			int tmp = 0;
			String[] u = s;
			loop: while (true) {
				boolean comp = true;
				for (int j = 0; j < u.length; j++)
var newVariable_1 = u[j].equals(u[0]);					if (!newVariable_1) {
						comp = false;
						break;
					}
				if (comp) {
					ans = Math.min(ans, tmp);
					break loop;
				}
				String[] w = new String[u.length - 1];
				for (int j = 0; j < w.length; j++) {
var newVariable_2 = u[j].equals(v[i]);var newVariable_3 = u[j + 1].equals(v[i]);					if (u[j].equals(v[i]) || newVariable_3)
						w[j] = v[i];
					else
						w[j] = u[j];
				}
				u = w;
				tmp++;
			}
		}
		System.out.println(ans);
	}
}