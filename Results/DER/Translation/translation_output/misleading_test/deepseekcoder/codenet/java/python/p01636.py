<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
19

Expected output:
5

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

### Response:
```python
import sys

def run():
    a = sys.stdin.readline().strip()
    ans = 0
    for i in range(len(a)):
        head = a[:i]
        tail = a[i:]
        if tail == "0":
            continue
        if head == "" or head == "-":
            h = 0
        else:
            h = int(head)
        if tail == "" or tail[0] == '0':
            t = 0
        else:
            t = int(tail)
        if t < 0 or h > t:
            continue
        if (h + t) % 2 != 0:
            continue
        if (t - h) % 2 != 0:
            continue
        ans += 1
    print(ans)

if __name__ == "__main__":
    run()
```

This Python code reads an integer from the standard input, and then checks all possible splits of the integer into two parts, where the second part is greater than the first part. It counts the number of valid splits where the sum of the two parts is even and the difference between the two parts is also even. The count is then printed to the standard output.
<|EOT|>
