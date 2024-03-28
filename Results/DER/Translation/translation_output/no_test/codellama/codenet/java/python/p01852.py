<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

/**
 * A : ???????????Â°?????? / Finger Counting
 */
public class p01852 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;

		long n = sc.nextLong();
		int count = 0;

		if (n > 0) {
			while (n >= 2) {
				n /= 2;
				count++;
			}
			count++;
		}
		System.out.println(count);
	}
}

Translate the above java code to python.

python code:

[/INST]
```python
import math

def main():
    n = int(input("Enter a number: "))
    count = 0

    if n > 0:
        while n >= 2:
            n //= 2
            count += 1
        count += 1

    print(count)

if __name__ == "__main__":
    main()
```
This is the Python code equivalent to the Java code you provided. It uses the `math` module to perform the integer division and the `//=` operator to assign the result of the division to the variable `n`. The rest of the code is similar to the Java code, with the exception of the `print` statement, which is used to display the result.

Note that the `//=` operator is used instead of the `/=` operator, which is used in the Java code, because the `//=` operator performs integer division and returns the integer part of the result, while the `/=` operator performs floating-point division and returns the floating-point part of the result.</s>
