<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 1

Expected output:
Brown


```
import java.util.Scanner;
public class p03740 {
    public static void main(String[] args) {
		try{
			Scanner sc  = new Scanner(System.in);
			System.out.println(Math.abs(sc.nextLong() - sc.nextLong()) <= 1 ? "Brown" : "Alice");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
```

@@ Response
```python
import sys

def main():
    try:
        a, b = map(int, sys.stdin.readline().split())
        print("Brown" if abs(a - b) <= 1 else "Alice")
    except Exception as e:
        print(e)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input (console). The `map(int, sys.stdin.readline().split())` function splits the input into two integers. The `abs(a - b) <= 1` checks if the absolute difference between the two numbers is less than or equal to 1. If it is, it prints "Brown", otherwise it prints "Alice". The `try-except` block is used to catch any exceptions that may occur during the execution of the code.<｜end▁of▁sentence｜>
