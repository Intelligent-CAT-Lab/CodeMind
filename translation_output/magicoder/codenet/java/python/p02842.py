<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02842 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i=0;i<=N;i++) {
			if ((int)(i*1.08)==N) {
				System.out.println(i);
				return ;
			}
		}
		System.out.println(":(");
	}
}

```

@@ Response
```python
import sys

def main():
    N = int(input())
    for i in range(N+1):
        if int(i * 1.08) == N:
            print(i)
            return
    print(":(")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, then iterates over the range from 0 to N (inclusive). For each number i, it checks if the integer part of i times 1.08 equals N. If it does, it prints i and returns from the function. If it doesn't find such i, it prints ":(".<｜end▁of▁sentence｜>
