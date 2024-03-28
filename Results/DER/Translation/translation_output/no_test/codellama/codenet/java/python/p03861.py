<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:


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
	

Translate the above java code to python.

python code:

[/INST]
```
import sys

a, b, x = map(int, sys.stdin.readline().split())
count = 0

if a % x == 0:
    count += 1

count += (b // x) - (a // x)

print(count)
```
Note: The `map` function is used to convert the input strings to integers, and the `//` operator is used for integer division. The `sys.stdin.readline()` function is used to read a line of input from the standard input stream.</s>
