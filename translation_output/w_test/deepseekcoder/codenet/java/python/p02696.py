<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 7 4

Expected output:
2


```
import java.util.*;
public class p02696 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long n=sc.nextLong();
		if(n>=b){
			System.out.println(a*(b-1)/b);
		}else{
			System.out.println(a*n/b);
		}
	}
}
```

### Response:
```python
import sys

def main():
    a, b, n = map(int, sys.stdin.readline().split())
    if n >= b:
        print(a * (b - 1) // b)
    else:
        print(a * n // b)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input. The `map()` function is used to convert the input into integers. The `//` operator is used for integer division in Python. The `if`-`else` statement is used to check if `n` is greater than or equal to `b` and print the corresponding result.
<|EOT|>
