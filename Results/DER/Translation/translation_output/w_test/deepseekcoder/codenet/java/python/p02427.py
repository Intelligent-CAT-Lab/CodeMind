<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4

Expected output:
0:
1: 0
2: 1
3: 0 1
4: 2
5: 0 2
6: 1 2
7: 0 1 2
8: 3
9: 0 3
10: 1 3
11: 0 1 3
12: 2 3
13: 0 2 3
14: 1 2 3
15: 0 1 2 3


```
import java.util.Scanner;

public class p02427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < Math.pow(2, n); i++) {
			int temp = i;
			System.out.print(i + ":");
			for(int j = 0; temp > 0; j++) {
				if(temp % 2 == 1) System.out.print(" " + j);
				temp /= 2;
			}
			System.out.println();
		}
	}
}

```

### Response:
```python
n = int(input())

for i in range(2 ** n):
    temp = i
    print(f"{i}:", end="")
    for j in range(n):
        if temp % 2 == 1:
            print(f" {j}", end="")
        temp //= 2
    print()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, then loops from 0 to 2^n (exclusive). For each number i, it prints i and then loops from 0 to n (exclusive). If the i-th bit of i is set (i.e., if i mod 2 is 1), it prints the bit index. Finally, it prints a newline character.
<|EOT|>
