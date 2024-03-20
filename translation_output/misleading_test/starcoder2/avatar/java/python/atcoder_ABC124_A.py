

```python
a, b = map(int, input().split())
if a == b:
    print(a * 2)
elif a > b:
    print(a * 2 - 1)
else:
    print(b * 2 - 1)
```

## B - Growing Plant

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 100
100 100 100 100

Expected output:
4

```
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class atcoder_ABC124_B {
    public static void main(String[] args) throws Exception {
        System.out.println(solve());
    }

    private static int solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        int ans = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (h[i] >= max) {
                ans++;
                max = h[i];
            }
        }
        return ans;
    }
}
```

python code:

```python
n, k = map(int, input().split())
h = list(map(int, input().split()))
ans = 0
max = 0
for i in range(n):
    if h[i] >= max:
        ans += 1
        max = h[i]
print(ans)
```

## C - Coloring Colorfully

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10

```
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class atcoder_ABC124_C {
    public static void main(String[] args) throws Exception {
        System.out.println(solve());
    }

    private static int solve() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int ans = Math.min(count(s, 0, 1), count(s, 1, 0));
        return ans;
    }

    private static int count(String s, int start, int next) {
        int n = s.length();
        int ans = 0;
        for (int i = start; i < n; i += 2) {
            if (s.charAt(i) - '0' != next) {
                ans++;
            }
        }
        return ans;
    }
}
```

python code:

```python
s = input()
n = len(s)
ans = min(count(s, 0, 1), count(s, 1, 0))
print(ans)

def count(s, start, next):
    ans = 0
    for i in range(start, n, 2):
        if int(s[i]) != next:
            ans += 1
    return ans
```

## D - Handstand

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 2
10101

Expected output:
4

```
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class atcoder_ABC124_D {
    public static void main(String[] args) throws Exception {
        System.out.println(solve());
    }

    private static int solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        int[] a = new int[n + 1];
        int[] b = new int[n + 1];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                cnt++;
            } else {
                a[cnt]++;
                cnt = 0;
            }
        }
        b[0] = a[0];
        for (int i = 1; i <= n; i++) {
            b[i] = b[i - 1] + a[i];
        }
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            int l = i;
            int r = i + 2 * k + 1;
            if (r > n) {
                break;
            }
            int x = b[r - 1] - b[l];
            ans = Math.max(ans, x);
        }
        return ans;
    }
}
```

python code:

```python
n, k = map(int, input().split())
s = input()
a = [0] * (n + 1)
b = [0] * (n + 1)
cnt = 0
for i in range(n):
    if s[i] == '1':
        cnt += 1
    else:
        a[cnt] += 1
        cnt = 0
b[0] = a[0]
for i in range(1, n + 1):
    b[i] = b[i - 1] + a[i]
ans = 0
for i in range(n + 1):
    l = i
    r = i + 2 * k + 1
    if r > n:
        break
    x = b[r - 1] - b[l]
    ans = max(ans, x)
print(ans)
```
 1000000007;

int main() {
    int n;
    cin >> n;
    vector<int> a(n);
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    vector<int> b(n);
    for (int i = 0; i < n; i++) {
        cin >> b[i];
    }
    vector<int> c(n);
    for (int i = 0; i < n; i++) {
        cin >> c[i];
    }
    sort(a.begin(), a.end());
    sort(b.begin(), b.end());
    sort(c.begin(), c.end());
    long long ans = 0;
    for (int i = 0; i < n; i++) {
        int x = a[i];
        int y = b[i];
        int z = c[i];
        int l = lower_bound(a.begin(), a.end(), x) - a.begin();
        int r = upper_bound(a.begin(), a.end(), x) - a.begin();
        int m = lower_bound(b.begin(), b.end(), y) - b.begin();
        int n = upper_bound(b.begin(), b.end(), y) - b.begin();
        int o = lower_bound(c.begin(), c.end(), z) - c.begin();
        int p = upper_bound(c.begin(), c.end(), z) - c.begin();
        ans += (long long)(l - r) * (m - n) * (o - p);
        ans %= MOD;
    }
    cout << ans << endl;
    return 0;
}
```

python code:

```python
n = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
c = list(map(int, input().split()))
a.sort()
b.
