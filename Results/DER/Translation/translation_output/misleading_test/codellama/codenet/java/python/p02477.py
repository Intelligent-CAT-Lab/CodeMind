<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 8

Expected output:
12

```
import java.util.*;
import java.math.*;

class p02477{
	public static void main(String Args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		BigInteger A = new BigInteger(str);
		str = sc.next();
		BigInteger B = new BigInteger(str);
		System.out.println(A.multiply(B));
	}
}


```
[/INST]
```
import java.util.*;
import java.math.*;

class p02477:
    def main(Args):
        sc = Scanner(System.in)
        str = sc.next()
        A = BigInteger(str)
        str = sc.next()
        B = BigInteger(str)
        print(A.multiply(B))
```
This is the equivalent Python code for the given Java code. The `Scanner` class is used to read input from the user, and the `BigInteger` class is used to perform arithmetic operations on large numbers. The `multiply` method is used to multiply two `BigInteger` objects. The `print` function is used to print the result to the console.</s>
