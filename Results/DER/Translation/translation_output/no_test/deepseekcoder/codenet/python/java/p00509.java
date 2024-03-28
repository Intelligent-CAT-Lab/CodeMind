<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(f());
    }

    public static int p(int x) {
        for (int i = 7; i <= Math.sqrt(x); i += 2) {
            if (x % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int f() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        String s = "9".repeat(n);
        if (c < 0) {
            return (n > 1) ? 11 : Integer.parseInt(s + s);
        }
        String hs = "9731";
        for (char h : hs.toCharArray()) {
            if (n > 1) {
                for (int m = (int) Math.pow(10, n - 1) - 1; m >= 0; m--) {
                    String mStr = String.valueOf(m);
                    if ((Integer.parseInt(h + mStr) * 2 + c) % 3 != 0) {
                        String t = h + mStr.substring(1);
                        int a = Integer.parseInt(t + c + new StringBuilder(t).reverse().toString());
                        if (p(a) == 1) {
                            return a;
                        }
                    }
                }
            } else {
                int a = Integer.parseInt(String.valueOf(h) + c + h);
                if (p(a) == 1) {
                    return a;
                }
            }
        }
        return 0;
    }
}
```

Please note that the ```.zfill()``` method in Python is equivalent to ```substring()``` in Java. Also, Python's ```**``` operator is equivalent to ```Math.pow()``` in Java.
<|EOT|>
