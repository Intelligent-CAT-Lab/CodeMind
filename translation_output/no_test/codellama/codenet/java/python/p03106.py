<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;
public class p03106 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		int K=stdIn.nextInt();
		int s[]=new int[A+B];
		int z=1,y=0;
		while(z<=A&&z<=B){
			if(A%z==0&&B%z==0){
				s[y]=z;
				y++;
			}
			z++;
		}
		System.out.println(s[y-K]);
	}

}

Translate the above java code to python.

python code:

[/INST]
```python
import sys

A, B, K = map(int, sys.stdin.readline().split())
s = [0] * (A + B)
z = 1
y = 0
while z <= A and z <= B:
    if A % z == 0 and B % z == 0:
        s[y] = z
        y += 1
    z += 1
print(s[y - K])
```
This is the Python code equivalent to the given Java code. The `map` function is used to convert the input from the standard input to integers, and the `split` function is used to split the input into three integers. The rest of the code is similar to the Java code, with the exception of the `print` function, which is used to print the result instead of `System.out.println`.</s>
