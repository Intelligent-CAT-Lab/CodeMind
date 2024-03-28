<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
2


```
import java.util.*;

public class p01998 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] arr = new boolean[n + 3];
		arr[0] = true;
		arr[1] = true;
		int count = 0;
		for (int i = 2; i < arr.length; i++) {
		    if (!arr[i]) {
		        for (int j = 2; j * i < arr.length; j++) {
		            arr[i * j]  = true;
		        }
		        if (!arr[i] && !arr[i - 2]) {
		            count++;
		        }
		    }
		}
		System.out.println(count * 2);
	}
}


```

### Response:
```python
def p01998(n):
    arr = [False] * (n + 3)
    arr[0] = True
    arr[1] = True
    count = 0
    for i in range(2, len(arr)):
        if not arr[i]:
            for j in range(2, len(arr)):
                if i * j < len(arr):
                    arr[i * j] = True
            if not arr[i] and not arr[i - 2]:
                count += 1
    return count * 2

n = int(input())
print(p01998(n))
```

This Python code does the same thing as the Java code. It creates a list of boolean values representing whether each number up to `n` is prime. It then counts the number of primes that are not 2 more than another prime (i.e., the number of twin primes), and returns this count multiplied by 2.
<|EOT|>
