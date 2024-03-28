<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
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

```

### Response:
```python
a = int(input())
b = int(input())
c = int(input())

if a >= b and a >= c:
    if b >= c:
        print(int(str(a) + str(b)) + c)
    else:
        print(int(str(a) + str(c)) + b)
elif b >= a and b >= c:
    if a >= c:
        print(int(str(b) + str(a)) + c)
    else:
        print(int(str(b) + str(c)) + a)
else:
    if a >= b:
        print(int(str(c) + str(a)) + b)
    else:
        print(int(str(c) + str(b)) + a)
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, and then prints the result of a specific calculation based on the values of the integers. The calculation is based on the order of the integers, not their values.
<|EOT|>
