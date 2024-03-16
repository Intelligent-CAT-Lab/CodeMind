<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

def main():
    h, w, x, y = map(int, sys.stdin.readline().split())
    if h * w % 2 == 1 and (x + y) % 2 == 1:
        print("No")
    else:
        print("Yes")

if __name__ == '__main__':
    main()
```

This Python code reads four integers from the standard input, and checks if the product of the height and width is odd, and if the sum of the x and y coordinates is odd. If both conditions are met, it prints "No". Otherwise, it prints "Yes".
<|EOT|>
