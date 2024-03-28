

```python
a = input().split()
b = input().split()
k = int(input())
max = 0
for i in range(1<<10):
    if bin(i).count('1') > k:
        continue
    borrow = [0] * 11
    c = [0] * 10
    for j in range(10):
        if int(a[j]) - borrow[j] >= int(b[j]):
            c[j] = int(a[j]) - borrow[j] - int(b[j])
            borrow[j+1] = 0
        else:
            c[j] = int(a[j]) - borrow[j] + 10 - int(b[j])
            borrow[j+1] = 1 if i & (1<<j) == 0 else 0
    ans = 0
    for j in range(9, -1, -1):
        ans *= 10
        ans += c[j]
    max = ans if ans > max else max
print(max)
```

## 01468

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.Scanner;

public class p01468 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] a = new int[s.length()];
        for(int i=0;i<s.length();i++) {
            a[i] = s.charAt(s.length()-1-i) - '0';
        }
        int[] b = new int[s.length()];
        for(int i=0;i<s.length();i++) {
            b[i] = a[i];
        }
        int[] c = new int[s.length()];
        for(int i=0;i<s.length();i++) {
            c[i] = a[i];
        }
        int[] d = new int[s.length()];
        for(int i=0;i<s.length();i++) {
            d[i] = a[i];
        }
        int[] e = new int[s.length()];
        for(int i=0;i<s.length();i++) {
            e[i] = a[i];
        }
        int[] f = new int[s.length()];
        for(int i=0;i<s.length();i++) {
            f[i] = a[i];
        }
        int[] g = new int[s.length()];
        for(int i=0;i<s.length();i++) {
            g[i] = a[i];
        }
        int[] h = new int[s.length()];
        for(int i=0;i<s.length();i++) {
            h[i] = a[i];
        }
        int[] i = new int[s.length()];
        for(int j=0;j<s.length();j++) {
            i[j] = a[j];
        }
        int[] j = new int[s.length()];
        for(int k=0;k<s.length();k++) {
            j[k] = a[k];
        }
        int[] k = new int[s.length()];
        for(int l=0;l<s.length();l++) {
            k[l] = a[l];
        }
        int[] l = new int[s.length()];
        for(int m=0;m<s.length();m++) {
            l[m] = a[m];
        }
        int[] m = new int[s.length()];
        for(int n=0;n<s.length();n++) {
            m[n] = a[n];
        }
        int[] o = new int[s.length()];
        for(int p=0;p<s.length();p++) {
            o[p] = a[p];
        }
        int[] p = new int[s.length()];
        for(int q=0;q<s.length();q++) {
            p[q] = a[q];
        }
        int[] q = new int[s.length()];
        for(int r=0;r<s.length();r++) {
            q[r] = a[r];
        }
        int[] r = new int[s.length()];
        for(int t=0;t<s.length();t++) {
            r[t] = a[t];
        }
        int[] t = new int[s.length()];
        for(int u=0;u<s.length();u++) {
            t[u] = a[u];
        }
        int[] u = new int[s.length()];
        for(int v=0;v<s.length();v++) {
            u[v] = a[v];
        }
        int[] v = new int[s.length()];
        for(int w=0;w<s.length();w++) {
            v[w] = a[w];
        }
        int[] w = new int[s.length()];
        for(int x=0;x<s.length();x++) {
            w[x] = a[x];
        }
        int[] x = new int[s.length()];
        for(int y=0;y<s.length();y++) {
            x[y] = a[y];
        }
        int[] y = new int[s.length()];
        for(int z=0;z<s.length();z++) {
            y[z] = a[z];
        }
        int[] z = new int[s.length()];
        for(int aa=0;aa<s.length();aa++) {
            z[aa] = a[aa];
        }
        int[] ab = new int[s.length()];
        for(int ac=0;ac<s.length();ac++) {
            ab[ac] = a[ac];
        }
        int[] ad = new int[s.length()];
        for(int ae=0;ae<s.length();ae++) {
