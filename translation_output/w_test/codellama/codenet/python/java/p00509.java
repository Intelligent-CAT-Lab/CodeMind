<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]

Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        String s = "9".repeat(n);
        if (c < 0) {
            return (11, s + s)[n > 1];
        }
        for (char h : "9731") {
            if (n - 1) {
                for (int m = (int) Math.pow(10, -n); m >= 0; m--) {
                    String mStr = String.valueOf(m - 1);
                    if ((sum(h + mStr) * 2 + c) % 3) {
                        String t = h + mStr.substring(0, n - 1);
                        int a = Integer.parseInt(t + String.valueOf(c) + t.substring(t.length() - 1));
                        if (p(a)) {
                            return a;
                        }
                    }
                }
            } else {
                int a = Integer.parseInt(h + String.valueOf(c) + h);
                if (p(a)) {
                    return a;
                }
            }
        }
        return -1;
    }

    public static int sum(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += Integer.parseInt(String.valueOf(c));
        }
        return sum;
    }

    public static boolean p(int x) {
        for (int i = 7; i <= (int) Math.sqrt(x) + 1; i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```
Note that the `repeat` method used in the Python code is not available in Java, so I used the `String.repeat` method from the Apache Commons Lang library. Also, the `sum` method used in the Python code is not available in Java, so I defined a new `sum` method that takes a `String` as input and returns the sum of the digits in the `String`. Finally, the `p` method used in the Python code is not available in Java, so I defined a new `p` method that takes an `int` as input and returns `true` if the input is a prime number and `false` otherwise.</s>
