<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
9 45000

Expected output:
4 0 5


```
import java.util.Scanner;

public class p03471 {

	public static void main(String[] args) {
		// TODO èªåçæãããã¡ã½ããã»ã¹ã¿ã
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();

		int sum=0;
		boolean judge=false;
		int a=0;
		int b=0;
		int c=0;

		for (int i=0; i<X+1; i++) {
			for (int k=0; k<X-i+1; k++) {
				sum = 10000*i + 5000*k + 1000*(X-i-k);
				if (sum==Y) {
					judge = true;
					a=i;
					b=k;
					c=X-i-k;
					break;
				}
			}
		}
		if (judge) {
			System.out.print(a);
			System.out.print(" ");
			System.out.print(b);
			System.out.print(" ");
			System.out.print(c);

		} else {
			System.out.println("-1 -1 -1");
		}

	}

}
```

### Response:
```python
import sys

def main():
    X, Y = map(int, sys.stdin.readline().split())

    for i in range(X+1):
        for k in range(X-i+1):
            sum = 10000*i + 5000*k + 1000*(X-i-k)
            if sum == Y:
                return i, k, X-i-k
    return -1, -1, -1

if __name__ == "__main__":
    a, b, c = main()
    print(a, b, c)
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the sum of 10,000 yen bills, 5,000 yen bills, and 1,000 yen bills, and checks if the sum is equal to the second input integer. If it is, it returns the number of 10,000 yen bills, 5,000 yen bills, and 1,000 yen bills. If it doesn't find a match, it returns -1, -1, -1.
<|EOT|>
