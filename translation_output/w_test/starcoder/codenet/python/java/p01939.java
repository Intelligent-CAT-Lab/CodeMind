<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 9

Expected output:
50


```
MOD = 10**9+7

def sum(a,d,n):
    return n*(2*a+(n-1)*d)//2

def main():
    n,m = map(int,input().split())

    s = 0
    if n == 1:
        s = m+1
    else:
        s = sum(m+1,-n+1,1+m//(n-1))
        s *= 2
        s -= (m+1)

    print(s%MOD)

if __name__ == '__main__':
    main()
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    static int MOD = 1000000007;

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int s = 0;
        if(n == 1)
            s = m+1;
        else{
            s = (m+1)*((2*m+(n-1)*(-n+1))/(2*(n-1)));
            s *= 2;
            s -= (m+1);
        }

        System.out.println(s%MOD);
    }
}
```
<|endoftext|>
