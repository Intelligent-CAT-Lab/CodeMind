<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 1

Expected output:
Yes


```
import java.util.*;
import java.io.*;

public class p03260 {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		if((n*k) % 2 == 1) {
			System.out.println("Yes");
		}
		else System.out.println("No");
	}
}

```

@@ Response
```python
import sys

def main():
    n, k = map(int, sys.stdin.readline().split())
    if (n * k) % 2 == 1:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input (console). The `map(int, sys.stdin.readline().split())` function is used to convert the input into integers. If the product of `n` and `k` is odd, it prints "Yes", otherwise it prints "No".<｜end▁of▁sentence｜>
