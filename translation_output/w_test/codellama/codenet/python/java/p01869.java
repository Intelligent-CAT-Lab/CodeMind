<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]

Here is the Java code that translates the Python code:
```java
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 1) {
            System.out.println(-1);
            return;
        }
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i * 2 + 1;
            b[i] = i * 2 + 2;
        }
        int[] sortedA = Arrays.stream(a).sorted().toArray();
        int[] sortedB = Arrays.stream(b).sorted().toArray();
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (sortedA[i] * sortedA[i] > n) {
                break;
            }
            if (n % sortedA[i] == 0) {
                max = Math.max(max, g(n / sortedA[i], i));
            }
        }
        System.out.println(max);
    }

    public static int g(int n, int p) {
        if (n == 1) {
            return 1;
        }
        int m = -1 << 20;
        for (int i = p; i < n; i++) {
            if (n % a[i] == 0) {
                m = Math.max(m, g(n / a[i], i));
            }
        }
        return m;
    }
}
```
Note that this code is not optimized and may not be the most efficient way to solve the problem. It is just a translation of the Python code to Java.</s>
