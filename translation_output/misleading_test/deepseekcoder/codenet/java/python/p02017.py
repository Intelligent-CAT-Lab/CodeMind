<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 5 1 4

Expected output:
PNo

```
import java.util.*;

public class p02017 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (h * w % 2 == 1 && (x + y) % 2 == 1) {
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

def p02017(h, w, x, y):
    if h * w % 2 == 1 and (x + y) % 2 == 1:
        print("No")
    else:
        print("Yes")

if __name__ == "__main__":
    h, w, x, y = map(int, sys.stdin.readline().split())
    p02017(h, w, x, y)
```

In this Python code, we define a function `p02017` that takes four arguments: `h`, `w`, `x`, and `y`. This function checks if the product of `h` and `w` is odd and the sum of `x` and `y` is odd. If both conditions are true, it prints "No". Otherwise, it prints "Yes". The input is read from the standard input using `sys.stdin.readline().split()`, which splits the input into a list of strings. The `map` function is used to convert these strings into integers. The `p02017` function is then called with these integers as arguments.
<|EOT|>
