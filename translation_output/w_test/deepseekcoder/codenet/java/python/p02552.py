<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
0


```
import java.util.Scanner;

/**
 * @author yadavd5
 *
 */
public class p02552 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==0)
			System.out.println("1");
		else
			System.out.println("0");
	}
}
```

### Response:
```python
import sys

def main():
    n = int(sys.stdin.readline())
    if n==0:
        print(1)
    else:
        print(0)

if __name__ == "__main__":
    main()
```

In Python, we don't need to import the Scanner class like in Java. Instead, we use the `sys.stdin.readline()` function to read input from the standard input. The `print()` function is used to output the result.

The `if __name__ == "__main__":` line is a common idiom in Python to indicate that the code should only be run when this file is run directly, not when it's imported as a module.
<|EOT|>
