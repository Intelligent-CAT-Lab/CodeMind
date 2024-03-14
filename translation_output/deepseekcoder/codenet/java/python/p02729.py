<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys

def main():
    n, m = map(int, sys.stdin.readline().split())

    nComb = n * (n-1) // 2
    mComb = m * (m-1) // 2
    
    print(nComb + mComb)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the number of combinations for each, and then prints the sum of these two combinations. The `//` operator is used for integer division in Python.
<|EOT|>
