<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 8

Expected output:
40


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
import java.util.Scanner;
import java.math.BigInteger;

public class p02477 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		BigInteger A = new BigInteger(str);
		str = sc.next();
		BigInteger B = new BigInteger(str);
		System.out.println(A.multiply(B));
	}
}
```

In Python, we can use the `bigint` module to perform arithmetic operations on large integers. Here's an example of how we can translate the Java code to Python:
```
import bigint

A = bigint.BigInt(input())
B = bigint.BigInt(input())
print(A * B)
```
This code reads two integers from the user, stores them in variables `A` and `B`, and then prints their product. The `bigint` module is used to perform the multiplication, which is necessary because the integers can be very large.</s>
