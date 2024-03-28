
```python
s = input()
ans1 = 0
ans2 = 0
for i in range(len(s)):
    if i % 2 == 0:
        if s[i] == '0':
            ans1 += 1
        else:
            ans2 += 1
    else:
        if s[i] == '1':
            ans1 += 1
        else:
            ans2 += 1
print(min(ans1, ans2))
```

## 2.

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```
import java.util.*;

class atcoder_ABC124_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        int[] a = new int[n];
        int[] b = new int[n];
        int cnt = 0;
        int ans = 0;
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                cnt++;
            } else {
                a[i] = cnt;
                cnt = 0;
            }
        }
        
        cnt = 0;
        
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                cnt++;
            } else {
                b[i] = cnt;
                cnt = 0;
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                int l = 0;
                int r = 0;
                
                if (i - 1 >= 0) {
                    l = a[i - 1];
                }
                
                if (i + 1 < n) {
                    r = b[i + 1];
                }
                
                ans = Math.max(ans, l + r + 1);
            }
        }
        
        System.out.println(ans);
    }
}
```

python code:
```python
n, k = map(int, input().split())
s = input()
a = [0] * n
b = [0] * n
cnt = 0
ans = 0
for i in range(n):
    if s[i] == '1':
        cnt += 1
    else:
        a[i] = cnt
        cnt = 0
cnt = 0
for i in range(n - 1, -1, -1):
    if s[i] == '1':
        cnt += 1
    else:
        b[i] = cnt
        cnt = 0
for i in range(n):
    if s[i] == '0':
        l = 0
        r = 0
        if i - 1 >= 0:
            l = a[i - 1]
        if i + 1 < n:
            r = b[i + 1]
        ans = max(ans, l + r + 1)
print(ans)
```

## 3.

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 3
1 2 3

Expected output:
1

```
import java.util.*;

class atcoder_ABC124_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int[][] a = new int[m][3];
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        boolean[] used = new boolean[n];
        
        for (int i = 0; i < m; i++) {
            a[i][0] = sc.nextInt() - 1;
            a[i][1] = sc.nextInt() - 1;
            a[i][2] = sc.nextInt();
        }
        
        dist[0] = 0;
        
        for (int i = 0; i < n; i++) {
            int v = -1;
            
            for (int j = 0; j < n; j++) {
                if (!used[j] && (v == -1 || dist[j] < dist[v])) {
                    v = j;
                }
            }
            
            used[v] = true;
            
            for (int j = 0; j < m; j++) {
                if (a[j][0] == v) {
                    dist[a[j][1]] = Math.min(dist[a[j][1]], dist[v] + a[j][2]);
                } else if (a[j][1] == v) {
                    dist[a[j][0]] = Math.min(dist[a[j][0]], dist[v] + a[j][2]);
                }
            }
        }
        
        int ans = 0;
        
        for (int i = 0; i < n; i++) {
            if (dist[i] <= l) {
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}
```

python code:
```python
n, m, l = map(int, input().split())
a = [[0] * 3 for _ in range(m)]
dist = [float('inf')] * n
used = [False] * n
for i in range(m):
    a[i][0], a[i][1], a[i][2] = map(int, input().split())
    a[i][0] -= 1
    a[i][1] -= 1
dist[0] = 0
for i in range(n):
    v = -1
    for j in range(n):
        if not used[j] and (v == -1 or dist[j] < dist[v]):
            v = j
    used[v] = True
    for j in range(m):
        if a[j][0] == v:
            dist[a[j][1]] = min(dist[a[j][1]], dist[v] + a[j][2])
        elif a[j][1] == v:
            dist[a[j][0]] = min(dist[a[j][0]], dist[v] + a[j][2])
ans = 0
for i in range(n):
    if dist[i] <= l:
        ans += 1
print(ans)
```
/README.md
# atcoder-java-to-python

This repository contains the solutions to the problems in the [AtCoder Beginner Contest 124](https://atcoder.jp/contests/abc124) translated from Java to Python.

## 1.

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0

Expected output:
54

```
import java.util.*;

class atcoder_ABC124_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans1 = 0;
        int ans2 = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (i % 2 == 0) {
                if (c == '0') {
                    ans1++;
                } else {
                    ans2++;
                }
            } else {
                if (c == '1')
