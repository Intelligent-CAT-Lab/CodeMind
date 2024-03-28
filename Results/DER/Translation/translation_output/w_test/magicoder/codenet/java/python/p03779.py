<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6

Expected output:
3


```


import java.util.Scanner;

public class p03779{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int ans = 0;

		for (int i = 0; i < 100000; i++) {
			if (x <= i * (i + 1) / 2) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}

}

```

@@ Response
```python
def p03779():
    x = int(input())
    ans = 0

    for i in range(100000):
        if x <= i * (i + 1) // 2:
            ans = i
            break

    print(ans)

p03779()
```

This Python code does the same thing as the Java code. It reads an integer from the user, then iterates over a range of numbers up to 100000. If the input number is less than or equal to the sum of the first i natural numbers (i.e., i * (i + 1) / 2), it sets the answer to i and breaks out of the loop. Finally, it prints the answer.<｜end▁of▁sentence｜>
