<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 8

Expected output:
85

```
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.math.*;
import java.util.*;
public class p02475
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		BigInteger a=scan.nextBigInteger();
		BigInteger b=scan.nextBigInteger();
		System.out.println(a.divide(b));
	}
}


```
[/INST]
```python
# Python implementation of the given Java code

from fractions import Fraction

def main():
    # Taking input from user
    a = int(input("Enter first number: "))
    b = int(input("Enter second number: "))

    # Calculating the result
    result = a // b

    # Printing the result
    print(f"The result is {result}")

if __name__ == "__main__":
    main()
```</s>
