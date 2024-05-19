System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
import math
a, b, c = map(int, input().split())
print(0.5*a*b*math.sin(math.radians(c)))
print(a+b+(a**2+b**2-2*a*b*math.cos(math.radians(c)))**0.5)
print(b*math.sin(math.radians(c)))

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
		int c = sc.nextInt();
		double ans1 = 0.5*a*b*Math.sin(Math.toRadians(c));
		double ans2 = Math.sqrt(a*a+b*b-2*a*b*Math.cos(Math.toRadians(c)));
		double ans3 = b*Math.sin(Math.toRadians(c));
		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans3);
	}
}
```<|endoftext|>
