
```python
num_1, num_2, num_3 = map(int, input().split())

if num_1 == 7:
    if num_2 == 5 and num_3 == 5:
        print("YES")
    else:
        print("NO")
elif num_2 == 7:
    if num_1 == 5 and num_3 == 5:
        print("YES")
    else:
        print("NO")
elif num_3 == 7:
    if num_2 == 5 and num_1 == 5:
        print("YES")
    else:
        print("NO")
```

## 2. 
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class atcoder_ABC042_B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int l = scan.nextInt();

        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scan.next();
        }

        Arrays.sort(s);

        for (int i = 0; i < n; i++) {
            System.out.print(s[i]);
        }
        System.out.println();
    }
}
```

python code:
```python
n, l = map(int, input().split())

s = []
for i in range(n):
    s.append(input())

s.sort()

for i in range(n):
    print(s[i], end="")
```

## 3. 
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class atcoder_ABC042_C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = Integer.parseInt(str);
        int k = scan.nextInt();

        int[] d = new int[k];
        for (int i = 0; i < k; i++) {
            d[i] = scan.nextInt();
        }

        int ans = 0;
        for (int i = n; i <= 1000000000; i++) {
            boolean ok = true;
            String s = Integer.toString(i);
            for (int j = 0; j < s.length(); j++) {
                int num = s.charAt(j) - '0';
                for (int l = 0; l < k; l++) {
                    if (num == d[l]) {
                        ok = false;
                    }
                }
            }
            if (ok) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
```

python code:
```python
n, k = map(int, input().split())

d = list(map(int, input().split()))

ans = 0
for i in range(n, 1000000001):
    ok = True
    s = str(i)
    for j in range(len(s)):
        num = int(s[j])
        for l in range(k):
            if num == d[l]:
                ok = False
    if ok:
        ans = i
        break

print(ans)
```

## 4. 
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class atcoder_ABC042_D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int w = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();

        long[][] dp = new long[h + 1][w + 1];
        dp[a][b] = 1;
        for (int i = a; i <= h; i++) {
            for (int j = b; j <= w; j++) {
                if (i == a && j == b) {
                    continue;
                }
                dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % 1000000007;
            }
        }
        System.out.println(dp[h][w]);
    }
}
```

python code:
```python
h, w, a, b = map(int, input().split())

dp = [[0 for i in range(w + 1)] for j in range(h + 1)]
dp[a][b] = 1
for i in range(a, h + 1):
    for j in range(b, w + 1):
        if i == a and j == b:
            continue
        dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % 1000000007

print(dp[h][w])
```

## 5. 
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class atcoder_ABC042_E {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        int[] c = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
            c[i] = scan.nextInt();
        }

        int[][] dp = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            dp[a[i]][b[i]] = c[i];
            dp[b[i]][a[i]] = c[i];
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (dp[i][j] < dp[i][k] + dp[k][j]) {
                        dp[i][j] = dp[i][k] + dp[k][j];
                    }
                }
            }
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (dp[i][j] > ans) {
                    ans = dp[i][j];
                }
            }
        }
        System.out.println(ans);
    }
}
```

python code:
```python
n, m = map(int, input().split())

a = []
b = []
c = []
for i in range(m):
    a_i, b_i, c_i = map(int, input().split())
    a.append(a_i)
    b.append(b_i)
    c.append(c_i)

dp = [[0 for i in range(n + 1)] for j in range(n + 1)]
for i in range(m):
    dp[a[i]][b[i]] = c[i]
    dp[b[i]][a[i]] = c[i]

