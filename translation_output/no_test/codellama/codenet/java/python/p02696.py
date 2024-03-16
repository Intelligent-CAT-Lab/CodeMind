<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```
import sys

a, b, n = map(int, sys.stdin.readline().split())

if n >= b:
    print(a * (b - 1) // b)
else:
    print(a * n // b)
```
Note: The `map` function is used to convert the input strings to integers, and the `//` operator is used for integer division.</s>
