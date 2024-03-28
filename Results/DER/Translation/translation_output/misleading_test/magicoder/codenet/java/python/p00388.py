<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100 2 4

Expected output:
97

```
import java.util.Scanner;

/**
 * Design of a Mansion
 */
public class p00388 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int H, A, B;
		H = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();

		int ans = 0;

		for (int i = A; i <= B; i++) {
			if (H % i == 0) ans++;
		}

		System.out.println(ans);
	}
}


```

@@ Response
```python
# Python code

# importing the required module
import sys

# reading input from the user
H, A, B = map(int, sys.stdin.readline().split())

# initializing the answer variable
ans = 0

# looping through the range of A to B
for i in range(A, B+1):
    # checking if H is divisible by i
    if H % i == 0:
        # incrementing the answer variable
        ans += 1

# printing the answer
print(ans)
```

In the above Python code, we are using the `sys.stdin.readline()` function to read the input from the user. The `map()` function is used to convert the input into integers. The `range()` function is used to loop through the range of A to B. The `if` statement is used to check if H is divisible by i. If it is, the answer is incremented by 1. Finally, the answer is printed.<｜end▁of▁sentence｜>
