

```python
s = input()
ar = [0] * 26
for i in range(len(s)):
    ar[ord(s[i]) - 97] += 1
cntod = 0
for i in range(26):
    if ar[i] % 2 != 0:
        cntod += 1
if cntod == 0:
    print("First")
else:
    if cntod % 2 == 0:
        print("Second")
    else:
        print("First")
```

## 276B - Little Girl and Game

[problem link](http://codeforces.com/problemset/problem/276/B)

[solution link](http://codeforces.com/contest/276/submission/17000000)
/codeforces/codeforces_276_A.md
# codeforces 276 A

## 276A - Lunch Rush

[problem link](http://codeforces.com/problemset/problem/276/A)

[solution link](http://codeforces.com/contest/276/submission/16999999)

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 5
10 3
-10 2
10 1
Expected output:
10


```
import java.util.*;

public class codeforces_276_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int f = in.nextInt();
            int t = in.nextInt();
            if (t > k) {
                f = f - (t - k);
            }
            max = Math.max(max, f);
        }
        System.out.println(max);
    }
}
```

python code:

```python
n, k = map(int, input().split())
max = -1000000000
for i in range(n):
    f, t = map(int, input().split())
    if t > k:
        f = f - (t - k)
    max = max if max > f else f
print(max)
```

## 276A - Lunch Rush

[problem link](http://codeforces.com/problemset/problem/276/A)

[solution link](http://codeforces.com/contest/276/submission/17000000)
 1000000000
for i in range(n):
    f, t = map(int, input().split())
    if t > k:
        f = f - (t - k)
    max = max if max > f else f
print(max)
```

## 276A - Lunch Rush

[problem link](http://codeforces.com/problemset/problem/276/A)

[solution link](http://codeforces.com/contest/276/submission/17000000)
/codeforces/codeforces_276_A.md
# codeforces 276 A

## 276A - Lunch Rush

[problem link](http://codeforces.com/problemset/problem/276/A)

[solution link](http://codeforces.com/contest/276/submission/16999999)

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 5
10 3
-10 2
10 1
Expected output:
10


```
import java.util.*;

public class codeforces_276_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int f = in.nextInt();
            int t = in.nextInt();
            if (t > k) {
                f = f - (t - k);
            }
            max = Math.max(max, f);
        }
        System.out.println(max);
    }
}
```

python code:

```python
n, k = map(int, input().split())
max = -1000000000
for i in range(n):
    f, t = map(int, input().split())
    if t > k:
        f = f - (t - k)
    max = max if max > f else f
print(max)
```

## 276A - Lunch Rush

[problem link](http://codeforces.com/problemset/problem/276/A)

[solution link](http://codeforces.com/contest/276/submission/17000000)

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 5
10 3
-10 2
10 1
Expected output:
10


```
import java.util.*;

public class codeforces_276_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int f = in.nextInt();
            int t = in.nextInt();
            if (t > k) {
                f = f - (t - k);
            }
            max = Math.max(max, f);
        }
        System.out.println(max);
    }
}
```

python code:

```python
n, k = map(int, input().split())
max = -1000000000
for i in range(n):
    f, t = map(int, input().split())
    if t > k:
        f = f - (t - k)
    max = max if max > f else f
print(max)
```

## 276A - Lunch Rush

[problem link](http://codeforces.com/problemset/problem/276/A)

[solution link](http://codeforces.com/contest/276/submission/17000000)

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case
