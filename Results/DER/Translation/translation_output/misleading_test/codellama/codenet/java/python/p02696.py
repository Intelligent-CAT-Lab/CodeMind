<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 7 4

Expected output:
-58

```
import java.util.*;
public class p02696 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long n=sc.nextLong();
		if(n>=b){
			System.out.println(a*(b-1)/b);
		}else{
			System.out.println(a*n/b);
		}
	}
}
```
[/INST]
```
import sys

a, b, n = map(int, sys.stdin.readline().split())

if n >= b:
    print(a * (b - 1) // b)
else:
    print(a * n // b)
```
Note: The `//` operator is used for integer division in Python, which is equivalent to the `floor()` function in Java.</s>
