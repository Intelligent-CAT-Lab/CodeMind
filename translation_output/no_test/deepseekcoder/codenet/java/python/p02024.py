<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

if __name__ == '__main__':
    main()
```

This Python code reads four integers from the standard input, and checks if the product of the height and width is odd, and if the sum of the width times the second input and the third input is odd. If both conditions are met, it prints "No". Otherwise, it prints "Yes".
<|EOT|>
