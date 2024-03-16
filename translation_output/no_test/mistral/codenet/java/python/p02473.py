<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```


import java.math.BigInteger;
import java.util.Scanner;

public class p02473 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		BigInteger a = new BigInteger(sc.next());
		BigInteger b = new BigInteger(sc.next());
		
		a = a.subtract(b);
		
		System.out.println(a);
	}

}


```
[/INST]
```python
import math

a = int(input())
b = int(input())

a = a - b

print(a)
```</s>
