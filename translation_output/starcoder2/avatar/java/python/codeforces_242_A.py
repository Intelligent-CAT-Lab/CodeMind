
```

```


python code:
```

```
/codeforces/242_B.md
# 242_B

## 题目

### 题目描述

```

```

### 输入

```

```

### 输出

```

```

### 样例输入

```

```

### 样例输出

```

```

## 题解

### 思路

### 代码

java code:
```

```/codeforces/242_A.md
# 242_A

## 题目

### 题目描述

```

```

### 输入

```

```

### 输出

```

```

### 样例输入

```

```

### 样例输出

```

```

## 题解

### 思路

### 代码

java code:
```

```

python code:
```

```
/codeforces/242_C.md
# 242_C

## 题目

### 题目描述

```

```

### 输入

```

```

### 输出

```

```

### 样例输入

```

```

### 样例输出

```

```

## 题解

### 思路

### 代码

java code:
```

```

python code:
```

```

python code:
```
import java.io.*;
import java.util.*;

public class codeforces_242_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt(), m = in.nextInt();
        int[] a = new int[n], b = new int[m];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();
        for (int i = 0; i < m; i++) b[i] = in.nextInt();
        int[] c = new int[n + m];
        for (int i = 0; i < n; i++) c[i] = a[i];
        for (int i = 0; i < m; i++) c[i + n] = b[i];
        Arrays.sort(c);
        int[] d = new int[n + m];
        for (int i = 0; i < n + m; i++) d[i] = c[i];
        int[] e = new int[n + m];
        for (int i = 0; i < n + m; i++) e[i] = c[i];
        int[] f = new int[n + m];
        for (int i = 0; i < n + m; i++) f[i] = c[i];
        int[] g = new int[n + m];
        for (int i = 0; i < n + m; i++) g[i] = c[i];
        int[] h = new int[n + m];
        for (int i = 0; i < n + m; i++) h[i] = c[i];
        int[] i = new int[n + m];
        for (int j = 0; j < n + m; j++) i[j] = c[j];
        int[] j = new int[n + m];
        for (int k = 0; k < n + m; k++) j[k] = c[k];
        int[] k = new int[n + m];
        for (int l = 0; l < n + m; l++) k[l] = c[l];
        int[] l = new int[n + m];
        for (int o = 0; o < n + m; o++) l[o] = c[o];
        int[] m1 = new int[n + m];
        for (int p = 0; p < n + m; p++) m1[p] = c[p];
        int[] n1 = new int[n + m];
        for (int q = 0; q < n + m; q++) n1[q] = c[q];
        int[] o1 = new int[n + m];
        for (int r = 0; r < n + m; r++) o1[r] = c[r];
        int[] p1 = new int[n + m];
        for (int s = 0; s < n + m; s++) p1[s] = c[s];
        int[] q1 = new int[n + m];
        for (int t = 0; t < n + m; t++) q1[t] = c[t];
        int[] r1 = new int[n + m];
        for (int u = 0; u < n + m; u++) r1[u] = c[u];
        int[] s1 = new int[n + m];
        for (int v = 0; v < n + m; v++) s1[v] = c[v];
        int[] t1 = new int[n + m];
        for (int w = 0; w < n + m; w++) t1[w] = c[w];
        int[] u1 = new int[n + m];
        for (int x = 0; x < n + m; x++) u1[x] = c[x];
        int[] v1 = new int[n + m];
        for (int y = 0; y < n + m; y++) v1[y] = c[y];
        int[] w1 = new int[n + m];
        for (int z = 0; z < n + m; z++) w1[z] = c[z];
        int[] a1 = new int[n + m];
        for (int b1 = 0; b1 < n + m; b1++) a1[b1] = c[b1];
        int[] c1 = new int[n + m];
        for (int d1 = 0; d1 < n + m; d1++) c1[d1] = c[d1];
        int[] e1 = new int[n + m];
        for (int f1 = 0; f1 < n + m; f1++) e1[f1] = c[f1];
        int[] g1 = new int[n + m];
        for (int h1 = 0; h1 < n + m; h1++) g1[h1] = c[h1];
        int[] i1 = new int[n + m];
        for (int j1 = 0; j1 < n + m; j1++) i1[j1] = c[j1];
        int[] k1 = new int[n + m];
        for (int l1 = 0; l1 < n + m; l1++) k1[l1] = c[l1];
        int[] m2 = new int[n + m];
        for (int n2 = 0; n2 < n + m; n2++) m2[n2] = c[n2];
        int[] o2 = new int[n + m];
        for (int p2 = 0; p2 < n + m; p2++) o2[p2] = c[p2];
        int[] q2 = new int[n + m];
        for (int r2 = 0; r2 < n + m; r2++) q2[r2] = c[r2];
        int[] s2 = new int[n + m];
        for (int t2 = 0
