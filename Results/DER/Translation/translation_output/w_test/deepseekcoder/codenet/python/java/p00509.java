<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 0

Expected output:
101


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
        String s = new String(new char[n]).replace("\0", "9");
        if (c < 0) {
            System.out.println((n > 1) ? "11" + s + s : "11");
            return;
        }
        String h = "9731";
        if (n > 1) {
            for (int i = 0; i < 4; i++) {
                for (int m = (int) Math.pow(10, n - 1) - 1; m >= 0; m--) {
                    String strM = String.valueOf(m);
                    if ((Integer.parseInt(h.charAt(i) + strM) * 2 + c) % 3 != 0) {
                        String t = h.charAt(i) + strM.replace("0", "");
                        if (isPrime(Integer.parseInt(t + String.valueOf(c) + new StringBuilder(t).reverse().toString()))) {
                            System.out.println(t + String.valueOf(c) + new StringBuilder(t).reverse().toString());
                            return;
                        }
                    }
                }
            }
        } else {
            for (int i = 0; i < 4; i++) {
                if (isPrime(Integer.parseInt(h.charAt(i) + String.valueOf(c) + h.charAt(i)))) {
                    System.out.println(h.charAt(i) + String.valueOf(c) + h.charAt(i));
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

This Java code does the same thing as the Python code. It reads two integers from the input, generates a string of 9's of length `n`, checks if `c` is negative, and then loops through different combinations of digits to find a prime number. The prime checking function `isPrime` is used to check if a number is prime.
<|EOT|>
