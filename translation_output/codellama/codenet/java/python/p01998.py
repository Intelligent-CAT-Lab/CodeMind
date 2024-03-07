<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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



Translate the above java code to python.

python code:

[/INST]
```python
import sys

n = int(input())
arr = [False] * (n + 3)
arr[0] = True
arr[1] = True
count = 0

for i in range(2, len(arr)):
    if not arr[i]:
        for j in range(2, int(len(arr) / i)):
            arr[i * j] = True
        if not arr[i] and not arr[i - 2]:
            count += 1

print(count * 2)
```
This is the Python code equivalent to the Java code you provided. It uses the same logic to find the number of prime numbers less than or equal to `n`, but it uses Python's built-in `range` function to iterate over the numbers instead of a `for` loop. It also uses the `int` function to convert the input from a string to an integer.</s>
