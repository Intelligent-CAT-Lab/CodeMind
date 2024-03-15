
```java
import java.util.*;
import java.io.*;

public class DSumOfDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * (n / i) * (n / i + 1) / 2;
        }
        System.out.println(sum);
    }
}
```

## E. Yet Another Division Into Teams

### 题意

给定一个数组，将其分成若干组，每组的和不超过 $k$，求最多能分成多少组。

### 题解

贪心，每次选取和最小的数，将其加入到和最小的组中。

### 代码

```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, k;
        cin >> n >> k;
        vector<int> a(n);
        for (int i = 0; i < n; i++) {
            cin >> a[i];
        }
        sort(a.begin(), a.end());
        int ans = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (sum + a[i] <= k) {
                sum += a[i];
            } else {
                ans++;
                sum = a[i];
            }
        }
        if (sum > 0) {
            ans++;
        }
        cout << ans << endl;
    }
    return 0;
}
```

## F. Yet Another Meme Problem

### 题意

给定一个字符串，求其最长的回文子串。

### 题解

Manacher 算法。

### 代码

```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        string s;
        cin >> s;
        int n = s.size();
        string t = "$#";
        for (int i = 0; i < n; i++) {
            t += s[i];
            t += '#';
        }
        n = t.size();
        vector<int> p(n, 0);
        int mx = 0, id = 0;
        int ans = 0;
        for (int i = 1; i < n; i++) {
            p[i] = mx > i ? min(p[2 * id - i], mx - i) : 1;
            while (i - p[i] >= 0 && i + p[i] < n && t[i - p[i]] == t[i + p[i]]) {
                p[i]++;
            }
            if (i + p[i] > mx) {
                mx = i + p[i];
                id = i;
            }
            ans = max(ans, p[i]);
        }
        cout << ans - 1 << endl;
    }
    return 0;
}
```

## G. Yet Another Array Restoration

### 题意

给定一个数组，其中有 $k$ 个数是缺失的，求这 $k$ 个数。

### 题解

先求出数组的和，然后用总和减去数组中已有的数，得到的就是缺失的数。

### 代码

```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, k;
        cin >> n >> k;
        long long sum = 0;
        for (int i = 0; i < n - k; i++) {
            int x;
            cin >> x;
            sum += x;
        }
        long long ans = (n * (n + 1) / 2 - sum) / k;
        for (int i = 0; i < k; i++) {
            cout << ans + i << " ";
        }
        cout << endl;
    }
    return 0;
}
```

## H. Yet Another Palindrome Problem

### 题意

给定一个字符串，求其最长的回文子串。

### 题解

Manacher 算法。

### 代码

```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        string s;
        cin >> s;
        int n = s.size();
        string t = "$#";
        for (int i = 0; i < n; i++) {
            t += s[i];
            t += '#';
        }
        n = t.size();
        vector<int> p(n, 0);
        int mx = 0, id = 0;
        int ans = 0;
        for (int i = 1; i < n; i++) {
            p[i] = mx > i ? min(p[2 * id - i], mx - i) : 1;
            while (i - p[i] >= 0 && i + p[i] < n && t[i - p[i]] == t[i + p[i]]) {
                p[i]++;
            }
            if (i + p[i] > mx) {
                mx = i + p[i];
                id = i;
            }
            ans = max(ans, p[i]);
        }
        cout << ans - 1 << endl;
    }
    return 0;
}
```

## I. Yet Another Problem On a Subsequence

### 题意

给定一个数组，求其最长的子序列，使得这个子序列的和是 $k$ 的倍数。

### 题解

动态规划。

设 $f[i][j]$ 表示以 $i$ 结尾的和为 $j$ 的子序列的最大长度，则有：

$$
f[i][j] = \max(f[i - 1][j], f[i - 1][j - a_i] + 1)
$$

### 代码

```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, k;
        cin >> n >> k;
        vector<int> a(n);
        for (int
