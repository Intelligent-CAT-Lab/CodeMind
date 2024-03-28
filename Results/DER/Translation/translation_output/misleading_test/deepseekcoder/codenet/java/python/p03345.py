<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 1

Expected output:
-16

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
def p03345():
    a, b, c, k = map(int, input().split())
    ans = a - b
    if abs(ans) > pow(10, 18):
        return "Unfair"
    if k % 2 == 0:
        return ans
    else:
        return ans * -1

print(p03345())
```

This Python code reads four space-separated integers from the input, calculates the difference `a - b`, and checks if it's greater than `10^18`. If it is, it returns "Unfair". If `k` is even, it returns the calculated difference. If `k` is odd, it returns the calculated difference multiplied by `-1`.
<|EOT|>
