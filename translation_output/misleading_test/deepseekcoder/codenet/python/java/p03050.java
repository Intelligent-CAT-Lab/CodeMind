<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.ArrayList;
import java.util.Scanner;

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

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates its factors, and then sums up the factors that satisfy a certain condition. The result is then printed to the standard output.
<|EOT|>
