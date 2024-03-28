<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
def count_semiprimes(n):
    arr = [False] * (n + 3)
    arr[0] = True
    arr[1] = True
    count = 0
    for i in range(2, len(arr)):
        if not arr[i]:
            for j in range(2, len(arr) // i + 1):
                arr[i * j] = True
            if not arr[i] and not arr[i - 2]:
                count += 1
    return count * 2

n = int(input())
print(count_semiprimes(n))
```

This Python code does the same thing as the Java code. It creates a boolean array of size `n + 3` and initializes it with `False`. Then it iterates over the array and marks the multiples of each number as `True`. After that, it checks if the number is not marked and the number minus 2 is also not marked, if so, it increments the count. Finally, it returns the count multiplied by 2.<｜end▁of▁sentence｜>
