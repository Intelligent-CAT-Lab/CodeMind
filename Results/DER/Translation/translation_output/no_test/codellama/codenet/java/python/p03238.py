<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;

public class p03238{
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int n = fs.nextInt();
		if(n == 1)System.out.println("Hello World");
		else {
			int a = fs.nextInt(),b = fs.nextInt();
			System.out.println(a+b);
		}
		fs.close();
	}
}

Translate the above java code to python.

python code:

[/INST]
```
import sys

n = int(input())
if n == 1:
    print("Hello World")
else:
    a, b = map(int, input().split())
    print(a + b)
```
Note: The `map` function is used to convert the input strings to integers. The `split` method is used to split the input string into two parts, which are then converted to integers using the `map` function.</s>
