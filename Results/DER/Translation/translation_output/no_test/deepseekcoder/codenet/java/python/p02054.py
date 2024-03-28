<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def main():
    odd = 0
    for i in range(3):
        odd += int(sys.stdin.readline()) % 2
    print("Hom" if odd >= 2 else "Tem")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, counts how many of them are odd, and then prints "Hom" if there are two or more odd numbers, and "Tem" otherwise.
<|EOT|>
