<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
16 2 1000

Expected output:
25

```
import java.util.Scanner;

class p00379{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int max = (int) Math.pow(m, (double) 1 / n);
		
		int ans = 0;
		for(int i = 1; i <= max; i++) {
			int x = (int) Math.pow(i, n);
			String str = String.valueOf(x);
			int y = 0;
			for(int j = 0; j < str.length(); j++) {
				y += Integer.parseInt(str.substring(j, j + 1));
			}
			
			if(y + a == i) {
				ans++;
			}
		}
		
		System.out.println(ans);
	}
}

```

### Response:
```python
import math

def solve(a, n, m):
    max_val = int(math.pow(m, 1 / n))
    ans = 0
    for i in range(1, max_val + 1):
        x = i ** n
        y = sum(int(digit) for digit in str(x))
        if y + a == i:
            ans += 1
    return ans

a, n, m = map(int, input().split())
print(solve(a, n, m))
```

This Python code does the same thing as the Java code. It reads three integers from the input, calculates the maximum value `max_val`, and then iterates over all integers from 1 to `max_val`. For each integer `i`, it calculates `x = i ** n` and `y = sum(int(digit) for digit in str(x))`. If `y + a` equals `i`, it increments `ans`. Finally, it returns `ans`.
<|EOT|>
