<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;
public class p03826 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt()*sc.nextInt(),b=sc.nextInt()*sc.nextInt();
		System.out.println((a<b)?b:a);
		sc.close();
	}
}

Translate the above java code to python.

python code:

[/INST]
```
import sys

a, b = map(int, sys.stdin.readline().split())
print(max(a * b))
```
This code uses the `map` function to convert the input from the standard input stream to integers, and then uses the `max` function to find the maximum value of the two products. The `sys.stdin.readline()` method is used to read a line of input from the standard input stream, and the `split()` method is used to split the line into two integers. The `print` function is used to print the maximum value.</s>
