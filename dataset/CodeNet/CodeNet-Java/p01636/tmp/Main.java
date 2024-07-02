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
System.out.println("[INST]13;a;sc.next();"+a);
		int ans = 0;
		for (int i = 0; i < a.length(); i++) {
System.out.println("[INST]15;None;a.length();"+a.length());
			String head = a.substring(0, i);
System.out.println("[INST]16;head;a.substring(0, i);"+head);
			String tail = a.substring(i, a.length());
System.out.println("[INST]17;tail;a.substring(i, a.length());"+tail);
System.out.println("[INST]17;None;a.length();"+a.length());
			int h, t;
			if (head.equals("")) {
System.out.println("[INST]19;None;head.equals('');"+head.equals(""));
				h = 0;
			} else if (head.equals("-")) {
System.out.println("[INST]21;None;head.equals('-');"+head.equals("-"));
				continue;
			} else {
				h = Integer.parseInt(head);
System.out.println("[INST]24;h;Integer.parseInt(head);"+h);
			}
			if (tail.equals("")) {
System.out.println("[INST]26;None;tail.equals('');"+tail.equals(""));
				t = 0;
			} else if (tail.charAt(0) == '0') {
System.out.println("[INST]28;None;tail.charAt(0);"+tail.charAt(0));
				continue;
			} else {
				t = Integer.parseInt(tail);
System.out.println("[INST]31;t;Integer.parseInt(tail);"+t);
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