
```
import sys

n, k = map(int, sys.stdin.readline().split())
x0 = int(sys.stdin.readline())

if x0 == 0:
    print(0)
    exit()

x = x0
s = 10000
count = [0] * s
offset = 2 ** 63
M = s / 2 ** 64
for i in range(n):
    at = int((x + offset) * M)
    if at < 0:
        at = 0
    if at >= s:
        at = s - 1
    count[at] += 1
    x ^= x << 13
    x ^= x >> 7
    x ^= x << 17

sum = 0
length = -1
target = -1
for i in range(s):
    if sum <= k and k < sum + count[i]:
        target = i
        length = count[i]
        break
    sum += count[i]

now = 0
is = [0] * length
x = x0
for i in range(n):
    at = int((x + offset) * M)
    if at < 0:
        at = 0
    if at >= s:
        at = s - 1
    if at == target:
        is[now] = x
        now += 1
    x ^= x << 13
    x ^= x >> 7
    x ^= x << 17

is.sort()
print(is[k - sum])
```

## 01640

### 题目

[01640](https://www.luogu.org/problem/P01640)

### 题解

```
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class p01640{
    Scanner sc=new Scanner(System.in);

    int n, m;
    int[] a;

    void run(){
        n=sc.nextInt();
        m=sc.nextInt();
        a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        solve();
    }

    void solve(){
        int[] b=new int[n];
        for(int i=0; i<n; i++){
            b[i]=a[i];
        }
        sort(b);
        int[] c=new int[n];
        for(int i=0; i<n; i++){
            c[i]=lowerBound(b, a[i]);
        }
        int[] d=new int[n];
        for(int i=0; i<n; i++){
            d[i]=c[i];
        }
        sort(d);
        int[] e=new int[n];
        for(int i=0; i<n; i++){
            e[i]=lowerBound(d, c[i]);
        }
        int[] f=new int[n];
        for(int i=0; i<n; i++){
            f[i]=e[i];
        }
        sort(f);
        int[] g=new int[n];
        for(int i=0; i<n; i++){
            g[i]=lowerBound(f, e[i]);
        }
        int[] h=new int[n];
        for(int i=0; i<n; i++){
            h[i]=g[i];
        }
        sort(h);
        int[] i=new int[n];
        for(int j=0; j<n; j++){
            i[j]=lowerBound(h, g[j]);
        }
        int[] j=new int[n];
        for(int k=0; k<n; k++){
            j[k]=i[k];
        }
        sort(j);
        int[] k=new int[n];
        for(int l=0; l<n; l++){
            k[l]=lowerBound(j, i[l]);
        }
        int[] l=new int[n];
        for(int o=0; o<n; o++){
            l[o]=k[o];
        }
        sort(l);
        int[] m=new int[n];
        for(int p=0; p<n; p++){
            m[p]=lowerBound(l, k[p]);
        }
        int[] o=new int[n];
        for(int q=0; q<n; q++){
            o[q]=m[q];
        }
        sort(o);
        int[] p=new int[n];
        for(int r=0; r<n; r++){
            p[r]=lowerBound(o, m[r]);
        }
        int[] q=new int[n];
        for(int s=0; s<n; s++){
            q[s]=p[s];
        }
        sort(q);
        int[] r=new int[n];
        for(int t=0; t<n; t++){
            r[t]=lowerBound(q, p[t]);
        }
        int[] s=new int[n];
        for(int u=0; u<n; u++){
            s[u]=r[u];
        }
        sort(s);
        int[] t=new int[n];
        for(int v=0; v<n; v++){
            t[v]=lowerBound(s, r[v]);
        }
        int[] u=new int[n];
        for(int w=0; w<n; w++){
            u[w]=t[w];
        }
        sort(u);
        int[] v=new int[
