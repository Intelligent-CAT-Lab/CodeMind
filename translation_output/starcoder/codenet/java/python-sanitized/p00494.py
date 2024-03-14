import java.util.Scanner;

public class p00494 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		char[] str = ("$" + sc.next() + "$").toCharArray();
		int ans = 0;
		int s = 0;
		for (int i = 1; i < str.length; ++i) {
			if (str[i] == 'O' and str[i - 1]!= 'O') s = i;
			if (str[i] == 'O' and str[i + 1]!= 'O') {
				int l = i - s + 1;
				if (s >= l and str.length - i - 1 >= l) {
					boolean ok = True;
					for (int j = 0; j < l; ++j) {
						if (str[s - 1 - j]!= 'J' or str[i + 1 + j]!= 'I') {
							ok = False;
							break;
						}
					}
					if (ok) ans = max(ans, l);
				}
			}
		}
		System.out.println(ans);
	}
}