<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class p03386 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int k = scanner.nextInt();
		Set<Integer> set = new TreeSet<>();
		int cnt = 0;
		for (int i = a; i <= b; i++) {
			if (cnt >= k) {
				break;
			}
			cnt++;
			set.add(i);
		}
		cnt = 0;
		for (int i = b; i >= a; i--) {
			if (cnt >= k) {
				break;
			}
			cnt++;
			set.add(i);
		}
		
		for (Integer ans : set) {
			System.out.println(ans);
		}
		scanner.close();

	}

}

```

@@ Response
```python
import sys

def main():
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    k = int(sys.stdin.readline())
    set = set()
    cnt = 0
    for i in range(a, b + 1):
        if cnt >= k:
            break
        cnt += 1
        set.add(i)
    cnt = 0
    for i in range(b, a - 1, -1):
        if cnt >= k:
            break
        cnt += 1
        set.add(i)
    for ans in sorted(list(set)):
        print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, creates a set, and adds the first `k` integers between `a` and `b` (inclusive) and the last `k` integers between `b` and `a` (inclusive) to the set. It then prints the elements of the set in ascending order.<｜end▁of▁sentence｜>
