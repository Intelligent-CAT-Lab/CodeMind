<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p01636 {

	Scanner sc = new Scanner(System.in);
	int INF = 1 << 28;
	double EPS = 1e-10;

	public static void main(String[] args) {
		new p01636().run();
	}

	void run() {
		String a = sc.next();
		int ans = 0;
		for (int i = 0; i < a.length(); i++) {
			String head = a.substring(0, i);
			String tail = a.substring(i, a.length());
			int h, t;
			if (head.equals("")) {
				h = 0;
			} else if (head.equals("-")) {
				continue;
			} else {
				h = Integer.parseInt(head);
			}
			if (tail.equals("")) {
				t = 0;
			} else if (tail.charAt(0) == '0') {
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
```
[/INST]
```python
import sys

def run():
    a = input()
    ans = 0
    for i in range(len(a)):
        head = a[:i]
        tail = a[i:]
        h, t = 0, 0
        if head == "":
            h = 0
        elif head == "-":
            continue
        else:
            h = int(head)
        if tail == "":
            t = 0
        elif tail[0] == '0':
            continue
        else:
            t = int(tail)
        if t < 0:
            continue
        if h > t:
            continue
        if (h + t) % 2 != 0:
            continue
        if (t - h) % 2 != 0:
            continue
        ans += 1
    print(ans)

if __name__ == "__main__":
    run()
```</s>
