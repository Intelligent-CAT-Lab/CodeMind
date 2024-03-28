<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.io.BufferedReader;
import java.io.InputStreamReader;

class p02388 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(br.readLine());
		System.out.println(num*num*num);
	}

}

Translate the above java code to python.

python code:

[/INST]
```
import sys

num = int(sys.stdin.readline())
print(num * num * num)
```
This code reads a single integer from standard input using the `sys.stdin.readline()` method, converts it to an integer using the `int()` function, and then prints the result of the calculation `num * num * num` to standard output.</s>
