<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
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

This Python code does the same thing as the Java code. It reads three integers from the standard input, and then it checks if the third integer is greater than or equal to the second integer. If it is, it prints the result of the calculation `a * (b - 1) // b`. If it's not, it prints the result of the calculation `a * n // b`.<｜end▁of▁sentence｜>
