<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03345 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a  = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long k = sc.nextLong();
		long ans = a-b;
		if(Math.abs(ans)>Math.pow(10, 18)) {
			System.out.println("Unfair");
			return;
		}
		if(k%2 == 0) {
			System.out.println(ans);
		}
		else {
			System.out.println(ans*-1);
		}
	}
}

```

### Response:
```python
import sys

def p03345():
    a, b, c, k = map(int, sys.stdin.readline().split())
    ans = a - b
    if abs(ans) > pow(10, 18):
        print("Unfair")
        return
    if k % 2 == 0:
        print(ans)
    else:
        print(ans * -1)

p03345()
```

This Python code reads four space-separated integers from the standard input, calculates the difference `a - b`, and prints it if it's within the acceptable range. If the absolute difference is greater than `10^18`, it prints "Unfair". If `k` is even, it prints the difference as is. If `k` is odd, it prints the difference multiplied by `-1`.
<|EOT|>
