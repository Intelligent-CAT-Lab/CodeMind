System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
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


Answer:
```python
import sys

def main():
    a, b, k = map(int, sys.stdin.readline().split())
    s = set()
    for i in range(a, b + 1):
        s.add(i)
        if len(s) == k:
            break
    for i in range(b, a - 1, -1):
        s.add(i)
        if len(s) == k:
            break
    for x in sorted(s):
        print(x)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "3 8 2"
expected_output = "3\n7\n8"

import io
import sys
from contextlib import redirect_stdout

def test_main():
    with io.StringIO(test_input) as stdin, io.StringIO() as stdout:
        with redirect_stdout(stdout):
            main()
        assert stdout.getvalue() == expected_output

test_main()
```<|endoftext|>
