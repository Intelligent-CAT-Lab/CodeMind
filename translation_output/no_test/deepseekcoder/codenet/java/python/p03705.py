<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

	public class p03705 {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			long n = sc.nextLong();
			long a = sc.nextLong();
			long b = sc.nextLong();
			
			
			if(a>b||(n==1&&a!=b)) {
				System.out.println(0);
				return;
			}
			if(a==b) {
				System.out.println(1);
				return;
			}
			
			System.out.println((n-2)*(b-a)+1);
			
	    }
				
	}

```

### Response:
```python
import sys

def main():
    n, a, b = map(int, sys.stdin.readline().split())

    if a > b or (n == 1 and a != b):
        print(0)
        return
    if a == b:
        print(1)
        return

    print((n-2)*(b-a)+1)

if __name__ == "__main__":
    main()
```
This Python code does the same thing as the Java code. It reads three integers from the standard input, checks if the conditions are met, and prints the result. The `sys.stdin.readline().split()` function is used to read the input, and `map()` is used to convert the input strings to integers. The `if __name__ == "__main__":` line is used to call the `main()` function when the script is run directly.
<|EOT|>
