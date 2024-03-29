
```
import sys

def solve():
    K = int(input())
    N = 50
    list = [K // N + i for i in range(N)]
    for i in range(K % N):
        list[i % N] += N + 1
        for j in range(N):
            list[j] -= 1
    print(N)
    print(' '.join(map(str, list)))

solve()
```

## 03647

### 問題文

$N$ 個の整数 $a_1, a_2, \dots, a_N$ が与えられます。

$a_i$ を $b_i$ に書き換える操作を以下のように $M$ 回行います。

1. $a_i$ を $b_i$ に書き換える
2. $a_i$ を $b_i$ に書き換える
3. $a_i$ を $b_i$ に書き換える
4. $a_i$ を $b_i$ に書き換える
5. $a_i$ を $b_i$ に書き換える
6. $a_i$ を $b_i$ に書き換える
7. $a_i$ を $b_i$ に書き換える
8. $a_i$ を $b_i$ に書き換える
9. $a_i$ を $b_i$ に書き換える
10. $a_i$ を $b_i$ に書き換える

$a_i$ を $b_i$ に書き換える操作を $M$ 回行った後の $a_i$ の総和を求めてください。

### 制約

- $1 \leq N \leq 10^5$
- $1 \leq M \leq 10^5$
- $1 \leq a_i \leq 10^9$
- $1 \leq b_i \leq 10^9$
- 入力はすべて整数

### 入力

```
N M
a_1 a_2 ... a_N
b_1 b_2 ... b_N
```

### 出力

```
a_1 + a_2 + ... + a_N
```

### 入力例1

```
3 1
1 2 3
4 5 6
```

### 出力例1

```
15
```

### 入力例2

```
3 2
1 2 3
4 5 6
```

### 出力例2

```
21
```

### 入力例3

```
3 3
1 2 3
4 5 6
```

### 出力例3

```
27
```

### 入力例4

```
3 4
1 2 3
4 5 6
```

### 出力例4

```
33
```

### 入力例5

```
3 5
1 2 3
4 5 6
```

### 出力例5

```
39
```

### 入力例6

```
3 6
1 2 3
4 5 6
```

### 出力例6

```
45
```

### 入力例7

```
3 7
1 2 3
4 5 6
```

### 出力例7

```
51
```

### 入力例8

```
3 8
1 2 3
4 5 6
```

### 出力例8

```
57
```

### 入力例9

```
3 9
1 2 3
4 5 6
```

### 出力例9

```
63
```

### 入力例10

```
3 10
1 2 3
4 5 6
```

### 出力例10

```
69
```

### 入力
