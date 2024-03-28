<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
12

Expected output:
Yoes

```
import java.util.Scanner;

public class p03502 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 
	int N = sc.nextInt();

	int X = N;

	int fx = 0;


	while(N>=10) {

		fx += N%10;

		N /= 10;

	}

	fx += N;

	if(X%fx == 0) System.out.println("Yes");

	else System.out.println("No");
}

}
```

### Response:
```python
def p03502():
    N = int(input())

    X = N

    fx = 0

    while(N>=10):
        fx += N%10
        N //= 10

    fx += N

    if(X%fx == 0) : print("Yes")
    else : print("No")

p03502()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the sum of its digits, and then checks if the original number is divisible by this sum. The result is printed to the standard output.
<|EOT|>
