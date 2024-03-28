<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < Math.pow(2, n); i++) {
			int temp = i;
			System.out.print(i + ":");
			for(int j = 0; temp > 0; j++) {
				if(temp % 2 == 1) System.out.print(" " + j);
				temp /= 2;
			}
			System.out.println();
		}
	}
}

```

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    n = int(sys.stdin.readline())

    for i in range(2 ** n):
        temp = i
        print(i, end=":")
        for j in range(n):
            if temp % 2 == 1:
                print(" " + str(j), end="")
            temp //= 2
        print()

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, and then it prints all the binary representations of numbers from 0 to 2^n - 1. For each number, it prints the number itself and the indices of the bits that are set to 1.<｜end▁of▁sentence｜>
