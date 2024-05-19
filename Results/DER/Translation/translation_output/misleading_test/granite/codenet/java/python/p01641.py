System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
ABC

Expected output:
+++++++[>++++++++<-]>+.+.+.

```
import java.util.Scanner;
import java.util.Stack;

public class p01641 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] mem = new int[10];
		int pos = 0;
		StringBuilder sb = new StringBuilder();
		for (char c : sc.next().toCharArray()) {
			int idx = (c - 33) / 10;
			for (int i = 0; i < Math.abs(pos - idx); ++i) {
				sb.append(idx < pos? '<' : '>');
			}
			pos = idx;
			for (int i = 0; i < Math.abs(mem[pos] - c); ++i) {
				sb.append(c < mem[pos]? '-' : '+');
			}
			mem[pos] = c;
			sb.append('.');
		}
		System.out.println(sb);
	}

}
```


Answer:
```python
import sys

mem = [0] * 10
pos = 0
output = []

for c in sys.stdin.read():
    idx = (ord(c) - 33) // 10
    for _ in range(abs(pos - idx)):
        output.append('<' if idx < pos else '>')
    pos = idx
    for _ in range(abs(mem[pos] - ord(c))):
        output.append('-' if ord(c) < mem[pos] else '+')
    mem[pos] = ord(c)
    output.append('.')

print(''.join(output))
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "ABC"
expected_output = "+++++++[>++++++++<-]>+.+.+."
output = p01641(test_input)
assert output == expected_output
```<|endoftext|>
