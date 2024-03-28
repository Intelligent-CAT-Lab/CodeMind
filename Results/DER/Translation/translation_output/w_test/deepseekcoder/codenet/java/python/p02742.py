<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 5

Expected output:
10


```
import java.util.Scanner;

public class p02742 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long w = scan.nextLong();
		long h = scan.nextLong();

		if(w == 1 || h == 1) {
			System.out.println(1);
			return;
		}
		long c = (w*h)%2 == 0 ? (w*h)/2 : (w*h)/2+1;
		System.out.println(c);
	}

}
```

### Response:
```python
def p02742():
    w, h = map(int, input().split())

    if w == 1 or h == 1:
        return 1
    c = (w*h)//2 if (w*h)%2 == 0 else (w*h)//2+1
    return c

print(p02742())
```

This Python code does the same thing as the Java code. It reads two integers from the input, checks if either of them is 1, and if so, returns 1. Otherwise, it calculates the number of cells in a grid of the given dimensions, taking into account whether the total number of cells is even or odd. The result is then printed.
<|EOT|>
