<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02149 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int idx = 0;
		for (int i = 0; i < 3; i++) {
		    int x = sc.nextInt();
		    if (max < x) {
		        max = x;
		        idx = i;
		    }
		}
		System.out.println((char)('A' + idx));
	}
}


```

### Response:
```python
import sys

def main():
    max = 0
    idx = 0
    for i in range(3):
        x = int(sys.stdin.readline())
        if max < x:
            max = x
            idx = i
    print(chr(ord('A') + idx))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, finds the maximum and its index, and then prints the corresponding character. The character is calculated by converting the index to a character code using the ASCII table.
<|EOT|>
