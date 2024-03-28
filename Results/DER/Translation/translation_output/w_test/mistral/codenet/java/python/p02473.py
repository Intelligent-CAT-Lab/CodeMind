<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 8

Expected output:
-3


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
# Sample test case
a = int(input())
b = int(input())

# Expected output
print(a - b)
```</s>
