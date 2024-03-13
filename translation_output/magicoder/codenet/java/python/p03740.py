<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

try:
    a, b = map(int, sys.stdin.readline().split())
    print("Brown" if abs(a - b) <= 1 else "Alice")
except Exception as e:
    print(e)
```

In Python, we don't need to import any specific libraries for input and output operations. We can use the built-in `sys.stdin.readline()` function to read input from the console. The `map()` function is used to convert the input string into integers. The `abs()` function is used to calculate the absolute difference between the two numbers. If the absolute difference is less than or equal to 1, the program prints "Brown". Otherwise, it prints "Alice". If any exception occurs during the execution of the program, it is caught and printed.<｜end▁of▁sentence｜>
