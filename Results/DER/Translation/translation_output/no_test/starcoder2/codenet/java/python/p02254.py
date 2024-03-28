
```
import heapq

class Node:
    def __init__(self, c):
        self.c = c
        self.parent = None

    def depth(self):
        if self.parent is None:
            return 0
        return self.parent.depth() + 1

class Pair:
    def __init__(self, node, frequency):
        self.node = node
        self.frequency = frequency

    def __lt__(self, other):
        return self.frequency < other.frequency

s = input()
frequency = [0] * 26
for i in range(len(s)):
    frequency[ord(s[i]) - ord('a')] += 1

que = []
map = {}
for i in range(26):
    tmp = frequency[i]
    if tmp > 0:
        c = chr(ord('a') + i)
        node = Node(c)
        heapq.heappush(que, Pair(node, tmp))
        map[c] = node

while len(que) > 1:
    p1 = heapq.heappop(que)
    p2 = heapq.heappop(que)
    n1 = p1.node
    n2 = p2.node

    parent = Node('.')
    n1.parent = parent
    n2.parent = parent
    newFreq = p1.frequency + p2.frequency
    heapq.heappush(que, Pair(parent, newFreq))

res = 0
for i in range(26):
    tmp = frequency[i]
    if tmp > 0:
        c = chr(ord('a') + i)
        res += tmp * (map[c].depth())

print(res if len(map) > 1 else len(s))
```
 1000000007;

int main() {
    int n;
    cin >> n;
    vector<int> a(n);
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }

    vector<int> dp(n, 1);
    for (int i = 1; i < n; i++) {
        for (int j = 0; j < i; j++) {
            if (a[i] > a[j]) {
                dp[i] = max(dp[i], dp[j] + 1);
            }
        }
    }

    int ans = 0;
    for (int i = 0; i < n; i++) {
        ans = max(ans, dp[i]);
    }
    cout << ans << endl;

    return 0;
}
```

python code:
```
n = int(input())
a = list(map(int, input().split()))

dp = [1] * n
for i in range(1, n):
    for j in range(i):
        if a[i] > a[j]:
            dp[i] = max(dp[i], dp[j] + 1)

ans = 0
for i in range(n):
    ans = max(ans, dp[i])
print(ans)
```
/p02254.md
# p02254

## 题目

给定一个长度为n的序列，求这个序列的最长上升子序列的长度。

## 输入

第一行一个整数n，表示序列的长度。

第二行n个整数，表示给定的序列。

## 输出

输出一个整数，表示最长上升子序列的长度。

## 样例输入

```
5
1 2 3 4 5
```

## 样例输出

```
5
```

## 数据范围

对于100%的数据，1≤n≤100000，序列中的每个数的绝对值不超过1000000000。

## 题解

### 题目分析

最长上升子序列是指在一个序列中，如果一个子序列中的元素是按照递增的顺序排列的，那么这个子序列就是一个上升子序列。

### 算法分析

我们可以用动态规划来解决这个问题。

我们用dp[i]表示以a[i]结尾的最长上升子序列的长度。

那么我们可以得到状态转移方程：

dp[i] = max(dp[j] + 1) (0 ≤ j < i, a[i] > a[j])

我们可以用一个循环来计算dp[i]，然后我们再遍历一遍dp数组，找出其中最大的元素，就是答案。

### 代码实现

java code:
```
import java.util.Scanner;

public class p02254 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, dp[i]);
        }
        System.out.println(ans);

        sc.close();
    }
}
```

c++ code:
```
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

const int MOD = 1000000000;

int main() {
    int n;
    cin >> n;
    vector<int> a(n);
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }

    vector<int> dp(n,
