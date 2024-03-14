<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import bisect
import sys
sys.setrecursionlimit(10000)
a=[]
def f(a,bin,n):
    if bin>n:return
    if bin:a+=[bin]
    f(a,bin*10+2,n)
    f(a,bin*10+8,n)

def g(n,p):
    m=-1<<20
    x=bisect.bisect_left(a,n)
    if x!=len(a) and a[x]==n:m=1
    if a[p]**2>n:return m
    if n%a[p]==0:m=g(n//a[p],p)+1
    return max(m,g(n,p+1))

n=int(input())
if n&1:print(-1);exit()
f(a,0,n)
a=sorted(a)
b=g(n,0)
if b<0:b=-1
print(b)
```

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    static ArrayList<Integer> a = new ArrayList<>();

    static void f(ArrayList<Integer> a, int bin, int n) {
        if (bin > n) return;
        if (bin != 0) a.add(bin);
        f(a, bin * 10 + 2, n);
        f(a, bin * 10 + 8, n);
    }

    static int g(int n, int p) {
        int m = -1 << 20;
        int x = Collections.binarySearch(a, n);
        if (x >= 0 && a.get(x) == n) m = 1;
        if (a.get(p) * a.get(p) > n) return m;
        if (n % a.get(p) == 0) m = g(n / a.get(p), p) + 1;
        return Math.max(m, g(n, p + 1));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if ((n & 1) != 0) {
            System.out.println(-1);
            System.exit(0);
        }
        f(a, 0, n);
        Collections.sort(a);
        int b = g(n, 0);
        if (b < 0) b = -1;
        System.out.println(b);
    }
}
```

This Java code does the same thing as your Python code. It generates all binary numbers that can be formed by using only 2 and 8 as digits and then uses binary search to find the maximum length of such a binary number that divides the input number.
<|EOT|>
