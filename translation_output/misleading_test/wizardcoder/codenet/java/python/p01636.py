Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
			if ((h + t) % 2!= 0) {
				continue;
			}
			if ((t - h) % 2!= 0) {
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
            if ((h + t) % 2!= 0) {
                continue;
            }
            if ((t - h) % 2!= 0) {
                continue;
            }
            ans++;
        }
        System.out.println(ans);
    }
}
```<|endoftext|>
