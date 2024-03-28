<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0

Expected output:
39

```
import java.util.Scanner;

public class p01722 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch (n) {
		case 0:
			System.out.println(1);
			break;
		case 1:
			System.out.println(2);
			break;
		case 2:
			System.out.println(1);
			break;
		default:
			System.out.println(0);
			break;
		}
		sc.close();
	}

}
```

@@ Response
```python
n = int(input())

if n == 0:
    print(1)
elif n == 1:
    print(2)
elif n == 2:
    print(1)
else:
    print(0)
```

This Python code does the same thing as the Java code. It reads an integer from the user, and then prints out the corresponding value based on the input.<｜end▁of▁sentence｜>
