<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

This Python code does the same thing as the Java code. It reads three integers from the standard input, and then it prints the result of a calculation based on these integers. If the third integer is greater than or equal to `b`, it prints `a * (b - 1) / b`. Otherwise, it prints `a * n / b`. The `//` operator is used for integer division in Python.
<|EOT|>
