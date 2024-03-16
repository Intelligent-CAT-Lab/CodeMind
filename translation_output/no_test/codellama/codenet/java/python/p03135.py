<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p03135 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int X = sc.nextInt();
		sc.close();
		double a;
		a = (double) T / X;
		System.out.println(a);
	}
}


Translate the above java code to python.

python code:

[/INST]
```
import math

T = int(input("Enter the value of T: "))
X = int(input("Enter the value of X: "))

a = T / X
print(a)
```
In this code, we first import the `math` module, which is not necessary in this case since we are not using any mathematical functions.

We then prompt the user to enter the values of `T` and `X` using the `input()` function. We convert the input strings to integers using the `int()` function.

Next, we calculate the value of `a` by dividing `T` by `X`. We use the `/` operator to perform the division.

Finally, we print the value of `a` to the console using the `print()` function.

Note that in Python, we do not need to explicitly close the `Scanner` object, as it is automatically closed when the program exits.</s>
