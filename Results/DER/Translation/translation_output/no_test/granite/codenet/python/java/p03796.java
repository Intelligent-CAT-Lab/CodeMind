System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
import math
n=int(input())
print(math.factorial(n)%1000000007)
```


Answer:
```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long fact = 1;
		for(int i = 1; i <= n; i++){
		    fact = (fact * i) % 1000000007;
		}
		System.out.println(fact);
	}
}
```<|endoftext|>
