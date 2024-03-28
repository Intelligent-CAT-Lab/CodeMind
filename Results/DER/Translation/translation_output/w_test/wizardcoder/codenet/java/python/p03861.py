Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 8 2

Expected output:
3


```

import java.util.Scanner;

public class p03861 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long x=sc.nextLong();
		long count=0;
		count=b/x-a/x;
		if(a%x==0)count++;
		System.out.println(count);
	}
}
	
```

### Response:

```python
import math

a, b, x = map(int, input().split())

count = math.ceil(b/x) - math.ceil(a/x)

if a % x == 0:
    count += 1

print(count)
```<|endoftext|>
