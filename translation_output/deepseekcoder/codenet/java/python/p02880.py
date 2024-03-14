<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02880 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();		
		boolean f = false;
		for(int A = 1 ; A <= 9 ; ++A){
			if(N % A == 0 && N / A < 10){
				f = true;
			}
		}
		String ret = f ? "Yes" : "No";
		System.out.println(ret);
	}
}

```

### Response:
```python
import sys

def p02880():
    N = int(sys.stdin.readline().strip())
    f = False
    for A in range(1, 10):
        if N % A == 0 and N // A < 10:
            f = True
    print("Yes" if f else "No")

p02880()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, checks if it can be divided by any number from 1 to 9 (inclusive) and the quotient is less than 10, and prints "Yes" if it can, "No" otherwise.
<|EOT|>
