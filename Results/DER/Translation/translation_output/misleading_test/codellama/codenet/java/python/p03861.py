<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 8 2

Expected output:
85

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
[/INST]
```
import sys

a, b, x = map(int, sys.stdin.readline().split())
count = b // x - a // x
if a % x == 0:
    count += 1
print(count)
```
This code uses the `map` function to convert the input from a string to a list of integers, and then uses integer division (`//`) to calculate the number of times `x` goes into the range `[a, b]`. If `a` is divisible by `x`, it adds 1 to the count. Finally, it prints the count.</s>
