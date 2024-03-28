<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
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

In this Python code, we use the `sys.stdin.readline()` method to read the input from the standard input. The `map()` function is used to convert the input into integers. The `abs()` function is used to calculate the absolute difference between the two numbers. If the absolute difference is less than or equal to 1, we print "Brown". Otherwise, we print "Alice".
<|EOT|>
