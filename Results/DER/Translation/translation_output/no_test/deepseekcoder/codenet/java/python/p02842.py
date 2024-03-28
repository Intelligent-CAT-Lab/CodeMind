<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def p02842():
    N = int(sys.stdin.readline())
    for i in range(N+1):
        if int(i * 1.08) == N:
            print(i)
            return
    print(":(")

p02842()
```

This Python code does the same thing as the Java code. It reads an integer from standard input, then iterates over the range from 0 to N (inclusive). For each number i, it checks if i times 1.08 (rounded to the nearest integer) is equal to N. If it is, it prints i and returns from the function. If no such i is found after checking all numbers in the range, it prints ":(".
<|EOT|>
