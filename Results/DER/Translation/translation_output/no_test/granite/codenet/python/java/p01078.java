System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
# AOJ 1593: Star
# Python3 2018.7.13 bal4u

import math
PI = 3.1415926535897932384626433832795
# area = n*r^2*sin(180/n)*cos(180k/n)*sec(180(k-1)/n), for n/k star
N, K = map(int, input().split())
print(N*math.sin(PI/N)*math.cos(K*PI/N)/math.cos((K-1)*PI/N))

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
		double PI = 3.1415926535897932384626433832795;
		int N = sc.nextInt();
		int K = sc.nextInt();
		double area = N*Math.sin(PI/N)*Math.cos(K*PI/N)/Math.cos((K-1)*PI/N);
		System.out.printf("%.8f\n", area);
	}
}
```<|endoftext|>
