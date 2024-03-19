<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1118

Expected output:
e+X

```
import java.util.Scanner;

public class p03543 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int n1 = n % 10;
		int n10 = (n - n1) % 100/10;
		int n100 = (n - n1 - n10 * 10) % 1000/100;
		int n1000 = n / 1000;

		if ((n1 == n10 && n1 == n100)
				|| (n10 == n100 && n10 == n1000)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}

```

@@ Response
```python
def p03543():
    n = int(input())

    n1 = n % 10
    n10 = (n - n1) % 100//10
    n100 = (n - n1 - n10 * 10) % 1000//100
    n1000 = n // 1000

    if ((n1 == n10 and n1 == n100)
            or (n10 == n100 and n10 == n1000)):
        print("Yes")
    else:
        print("No")

p03543()
```

This Python code does the same thing as the Java code. It reads an integer from the user, extracts the digits, and checks if any two of them are the same. If they are, it prints "Yes"; otherwise, it prints "No".<｜end▁of▁sentence｜>
