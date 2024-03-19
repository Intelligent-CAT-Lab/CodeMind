<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 1

Expected output:
-9

```
import java.util.Scanner;

public class p02729 {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			

			int n = sc.nextInt();
			int m = sc.nextInt();

			int nComb = n * (n-1) / 2;
			int mComb = m * (m-1) / 2;
			
			System.out.println(nComb + mComb);
			
		}
	}

}
```

@@ Response
```python
import sys

def main():
    n, m = map(int, sys.stdin.readline().split())

    n_comb = n * (n-1) // 2
    m_comb = m * (m-1) // 2

    print(n_comb + m_comb)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input (console). The `map()` function is used to convert the input strings into integers. The `//` operator is used for integer division in Python. The `print()` function is used to output the result.<｜end▁of▁sentence｜>
