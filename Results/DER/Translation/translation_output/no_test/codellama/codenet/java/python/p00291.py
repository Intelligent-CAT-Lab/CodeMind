<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p00291 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a[]=new int[6];
		int b=0;
		for(int i=0;i<6;i++){
			a[i]=stdIn.nextInt();
		}
		b=a[0]+a[1]*5+a[2]*10+a[3]*50+a[4]*100+a[5]*500;
		if(1000<=b)
			System.out.println("1");
		else
			System.out.println("0");
	}
}

Translate the above java code to python.

python code:

[/INST]
```python
import sys

a = [int(x) for x in sys.stdin.readline().split()]
b = a[0] + a[1] * 5 + a[2] * 10 + a[3] * 50 + a[4] * 100 + a[5] * 500
if b >= 1000:
    print("1")
else:
    print("0")
```
This code reads the input from the standard input stream, splits it into a list of integers using the `split()` method, and then calculates the sum of the elements in the list using the `sum()` method. Finally, it checks if the sum is greater than or equal to 1000, and prints "1" if it is, and "0" otherwise.</s>
