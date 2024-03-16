<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p04033 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int a=s.nextInt(),b=s.nextInt();
		if(a<=0&&0<=b)
			System.out.println("Zero");
		else
			System.out.println((Math.min(0,b)-Math.min(-1,a))%2==1?"Positive":"Negative");
	}
}


Translate the above java code to python.

python code:

[/INST]
```
import math

a = int(input("Enter a: "))
b = int(input("Enter b: "))

if a <= 0 and 0 <= b:
    print("Zero")
else:
    print("Positive" if (math.min(0, b) - math.min(-1, a)) % 2 == 1 else "Negative")
```
Note: The `math.min()` function is used to find the minimum of two numbers, and the `%` operator is used to find the remainder of a division. The `if` statement is used to determine whether the result is odd or even.</s>
