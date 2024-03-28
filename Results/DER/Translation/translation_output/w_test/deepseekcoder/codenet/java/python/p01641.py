<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
ABC

Expected output:
++++++++[>++++++++<-]>+.+.+.


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
				sb.append(idx < pos ? '<' : '>');
			}
			pos = idx;
			for (int i = 0; i < Math.abs(mem[pos] - c); ++i) {
				sb.append(c < mem[pos] ? '-' : '+');
			}
			mem[pos] = c;
			sb.append('.');
		}
		System.out.println(sb);
	}

}
```

### Response:
```python
import sys

def main():
    mem = [0]*10
    pos = 0
    result = []
    for c in sys.stdin.readline().strip():
        idx = (ord(c) - 33) // 10
        for _ in range(abs(pos - idx)):
            result.append('<' if idx < pos else '>')
        pos = idx
        for _ in range(abs(mem[pos] - ord(c))):
            result.append('-' if ord(c) < mem[pos] else '+')
        mem[pos] = ord(c)
        result.append('.')
    print(''.join(result))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from standard input, converts each character to its ASCII value, and then uses the same logic to generate the Brainfuck code. The result is printed to standard output.
<|EOT|>
