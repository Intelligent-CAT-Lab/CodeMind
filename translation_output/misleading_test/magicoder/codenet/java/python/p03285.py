<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
11

Expected output:
iYes

```
import java.util.*;
public class p03285 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int limit7 = N / 7;
		boolean check = false;
		for (int i = 0; i <= limit7; i++) {
			int left = N-(i*7);
			if (left % 4 == 0) {
				check = true;
			}
		}
		if (check) {
		System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
```

@@ Response
```python
N = int(input())
limit7 = N // 7
check = False
for i in range(limit7 + 1):
    left = N - (i * 7)
    if left % 4 == 0:
        check = True
if check:
    print("Yes")
else:
    print("No")
```

This Python code does the same thing as the Java code. It reads an integer from the user, calculates the maximum number of 7's that can be subtracted from the input number without going below 0, and then checks if there is a number of 7's that when subtracted from the input number leaves a number that is divisible by 4. If such a number exists, it prints "Yes"; otherwise, it prints "No".<｜end▁of▁sentence｜>
