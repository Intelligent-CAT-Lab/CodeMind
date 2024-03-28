
```python
import sys

def sort(t):
    for i in range(len(t)):
        for j in range(len(t)-1,i,-1):
            if t[i] > t[j]:
                t[i],t[j] = t[j],t[i]
    return t

mstr = "AADINNUY"
nstr = "AIZUNYAN"
t = "AAAAAAAA"
tt = ""
for line in sys.stdin:
    dstr = line.strip()
    if len(dstr) < 8:
        print(dstr)
        continue
    for i in range(len(dstr)-7):
        t = dstr[i:i+8]
        tt = t
        t = list(t)
        t = sort(t)
        t = "".join(t)
        if mstr == t:
            dstr = dstr.replace(tt,nstr)
            i += 7
    print(dstr)
```

## 01688

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10

```
import java.util.*;
public class p01688{
    public static void main(String[] args){
        new p01688().run();
    }
    public void run(){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n = scan.nextInt();
            int[] a = new int[n];
            for(int i = 0;i < n;i++){
                a[i] = scan.nextInt();
            }
            int[] b = new int[n];
            for(int i = 0;i < n;i++){
                b[i] = a[i];
            }
            sort(b);
            int[] c = new int[n];
            for(int i = 0;i < n;i++){
                c[i] = a[i];
            }
            int[] d = new int[n];
            for(int i = 0;i < n;i++){
                d[i] = a[i];
            }
            int[] e = new int[n];
            for(int i = 0;i < n;i++){
                e[i] = a[i];
            }
            int[] f = new int[n];
            for(int i = 0;i < n;i++){
                f[i] = a[i];
            }
            int[] g = new int[n];
            for(int i = 0;i < n;i++){
                g[i] = a[i];
            }
            int[] h = new int[n];
            for(int i = 0;i < n;i++){
                h[i] = a[i];
            }
            int[] i = new int[n];
            for(int j = 0;j < n;j++){
                i[j] = a[j];
            }
            int[] j = new int[n];
            for(int k = 0;k < n;k++){
                j[k] = a[k];
            }
            int[] k = new int[n];
            for(int l = 0;l < n;l++){
                k[l] = a[l];
            }
            int[] l = new int[n];
            for(int m = 0;m < n;m++){
                l[m] = a[m];
            }
            int[] m = new int[n];
            for(int o = 0;o < n;o++){
                m[o] = a[o];
            }
            int[] o = new int[n];
            for(int p = 0;p < n;p++){
                o[p] = a[p];
            }
            int[] p = new int[n];
            for(int q = 0;q < n;q++){
                p[q] = a[q];
            }
            int[] q = new int[n];
            for(int r = 0;r < n;r++){
                q[r] = a[r];
            }
            int[] r = new int[n];
            for(int s = 0;s < n;s++){
                r[s] = a[s];
            }
            int[] s = new int[n];
            for(int t = 0;t < n;t++){
                s[t] = a[t];
            }
            int[] t = new int[n];
            for(int u = 0;u < n;u++){
                t[u] = a[u];
            }
            int[] u = new int[n];
            for(int v = 0;v < n;v++){
                u[v] = a[v];
            }
            int[] v = new int[n];
            for(int w = 0;w < n;w++){
                v[w] = a[w];
            }
            int[] w = new int[n];
            for(int x = 0;x < n;x++){
                w[x] = a[x];
            }
            int[] x = new int[n];
            for(int y = 0;y < n;y++){
                x[y] = a[y];
            }
            int[] y = new int[n];
            for(int z = 0;z < n;z++){
                y[z] = a[z];
            }
            int[] z = new int[n];
            for(int aa = 0;aa < n;aa++){
                z[aa] = a[aa];
            }
            int[] aa = new int[n];
            for(int bb = 0;bb < n;bb++){
                aa[bb] = a[bb];
            }
            int[] bb = new int[n];
            for(int cc = 0;cc < n;cc++){
                bb[cc] = a[cc];
            }
            int[] cc = new int[n];
            for(int dd = 0;dd < n;dd++){
                cc[dd] = a[dd];
            }
            int[] dd = new int[n];
            for(int ee = 0;ee < n;ee++){
                dd[ee] = a[ee];
            }
            int[] ee = new int[n];
            for(int ff = 0;ff < n
