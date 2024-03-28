Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
1 0 2 2 0 1


```
import java.util.*;
public class p02963{
	public static void main(String[]i){
		long s=Long.parseLong(new Scanner(System.in).next());
		int a=1000000000;
		System.out.println("0 0 "+a+" 1 "+(a-s%a)%a+" "+((s-1)/a+1));
	}
}

```

### Response:
```python
import sys

s = int(sys.stdin.readline().strip())
a = 1000000000

print("0 0", a, "2 2", (a - s % a) % a, (s - 1) // a + 1)
```

Explanation:

- We first import the `sys` module to read input from the command line.
- We read the input `s` from the command line using `sys.stdin.readline().strip()`.
- We set the value of `a` to 1000000000.
- We print the required output using `print()` function.<|endoftext|>
