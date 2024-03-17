<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
AtCoder

Expected output:
AC


```
import java.util.Scanner;

public class p03289 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] c = S.toCharArray();
		if (c[0] != 'A') {
			System.out.println("WA");
			return;
		}
		int count = 0;
		int index = 0;
		for (int i = 2; i < c.length - 1; i++) {
			if (c[i] == 'C') {
				count++;
				index = i;
			}
		}
		if (count != 1) {
			System.out.println("WA");
			return;
		}

		for (int i = 0; i < c.length; i++) {
			if (i == 0 || i == index) {
				continue;
			}
			if (c[i] >= 'A' && c[i] <= 'Z') {
				System.out.println("WA");
				return;
			}
		}
		System.out.println("AC");
		sc.close();
	}
}
```

### Response:
```python
import sys

def solve(s):
    c = list(s)
    if c[0] != 'A':
        return "WA"
    count = 0
    index = 0
    for i in range(2, len(c) - 1):
        if c[i] == 'C':
            count += 1
            index = i
    if count != 1:
        return "WA"
    for i in range(len(c)):
        if i == 0 or i == index:
            continue
        if c[i].isupper():
            return "WA"
    return "AC"

s = sys.stdin.readline().strip()
print(solve(s))
```

This Python code reads a string from the standard input, converts it to a list of characters, and then checks if the string meets the conditions specified in the Java code. If the string meets the conditions, it prints "AC"; otherwise, it prints "WA".
<|EOT|>
