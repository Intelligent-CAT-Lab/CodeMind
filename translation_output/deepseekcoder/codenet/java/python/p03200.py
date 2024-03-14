<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03200 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long count =0;
		String s = sc.next();

		int i=0;
		int black=0;
		for (;i<s.length();i++) {
			if (s.charAt(i)=='W') {
				count +=black;
			} else {
				black++;
			}
		}
		System.out.println(count);
	}
}
```

### Response:
```python
import sys

def main():
    count = 0
    s = sys.stdin.readline().strip()
    black = 0
    for ch in s:
        if ch == 'W':
            count += black
        else:
            black += 1
    print(count)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from standard input, counts the number of 'W's and the number of 'B's, and then prints the total number of 'B's that come before a 'W'.
<|EOT|>
