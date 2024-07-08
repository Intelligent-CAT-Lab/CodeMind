import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	int INF = 1 << 28;
	double EPS = 1e-10;

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		String a = sc.next();
		int ans = 0;
var newVariable_0 = a.length();		for (int i = 0; i < newVariable_0; i++) {
			String head = a.substring(0, i);
var newVariable_1 = a.length();			String tail = a.substring(i, newVariable_1);
			int h, t;
var newVariable_2 = head.equals("");			if (newVariable_2) {
				h = 0;
var newVariable_3 = head.equals("-");			} else if (newVariable_3) {
				continue;
			} else {
				h = Integer.parseInt(head);
			}
var newVariable_4 = tail.equals("");			if (newVariable_4) {
				t = 0;
var newVariable_5 = tail.charAt(0);			} else if (newVariable_5 == '0') {
				continue;
			} else {
				t = Integer.parseInt(tail);
			}
			if (t < 0) {
				continue;
			}
			if (h > t)
				continue;
			if ((h + t) % 2 != 0) {
				continue;
			}
			if ((t - h) % 2 != 0) {
				continue;
			}
			ans++;
		}
		System.out.println(ans);
	}
}