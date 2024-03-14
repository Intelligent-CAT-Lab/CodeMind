<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys

def extended_gcd(a, b):
    if a < b:
        return extended_gcd(b, a)
    if b == 0:
        return a, 1, 0
    gcd, x, y = extended_gcd(b, a % b)
    return gcd, y, x - (a // b) * y

def main():
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    gcd, x, y = extended_gcd(a, b)
    print(x, y)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the greatest common divisor (gcd) using the extended Euclidean algorithm, and then prints the coefficients x and y of the Bézout's identity.
<|EOT|>
