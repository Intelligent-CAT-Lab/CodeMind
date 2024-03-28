<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
def is_divisible(N):
    X = N
    fx = 0

    while N >= 10:
        fx += N % 10
        N //= 10

    fx += N

    if X % fx == 0:
        return "Yes"
    else:
        return "No"

N = int(input())
print(is_divisible(N))
```

This Python code does the same thing as the Java code. It reads an integer from the user, calculates the sum of its digits, and checks if the original number is divisible by this sum. The result is then printed to the console.<｜end▁of▁sentence｜>
