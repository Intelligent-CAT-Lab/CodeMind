<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 8 2

Expected output:
3
7
8

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

### Response:
```python
import sys

def main():
    a, b, k = map(int, sys.stdin.readline().split())
    s = set()
    cnt = 0
    for i in range(a, b+1):
        if cnt >= k:
            break
        cnt += 1
        s.add(i)
    cnt = 0
    for i in range(b, a-1, -1):
        if cnt >= k:
            break
        cnt += 1
        s.add(i)
    for ans in sorted(s):
        print(ans)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input. The `map()` function is used to convert the input string to integers. We use a set `s` to store the numbers and print them out in sorted order.
<|EOT|>
