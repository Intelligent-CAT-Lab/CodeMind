
```python
n = int(input())
ans = 0
for i in range(1, n + 1):
    ans += i * (n // i) * ((n // i) + 1) // 2
print(ans)
```

## 2. 1000000007で割ったあまり

### 問題文

正の整数 $N$ が与えられます。

$1$ 以上 $N$ 以下の整数のうち、$1000000007$ で割ったあまりが $0$ になるようなものの個数を求めてください。

### 制約

- $1 \leq N \leq 10^{18}$

### 入力

入力は以下の形式で標準入力から与えられる。

```
N
```

### 出力

$1$ 以上 $N$ 以下の整数のうち、$1000000007$ で割ったあまりが $0$ になるようなものの個数を出力せよ。

### 入力例 1

```
10
```

### 出力例 1

```
3
```

$1000000007$ で割ったあまりが $0$ になるのは $1000000007$ の倍数である $10$ のみである。

### 入力例 2

```
1000000007
```

### 出力例 2

```
1
```

$1000000007$ で割ったあまりが $0$ になるのは $1000000007$ のみである。

### 入力例 3

```
1000000000000000000
```

### 出力例 3

```
666666667
```

### 入力例 4

```
1000000000000000000
```

### 出力例 4

```
666666667
```

### 入力例 5

```
1000000000000000000
```

### 出力例 5

```
666666667
```

### 入力例 6

```
1000000000000000000
```

### 出力例 6

```
666666667
```

### 入力例 7

```
1000000000000000000
```

### 出力例 7

```
666666667
```

### 入力例 8

```
1000000000000000000
```

### 出力例 8

```
666666667
```

### 入力例 9

```
1000000000000000000
```

### 出力例 9

```
666666667
```

### 入力例 10

```
1000000000000000000
```

### 出力例 10

```
666666667
```

### 入力例 11

```
1000000000000000000
```

### 出力例 11

```
666666667
```

### 入力例 12

```
1000000000000000000
```

### 出力例 12

```
666666667
```

### 入力例 13

```
1000000000000000000
```

### 出力例 13

```
666666667
```

### 入力例 14

```
1000000000000000000
```

### 出力例 14

```
666666667
```

### 入力例 15

```
1000000000000000000
```

### 出力例 15

```
666666667
```

### 入力例 16

```
1000000000000000000
```

### 出力例 16

```
666666667
```

### 入力例 17

```
1000000000000000000
```

### 出力例 17

```
666666667
```

### 入力例 18

```
1000000000000000000
```

### 出力例 18

```
666666667
```

### 入力例 19

```
1000000000000000000
```

### 出力例 19

```
666666667
```

### 入力例 20

```
1000000000000000000
```

### 出力例 20

```
666666667
```

### 入力例 21

```
1000000000000000000
```

### 出力例 21

```
666666667
```

### 入力例 22

```
1000000000000000000
```

### 出力例 22

```
666666667
```

### 入力例 23

```
1000000000000000000
```

### 出力例 23

```
666666667
```

### 入力例 24

```
1000000000000000000
```

### 出力例 24

```
666666667
```

### 入力例 25

```
1000000000000000000
```

### 出力例 25

```
666666667
```

### 入力例 26

```
1000000000000000000
```

### 出力例 26

```
666666667
```

### 入力例 27

```
1000000000000000000
```

### 出力例 27

```
666666667
```

### 入力例 28

```
1000000000
