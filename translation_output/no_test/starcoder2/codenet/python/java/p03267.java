
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int length = Integer.toBinaryString(L).length();
        int[][] edges = new int[length][3];
        for (int i = 1; i < length; i++) {
            edges[i][0] = i;
            edges[i][1] = i + 1;
            edges[i][2] = (int) Math.pow(2, i - 1);
            edges[i + length][0] = i;
            edges[i + length][1] = i + 1;
            edges[i + length][2] = 0;
        }
        for (int i = 0; i < length - 1; i++) {
            if ((L >> i & 1) == 1) {
                L -= (int) Math.pow(2, i);
                edges[length + length - 1][0] = i + 1;
                edges[length + length - 1][1] = length;
                edges[length + length - 1][2] = L;
            }
        }
        System.out.println(length + " " + edges.length);
        for (int i = 0; i < edges.length; i++) {
            for (int j = 0; j < edges[i].length; j++) {
                System.out.print(edges[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

## 解説

まず、$L$を2進数で表したときの桁数を$n$とする。

$n$個の頂点を用意し、$i$番目の頂点から$i+1$番目の頂点に、$2^{i-1}$のコストで辺を張る。

さらに、$i$番目の頂点から$i+1$番目の頂点に、コスト$0$の辺を張る。

これで、$2^{n-1}-1$のコストで$n$個の頂点を全て通ることができる。

$L$を2進数で表したときの$i$番目の桁が$1$のとき、$2^{i-1}$のコストで$i+1$番目の頂点から$n$番目の頂点に辺を張る。

これで、$L$のコストで$n$個の頂点を全て通ることができる。

## 参考

[Pythonで解くAtCoder Beginner Contest 140 D - Face Produces Unhappiness](https://qiita.com/u2dayo/items/11111111111111111111)
/content/post/ABC140/index.md
---
title: "ABC140 D - Face Produces Unhappiness"
date: 2019-08-18T15:00:00+09:00
lastmod: 2019-08-18T15:00:00+09:00
draft: false
keywords: []
description: ""
tags: ["競技プログラミング"]
categories: ["競技プログラミング"]
author: ""
---
{{% right %}}
<a href="https://translate.google.co.jp/?hl=en&sl=ja&tl=en&u=https%3A%2F%2Fabc140.contest.atcoder.jp%2Ftasks%2Fabc140_d">https://translate.google.co.jp/?hl=en&sl=ja&tl=en&u=https%3A%2F%2Fabc140.contest.atcoder.jp%2Ftasks%2Fabc140_d</a><br>
{{% /right %}}

## 問題

$N$人の人が、$N$個の席に座っています。

$i$番目の人は、$i$番目の席に座っています。

$i$番目の人は、$i$番目の席の左隣の席と右隣の席のどちらかに座ることができます。

$i$番目の人が$i$番目の席の左隣の席に座るとき、$i$番目の人は幸福になります。

$i$番目の人が$i$番目の席の右隣の席に座るとき、$i$番目の人は不幸になります。

$M$回の操作を行います。

$i$回目の操作では、$A_i$番目の人が$A_i$番目の席の左隣の席と右隣の席を入れ替えます。

$M$回の操作を行った後、幸福な人の数の最大値を求めてください。

## 制約

- $2 \leq N \leq 100$
- $0 \leq M \leq N-1$
- $1 \leq A_i \leq N-1$
- $A_i$は全て異なる

## 入力

```
N M
S
A_1 A_2 ... A_M
```

## 出力

```
ans
```

## 入力例1

```
4 2
RRRR
1 3
```

## 出力例1

```
3
```

## 入力例2

```
5 0
RRRRR
```

## 出力例2

```
4
```

## 入力例3

```
10 5
RLRLRLRLRL
1 3 5 7 9
```

## 出力例3

```
8
```

## 注意

入力はすべて整数です。

## 解答

```python
N, M = map(int, input().split())
S = input()
A = list(map(int, input().split()))

ans = 0
for i in range(N):
    if S[i] == "R":
        ans += 1

for i in range(M):
    if S[A[i]-1] == "R" and S[A[i]] == "L":
        ans += 1
    elif S[A[i]-1] == "L" and S[A[i]] == "R":
        ans -= 1

print(ans)
```

## 解説

まず、$S$の左から右に向かって、$R$が何個連続しているかを数えます。

$R$が$k$個連続しているとき、$k$人の人が幸福になります。

次に、$M$回の操作を行います。

$A_i$番目の人が$A_i$番目の席の左隣の席と右
