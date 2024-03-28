Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        String s = "9" + "9" * (n - 1);
        if (c < 0) {
            System.out.println((n > 1)? 11 : 1);
            return;
        }
        for (char h : "9731".toCharArray()) {
            if (n - 1 > 0) {
                for (int m = (int) Math.pow(10, n - 1); m > 0; m--) {
                    String mStr = String.valueOf(m - 1);
                    if ((h + mStr).chars().map(Character::getNumericValue).sum() * 2 + c) % 3 == 0) {
                        String t = h + mStr.replaceAll("^0+", "");
                        int a = Integer.parseInt(t + String.valueOf(c) + new StringBuilder(t).reverse().toString());
                        if (isPrime(a)) {
                            System.out.println(a);
                            return;
                        }
                    }
                }
            } else {
                int a = Integer.parseInt(h + String.valueOf(c) + h);
                if (isPrime(a)) {
                    System.out.println(a);
                    return;
                }
            }
        }
        System.out.println(0);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```<|endoftext|>
