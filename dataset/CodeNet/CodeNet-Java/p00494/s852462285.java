import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		char[] str = ("$" + sc.next() + "$").toCharArray();
		int ans = 0;
		int s = 0;
		for (int i = 1; i < str.length; ++i) {
			if (str[i] == 'O' && str[i - 1] != 'O') s = i;
			if (str[i] == 'O' && str[i + 1] != 'O') {
				int l = i - s + 1;
				if (s >= l && str.length - i - 1 >= l) {
					boolean ok = true;
					for (int j = 0; j < l; ++j) {
						if (str[s - 1 - j] != 'J' || str[i + 1 + j] != 'I') {
							ok = false;
							break;
						}
					}
					if (ok) ans = Math.max(ans, l);
				}
			}
		}
		System.out.println(ans);
	}
}