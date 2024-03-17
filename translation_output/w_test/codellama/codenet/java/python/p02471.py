<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 12

Expected output:
1 0


```
import java.util.*;
import java.io.*;

public class p02471 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int r1=a,x1=1,y1=0,r2=b,x2=0,y2=1,r3,q,x3,y3;
        while(r2!=0){
            q=r1/r2;
            r3=r1%r2;
            x3=x1-q*x2;
            y3=y1-q*y2;
            r1=r2;
            r2=r3;
            x1=x2;
            x2=x3;
            y1=y2;
            y2=y3;
        }
        System.out.println(x1+" "+y1);
    }
    
    static int gcd(int a,int b){
        if(a<b) return gcd(b,a);
        if(b==0) return a;
        return gcd(a,a%b);
    }
}


```
[/INST]
```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    x1, y1 = 1, 0
    x2, y2 = 0, 1
    r1, r2 = a, b
    while r2 != 0:
        q = r1 // r2
        r3 = r1 % r2
        x3 = x1 - q * x2
        y3 = y1 - q * y2
        r1 = r2
        r2 = r3
        x1 = x2
        x2 = x3
        y1 = y2
        y2 = y3
    print(x1, y1)

if __name__ == "__main__":
    main()
```
This code is a solution to the problem of finding the greatest common divisor (GCD) of two integers using the Euclidean algorithm. The algorithm works by repeatedly dividing the larger number by the smaller number and keeping the remainder, until the smaller number becomes 0. The GCD is then the larger number.

The code first reads in two integers `a` and `b` from standard input using the `sys.stdin.readline()` method. It then initializes the variables `x1`, `y1`, `x2`, `y2`, `r1`, `r2` to the values 1, 0, 0, 1, `a`, `b` respectively.

The code then enters a loop that repeatedly divides `r1` by `r2` and keeps the remainder, until `r2` becomes 0. At each iteration, the code updates the values of `x1`, `y1`, `x2`, `y2`, `r1`, `r2` using the following formulas:

* `x3 = x1 - q * x2`
* `y3 = y1 - q * y2`
* `r1 = r2`
* `r2 = r3`
* `x1 = x2`
* `x2 = x3`
* `y1 = y2`
* `y2 = y3`

After the loop, the code prints the values of `x1` and `y1` as the GCD of `a` and `b`.

Note that the code uses the `//` operator to perform integer division, which returns the integer part of the result. The `%` operator is used to compute the remainder.</s>
