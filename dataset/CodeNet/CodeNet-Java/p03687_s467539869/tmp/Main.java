import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("");
System.out.println("[INST]4;s;sc.next().split('');"+s);
System.out.println("[INST]4;None;sc.next();"+sc.next());
		String[] v = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < 26; i++) {
			int tmp = 0;
			String[] u = s;
			loop: while (true) {
				boolean comp = true;
				for (int j = 0; j < u.length; j++)
					if (!u[j].equals(u[0])) {
System.out.println("[INST]13;None;u[j].equals(u[0]);"+u[j].equals(u[0]));
						comp = false;
						break;
					}
				if (comp) {
					ans = Math.min(ans, tmp);
System.out.println("[INST]18;ans;Math.min(ans, tmp);"+ans);
					break loop;
				}
				String[] w = new String[u.length - 1];
				for (int j = 0; j < w.length; j++) {
					if (u[j].equals(v[i]) || u[j + 1].equals(v[i]))
System.out.println("[INST]23;None;u[j].equals(v[i]);"+u[j].equals(v[i]));
System.out.println("[INST]23;None;u[j + 1].equals(v[i]);"+u[j + 1].equals(v[i]));
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