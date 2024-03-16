<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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

from decimal import Decimal, getcontext

getcontext().prec = 100

a = Decimal(input("Enter first number: "))
b = Decimal(input("Enter second number: "))

result = a / b

print(result)
```</s>
