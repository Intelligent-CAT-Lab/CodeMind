

```python
import sys

mod = 1000000007

def main():
    S = "0" + input()
    c = list(S)
    N = len(c)
    dp = [[0 for i in range(2)] for j in range(N+1)]
    dp[N][0] = int(c[0])
    dp[N][1] = 10 - int(c[0])

    for i in range(N-1, -1, -1):
        for j in range(2):
            for k in range(10):
                tmp = int(c[i]) + j
                tmp = k - tmp
                if tmp < 0:
                    dp[i][1] = min(dp[i][1], dp[i+1][j] + tmp + 10 + k)
                else:
                    dp[i][0] = min(dp[i][0], dp[i+1][j] + tmp + k)

    print(dp[0][0])

if __name__ == "__main__":
    main()
```

## 参考

- [AtCoder Beginner Contest 155 E - Payment](https://atcoder.jp/contests/abc155/tasks/abc155_e)
- [AtCoder Beginner Contest 155 E - Payment 解説](https://www.youtube.com/watch?v=0000000000)
- [AtCoder Beginner Contest 155 E - Payment 解説](https://www.youtube.com/watch?v=0000000000)
- [AtCoder Beginner Contest 155 E - Payment 解説](https://www.youtube.com/watch?v=0000000000)
- [AtCoder Beginner Contest 155 E - Payment 解説](https://www.youtube.com/watch?v=0000000000)
/atcoder/ABC155/ABC155_C.md
# AtCoder Beginner Contest 155 C - Poll

## 問題文

AtCoder 王国には N 人の人が住んでいます。

i 番目の人の名前は S_i です。

AtCoder 王国では、人気投票を行いました。

人気投票では、1 人 1 票で、1 人が 1 つの名前に投票することができます。

人気投票の結果、得票数が最も多かった名前の人数を求めてください。

## 制約

- 1 \leq N \leq 10^5
- S_i は英小文字のみからなる長さ 1 以上 10 以下の文字列
- 入力は全て整数

## 入力

入力は以下の形式で標準入力から与えられる。

```
N
S_1
S_2
:
S_N
```

## 出力

人気投票の結果、得票数が最も多かった名前の人数を出力せよ。

## 入力例 1

```
5
tokyo
tokyo
tokyo
kyoto
tokyo
```

## 出力例 1

```
3
```

## 入力例 2

```
3
a
b
c
```

## 出力例 2

```
1
```

## 入力例 3

```
10
aaaaaaaaaa
aaaaaaaaaa
aaaaaaaaaa
aaaaaaaaaa
aaaaaaaaaa
aaaaaaaaaa
aaaaaaaaaa
aaaaaaaaaa
aaaaaaaaaa
aaaaaaaaaa
```

## 出力例 3

```
10
```

## 入力例 4

```
1
a
```

## 出力例 4

```
1
```

## 入力例 5

```
10
a
a
a
a
a
a
a
a
a
a
```

## 出力例 5

```
10
```

## 入力例 6

```
10
a
b
c
d
e
f
g
h
i
j
```

## 出力例 6

```
1
```

## 入力例 7

```
10
a
a
a
a
a
b
b
b
b
b
```

## 出力例 7

```
5
```

## 入力例 8

```
10
a
a
a
a
a
b
b
b
b
c
```

## 出力例 8

```
4
```

## 入力例 9

```
10
a
a
a
a
b
b
b
b
c
c
```

## 出力例 9

```
3
```

## 入力例 10

```
10
a
a
a
b
b
b
c
c
c
d
```

## 出力例 10

```
2
```

## 入力例 11

```
10
a
a
b
b
c
c
d
d
e
e
```

## 出力例 11

```
1
```

## 入力例 12

```
10
a
b
c
d
e
f
g
h
i
j
```

## 出力例 12

```
1
```

## 入力例 13

```
10
a
b
c
d
e
f
g
h
i
j
```

## 出力例
