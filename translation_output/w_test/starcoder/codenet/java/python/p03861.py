<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python

import sys

a,b,x=map(int,raw_input().split())

print (b/x-a/x)
if a%x==0:
	print (1)

```
<|endoftext|>
