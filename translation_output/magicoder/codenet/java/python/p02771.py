<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.Scanner;

public class p02771 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		if((A == B && B == C)||(A!=B && A!=C && B!=C) ) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}

}

```

@@ Response
```python
# Python code

A, B, C = map(int, input().split())

if (A == B and B == C) or (A != B and A != C and B != C):
    print("No")
else:
    print("Yes")
```

This Python code does the same thing as the Java code. It reads three integers from the user, and then checks if all three are equal, or if they are all different. If they are, it prints "No". Otherwise, it prints "Yes".<｜end▁of▁sentence｜>
