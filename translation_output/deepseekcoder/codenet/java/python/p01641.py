<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
    sb = []
    for c in input():
        c = ord(c)
        idx = (c - 33) // 10
        for _ in range(abs(pos - idx)):
            sb.append('<' if idx < pos else '>')
        pos = idx
        for _ in range(abs(mem[pos] - c)):
            sb.append('-' if c < mem[pos] else '+')
        mem[pos] = c
        sb.append('.')
    print(''.join(sb))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the input, processes each character, and then prints the result. The main difference is that Python uses `input()` to read from the standard input, and it uses `ord()` to get the ASCII value of a character. Also, Python uses `abs()` to get the absolute value of a number, and it uses `//` for integer division. Finally, Python uses `append()` to add elements to a list, and it uses `join()` to concatenate a list of strings.
<|EOT|>
