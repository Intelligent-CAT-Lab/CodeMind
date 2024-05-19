System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
import math
def readinput():
    a,b,c,d=map(int,input().split())
    return a,b,c,d

def main(a,b,c,d):
    lcm=c*d//math.gcd(c,d)
    #print(lcm)
    return b-a+1 - ( b//c-(a-1)//c + b//d-(a-1)//d - ( b//lcm - (a-1)//lcm ) )


if __name__=='__main__':
    a,b,c,d=readinput()
    ans=main(a,b,c,d)
    print(ans)

```


Answer:
```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long lcm = lcm(c, d);
		long ans = b - a + 1 - (b / c - (a - 1) / c + b / d - (a - 1) / d - (b / lcm - (a - 1) / lcm));
		System.out.println(ans);
	}
}
```<|endoftext|>
