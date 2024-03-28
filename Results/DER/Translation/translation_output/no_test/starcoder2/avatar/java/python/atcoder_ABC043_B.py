
```
s = input()
while '0B' in s or '1B' in s:
    s = s.replace('0B', '')
    s = s.replace('1B', '')
s = s.replace(' B ', '')
print(s)
```

## 2.

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_ABC043_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int ans = Integer.MAX_VALUE;
        for (int i = -100; i <= 100; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += (a[j] - i) * (a[j] - i);
            }
            ans = Math.min(ans, sum);
        }
        
        System.out.println(ans);
    }
}
```

python code:
```
n = int(input())
a = list(map(int, input().split()))
ans = 10**9
for i in range(-100, 101):
    sum = 0
    for j in range(n):
        sum += (a[j] - i) ** 2
    ans = min(ans, sum)
print(ans)
```

## 3.

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_ABC043_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int ans = -1;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == s.charAt(i + 2)) {
                ans = i + 1;
                break;
            }
        }
        
        if (ans == -1) {
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    ans = i + 1;
                    break;
                }
            }
        }
        
        if (ans == -1) {
            System.out.println(-1);
        } else {
            System.out.println(ans + " " + (ans + 1));
        }
    }
}
```

python code:
```
s = input()
ans = -1
for i in range(len(s) - 2):
    if s[i] == s[i + 1] and s[i] == s[i + 2]:
        ans = i + 1
        break
if ans == -1:
    for i in range(len(s) - 1):
        if s[i] == s[i + 1]:
            ans = i + 1
            break
if ans == -1:
    print(-1)
else:
    print(ans, ans + 1)
```
 1000000007

int main() {
    int n;
    cin >> n;
    vector<int> a(n);
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }

    vector<int> dp(n + 1, 0);
    dp[0] = 1;
    for (int i = 0; i < n; i++) {
        dp[i + 1] += dp[i];
        dp[i + 1] %= MOD;
        if (i + a[i] < n) {
            dp[i + a[i] + 1] += dp[i];
            dp[i + a[i] + 1] %= MOD;
        }
    }

    cout << dp[n] << endl;
}
```

python code:
```
n = int(input())
a = list(map(int, input().split()))
dp = [0] * (n + 1)
dp[0] = 1
for i in range(n):
    dp[i + 1] += dp[i]
    dp[i + 1] %= 1000000007
    if i + a[i] < n:
        dp[i + a[i] + 1] += dp[i]
        dp[i + a[i] + 1] %= 1000000007
print(dp[n])
```

## 3.

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_ABC044_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        
        long ans = 0;
        for (long i = 1; i * i <= x; i++) {
            if (x % i == 0) {
                if (i + x / i == x - 1) {
                    ans = i;
                    break;
                }
            }
        }
        
        System.out.println(ans);
    }
}
```

python code:
```
x = int(input())
ans = 0
for i in range(1, int(x ** 0.5) + 1):
    if x % i == 0:
        if i + x // i == x - 1:
            ans = i
            break
print(ans)
```
/atcoder/ABC044/README.md
# AtCoder Beginner Contest 044

## 1.

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_ABC044_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int ans = 0;
        if (n <= k) {
            ans = n * x;
        } else {
            ans = k * x + (n - k) * y;
        }
        
        System.out.println(ans);
    }
}
```

python code:
```
n, k, x, y = map(int, input().split())
ans = 0
if n <= k:
    ans = n * x
else:
    ans = k * x + (n - k) * y
print(ans)
```

## 2.

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_ABC044_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        
        boolean ans = true;
        for (char c = 'a'; c <= 'z'; c++) {
            int cnt = 0;
            for (int i = 0; i < w.length(); i++) {
                if (w.charAt(i) == c) {
                    cnt++;
                }
            }
            if (cnt % 2 == 1) {
                ans = false;
                break;
            }
        }
        
        System.out.println(ans ? "Yes" : "No");
    }
}
```

python code:
```
w = input()
ans = True
for c in range(ord('a'), ord('z') + 1):
    cnt = 0
    for i in range(len(w)):
        if w[i] == chr(c):
            cnt += 1
    if cnt % 2 == 1:
        ans = False
        break
print('Yes' if ans else 'No')
```
