Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
-1


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
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 1) {
            System.out.println(-1);
            return;
        }
        List<Integer> a = new ArrayList<>();
        f(a, 0, n);
        Collections.sort(a);
        int b = g(n, 0);
        if (b < 0) {
            b = -1;
        }
        System.out.println(b);
    }

    public static void f(List<Integer> a, int bin, int n) {
        if (bin > n) {
            return;
        }
        if (bin!= 0) {
            a.add(bin);
        }
        f(a, bin * 10 + 2, n);
        f(a, bin * 10 + 8, n);
    }

    public static int g(int n, int p) {
        int m = -1 << 20;
        int x = Collections.binarySearch(a, n);
        if (x >= 0 && a.get(x) == n) {
            m = 1;
        }
        if (a.get(p) * a.get(p) > n) {
            return m;
        }
        if (n % a.get(p) == 0) {
            m = Math.max(m, g(n / a.get(p), p) + 1);
        }
        return Math.max(m, g(n, p + 1));
    }
}
```<|endoftext|>
