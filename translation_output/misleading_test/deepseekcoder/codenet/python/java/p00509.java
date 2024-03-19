<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 0

Expected output:
194

```
def p(x):
 for i in range(7,int(x**.5+1),2):
  if x%i==0:return 0
 return 1
def f():
 n,c=map(int,input().split());s='9'*n
 if c<0:return(11,s+s)[n>1]
 for h in'9731':
  if n-1:
   for m in range(int(10**~-n),0,-1):
    m=str(m-1)
    if(sum(int(k)for k in h+m)*2+c)%3:
     t=h+m.zfill(n-1);a=int(t+str(c)+t[::-1])
     if p(a):return a
  else:
   a=int(h+str(c)+h)
   if p(a):return a
print(f())

```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        String s = "9".repeat(n);
        if (c < 0) {
            System.out.println((n > 1 ? "11" : "1") + s + s);
            return;
        }
        for (char h : "9731".toCharArray()) {
            if (n > 1) {
                for (int m = (int) Math.pow(10, n - 1) - 1; m >= 0; m--) {
                    String strM = String.valueOf(m);
                    if ((Integer.parseInt(h + strM) * 2 + c) % 3 != 0) {
                        String t = h + strM.substring(1);
                        if (isPrime(Integer.parseInt(t + String.valueOf(c) + new StringBuilder(t).reverse().toString()))) {
                            System.out.println(t + strM + c + new StringBuilder(t).reverse().toString());
                            return;
                        }
                    }
                }
            } else {
                int a = Integer.parseInt(String.valueOf(h) + c + h);
                if (isPrime(a)) {
                    System.out.println(a);
                    return;
                }
            }
        }
    }

    private static boolean isPrime(int x) {
        for (int i = 7; i <= Math.sqrt(x); i += 2) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, generates a string of 9's of length `n`, checks if `c` is negative, and then loops through different combinations of digits to find a prime number. If a prime number is found, it is printed and the function returns.
<|EOT|>
