<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8

Expected output:
-51

```
#Dåé¡
#Dåé¡
import math
N=int(input())
n=int(math.sqrt(N))
plist=[]
for i in range(1,n+1):
    if N%i == 0:
        plist.append(i)
        if i != int(N/i):
            plist.append(int(N/i))
ans=0
for i in range(len(plist)):
    x=plist[i]
    kari=int(N/x)-1
    if kari == 0:
        pass
    else:
        q=int(N/kari)
        r=N%kari
        if q == r:
            ans+=kari
print(ans)
            

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int n = (int) Math.sqrt(N);
        ArrayList<Integer> plist = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (N % i == 0) {
                plist.add(i);
                if (i != N / i) {
                    plist.add(N / i);
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < plist.size(); i++) {
            int x = plist.get(i);
            int kari = N / x - 1;
            if (kari == 0) {
                continue;
            } else {
                int q = N / kari;
                int r = N % kari;
                if (q == r) {
                    ans += kari;
                }
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the square root of the integer, and then finds all divisors of the integer. It then iterates over these divisors and checks if the quotient of the integer divided by the divisor minus one is equal to the remainder of the integer divided by the quotient. If it is, it adds the quotient to the answer. Finally, it prints the answer.<｜end▁of▁sentence｜>
