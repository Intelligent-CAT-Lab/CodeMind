<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
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

python code:<fim_suffix><fim_middle>
```python
import sys
import math

a = int(sys.stdin.readline())
b = int(sys.stdin.readline())

print(a//b)
```
"""
<|endoftext|>
