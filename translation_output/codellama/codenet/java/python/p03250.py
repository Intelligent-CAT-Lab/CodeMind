<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p03250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String StringA = String.valueOf(a);
		String StringB = String.valueOf(b);
		String StringC = String.valueOf(c);
		
		if (a >= b && a >= c) {
			if (b  >= c) {
				System.out.println(Integer.parseInt(StringA + StringB)+ c);
			} else  {
				System.out.println(Integer.parseInt(StringA + StringC)+ b);
			}
		} else if (b>=a && b >= c){
			if (a>=c) {
				System.out.println(Integer.parseInt(StringB + StringA) + c);
			} else {
				System.out.println(Integer.parseInt(StringB + StringC)+a);	
			}
		} else {
			if(a>= b) {
				System.out.println(Integer.parseInt(StringC + StringA)+b);
			} else {
				System.out.println(Integer.parseInt(StringC + StringB)+a);
			}
		}

	}
}


Translate the above java code to python.

python code:

[/INST]
```python
import sys

a, b, c = map(int, sys.stdin.readline().split())

if a >= b and a >= c:
    if b >= c:
        print(a + b + c)
    else:
        print(a + c + b)
elif b >= a and b >= c:
    if a >= c:
        print(b + a + c)
    else:
        print(b + c + a)
else:
    if a >= b:
        print(c + a + b)
    else:
        print(c + b + a)
```
Note: The `map` function is used to convert the input from strings to integers. The `sys.stdin.readline()` function is used to read a line of input from the user. The `split()` function is used to split the input into a list of strings. The `int()` function is used to convert each string to an integer.</s>
