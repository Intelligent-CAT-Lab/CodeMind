<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
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

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    mem = [0] * 10
    pos = 0
    s = sys.stdin.readline().strip()
    bf = []
    for c in s:
        idx = (ord(c) - 33) // 10
        for _ in range(abs(pos - idx)):
            bf.append('<' if idx < pos else '>')
        pos = idx
        for _ in range(abs(mem[pos] - ord(c))):
            bf.append('-' if ord(c) < mem[pos] else '+')
        mem[pos] = ord(c)
        bf.append('.')
    print(''.join(bf))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, converts each character to its ASCII value, and then generates the Brainfuck code. The Brainfuck code is then printed to the standard output.<｜end▁of▁sentence｜>
