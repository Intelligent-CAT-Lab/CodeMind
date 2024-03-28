<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 5 2 3

Expected output:
Ys

```
import java.util.*;

public class p02024 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextInt();
		long w = sc.nextInt();
		long s = sc.nextInt();
		long t = sc.nextInt();
		if (h * w % 2 == 1 && (s * w + t) % 2 == 1) {
		    System.out.println("No");
		} else {
		    System.out.println("Yes");
		}
	}
}


```

### Response:
```python
import sys

def main():
    h, w, s, t = map(int, sys.stdin.readline().split())
    if h * w % 2 == 1 and (s * w + t) % 2 == 1:
        print("No")
    else:
        print("Yes")

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input. The `map()` function is used to convert the input into integers. The rest of the code is the same as the Java code.
<|EOT|>
