
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int K = 0;
        for (int i = 1; i < 1000; i++) {
            if (i * (i - 1) / 2 == N) {
                K = i;
                break;
            }
        }

        if (K == 0) {
            System.out.println("No");
            System.exit(0);
        }

        List<List<Integer>> S = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            S.add(new ArrayList<>());
        }

        int i = 1;
        int k = 0;
        int cnt = 0;
        while (i <= N) {
            S.get(k).add(i);
            i++;
            cnt++;
            if (cnt == K - (k + 1)) {
                k++;
                cnt = 0;
            }
        }

        int j = 1;
        k = 1;
        cnt = 0;
        int col = 0;
        while (j <= N) {
            S.get(k).add(j);
            j++;
            k++;
            cnt++;
            if (cnt == K - (col + 1)) {
                col++;
                k = col + 1;
                cnt = 0;
            }
        }

        System.out.println("Yes");
        System.out.println(K);

        for (List<Integer> s : S) {
            System.out.print(K - 1);
            for (int x : s) {
                System.out.print(" " + x);
            }
            System.out.println();
        }
    }
}
```

## 解説

## 参考

[解説](https://atcoder.jp/contests/abc179/editorial/110)

## 解説

## 参考

[解説](https://atcoder.jp/contests/abc179/editorial/110)

## 類題

[ABC179 E - Sequence Matching](https://atcoder.jp/contests/abc179/tasks/abc179_e)
/ABC/ABC179/README.md
# [ABC179](https://atcoder.jp/contests/abc179)

## [A - Plural Form](https://atcoder.jp/contests/abc179/tasks/abc179_a)

```python
S = input()

if S[-1] == "s":
    print(S + "es")
else:
    print(S + "s")
```

## [B - Go to Jail](https://atcoder.jp/contests/abc179/tasks/abc179_b)

```python
N = int(input())

cnt = 0
for _ in range(N):
    D1, D2 = map(int, input().split())
    if D1 == D2:
        cnt += 1
    else:
        cnt = 0
    if cnt == 3:
        print("Yes")
        exit()

print("No")
```

## [C - A x B + C](https://atcoder.jp/contests/abc179/tasks/abc179_c)

```python
N = int(input())

ans = 0
for A in range(1, N):
    B = N // A
    ans += B

print(ans)
```

## [D - Leaping Tak](https://atcoder.jp/contests/abc179/tasks/abc179_d)

```python
N, K = map(int, input().split())
LR = [list(map(int, input().split())) for _ in range(K)]

dp = [0] * (N + 1)
dp[1] = 1

for i in range(1, N):
    for l, r in LR:
        if i + l <= N:
            dp[i + l] += dp[i]
            dp[i + l] %= 998244353

print(dp[N])
```

## [E - Sequence Matching](https://atcoder.jp/contests/abc179/tasks/abc179_e)

```python
N, X, M = map(int, input().split())

a = [X]

for i in range(1, N):
    a.append((a[i - 1] ** 2) % M)

ans = sum(a)

if N <= M:
    print(ans)
    exit()

# 周期性を見つける
for i in range(M):
    if a[i] == a[i + M]:
        cycle = a[i:i + M]
        break

# 周期の長さ
cycle_len = len(cycle)

# 周期の先頭のインデックス
cycle_start = i

# 周期の先頭のインデックスからのインデックス
cycle_index = N - cycle_start

# 周期の先頭のインデックスからのインデックスが周期の長さの倍数のとき
if cycle_index % cycle_len == 0:
    print(ans)
    exit()

# 周期の先頭のインデックスからのインデックスが周期の長さの倍数でないとき
ans -= sum(cycle)
ans += sum(cycle[:cycle_index % cycle_len])

print(ans)
```

## [F - Staircase Sequences](https://atcoder.jp/contests/abc179/tasks/abc179_f)

```python
H, W, A, B = map(int, input().split())

MOD = 998244353

dp = [[0] * (W + 1) for _ in range(H + 1)]
dp[A][B] = 1

for i in range(A, H):
    for j in range(B, W):
        dp[i + 1][j] += dp[i][j]
        dp[i + 1][j] %= MOD
        dp[i][j + 1] += dp[i][j]
        dp[i][j + 1] %= MOD

print(dp[H][W])
```

## [G - Colorful Sequences](https://atcoder.jp/contests/abc179/tasks/abc179_g)

```python
N, M = map(int, input().split())

ans = 0

for i in range(1, N + 1):
    if i * (i - 1) // 2 == N:
        ans = i
        break

if ans == 0:
    print("No")
    exit()

S = [[] for _ in range(ans)]

i = 1
k = 0
cnt = 0
while i <= N:
    S[k].append(i)
    i += 1
    cnt += 1
    if cnt == ans - (k + 1):
        k += 1
        cnt = 0

j = 1
k = 
