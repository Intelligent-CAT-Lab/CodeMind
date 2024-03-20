
```python
s = input()
good = ["dream", "dreamer", "erase", "eraser"]
poss = [False] * (len(s) + 1)
poss[0] = True
for i in range(len(s)):
    if not poss[i]:
        continue
    for out in good:
        if i + len(out) > len(s):
            continue
        match = 0
        for a in range(len(out)):
            if out[a] == s[i+a]:
                match += 1
        if match == len(out):
            poss[i+match] = True
print("YES" if poss[len(s)] else "NO")
```

## 3857 - 
```
import java.awt.geom.*;
import java.io.*;
import java.math.*;
import java.text.*; 
import java.util.*;
import java.util.regex.*;

/*
          br = new BufferedReader(new FileReader("input.txt"));
          pw = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
          br = new BufferedReader(new InputStreamReader(System.in));
          pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
 */

public class p03857 {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static PrintWriter pw;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        //int qq = 1;
        int qq = Integer.MAX_VALUE;
        //int qq = readInt();
        for(int casenum = 1; casenum <= qq; casenum++) {
            int n = readInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = readInt();
            }
            int[] b = new int[n];
            for(int i = 0; i < n; i++) {
                b[i] = readInt();
            }
            int[] c = new int[n];
            for(int i = 0; i < n; i++) {
                c[i] = readInt();
            }
            int[] d = new int[n];
            for(int i = 0; i < n; i++) {
                d[i] = readInt();
            }
            int[] e = new int[n];
            for(int i = 0; i < n; i++) {
                e[i] = readInt();
            }
            int[] f = new int[n];
            for(int i = 0; i < n; i++) {
                f[i] = readInt();
            }
            int[] g = new int[n];
            for(int i = 0; i < n; i++) {
                g[i] = readInt();
            }
            int[] h = new int[n];
            for(int i = 0; i < n; i++) {
                h[i] = readInt();
            }
            int[] i = new int[n];
            for(int j = 0; j < n; j++) {
                i[j] = readInt();
            }
            int[] j = new int[n];
            for(int k = 0; k < n; k++) {
                j[k] = readInt();
            }
            int[] k = new int[n];
            for(int l = 0; l < n; l++) {
                k[l] = readInt();
            }
            int[] l = new int[n];
            for(int m = 0; m < n; m++) {
                l[m] = readInt();
            }
            int[] m = new int[n];
            for(int o = 0; o < n; o++) {
                m[o] = readInt();
            }
            int[] o = new int[n];
            for(int p = 0; p < n; p++) {
                o[p] = readInt();
            }
            int[] p = new int[n];
            for(int q = 0; q < n; q++) {
                p[q] = readInt();
            }
            int[] q = new int[n];
            for(int r = 0; r < n; r++) {
                q[r] = readInt();
            }
            int[] r = new int[n];
            for(int s = 0; s < n; s++) {
                r[s] = readInt();
            }
            int[] s = new int[n];
            for(int t = 0; t < n; t++) {
                s[t] = readInt();
            }
            int[] t = new int[n];
            for(int u = 0; u < n; u++) {
                t[u] = readInt();
            }
            int[] u = new int[n];
            for(int v = 0; v < n; v++) {
                u[v] = readInt();
            }
            int[] v = new int[n];
            for(int w = 0; w < n; w++) {
                v[w] = readInt();
            }
            int[] w = new int[n];
            for(int x = 0; x < n; x++) {
                w[x] = readInt();
            }
        
