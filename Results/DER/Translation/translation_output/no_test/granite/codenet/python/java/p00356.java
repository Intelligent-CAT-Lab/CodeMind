System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
import math
a,b = map(int,input().split())
print(a+b-(math.gcd(a,b))+1)

```


Answer:
```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcd = gcd(a,b);
		System.out.println(a+b-gcd+1);
	}
	public static int gcd(int a, int b) {
	    if (b == 0)
	        return a;
	    return gcd(b, a % b);
	}
}
```<|endoftext|>
