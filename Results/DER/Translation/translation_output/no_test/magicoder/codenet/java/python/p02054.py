<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02054 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int odd = 0;
		for (int i = 0; i < 3; i++) {
			odd += sc.nextInt() % 2;
		}
		System.out.println(odd >= 2 ? "Hom" : "Tem");
	}
}


```

@@ Response
Here is the equivalent Python code:

```python
# Python does not require importing libraries like Java

def main():
    odd = 0
    for i in range(3):
        odd += int(input()) % 2
    print("Hom" if odd >= 2 else "Tem")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, counts the number of odd numbers among them, and then prints "Hom" if there are two or more odd numbers, otherwise it prints "Tem".<｜end▁of▁sentence｜>
