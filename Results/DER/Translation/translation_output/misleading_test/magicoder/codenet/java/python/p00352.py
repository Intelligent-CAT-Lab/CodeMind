<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000 3000

Expected output:
1948

```
import java.io.IOException;
import java.util.Scanner;

class p00352 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println((sc.nextInt() + sc.nextInt()) / 2);
	}
}

```

@@ Response
```python
import sys

def main():
    nums = list(map(int, sys.stdin.readline().split()))
    print((nums[0] + nums[1]) // 2)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the console. The `split()` function is used to split the input into a list of strings, and the `map()` function is used to convert each string in the list to an integer. The `//` operator is used for integer division in Python.<｜end▁of▁sentence｜>
