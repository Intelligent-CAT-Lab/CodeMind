
```
import sys

class ModInt:
    MOD = 1000000007
    def __init__(self, l):
        self.x = l % ModInt.MOD

    def add(self, mi):
        return ModInt(self.x + mi.x)

    def mul(self, i):
        return ModInt(self.x * i)

    def mul(self, mi):
        return ModInt(self.x * mi.x)

    def pow(self, p):
        res = ModInt(1)
        tmp = self
        while p > 0:
            if (p & 1) == 1:
                res = res.mul(tmp)
            tmp = tmp.mul(tmp)
            p /= 2
        return res

    def inv(self):
        return self.pow(ModInt.MOD - 2)

    def __str__(self):
        return str(int(self.x))

class ModComb:
    def __init__(self, n):
        self.size = n
        self.fac = [None] * (n + 1)
        self.inv = [None] * (n + 1)

    def makeFac(self):
        for i in range(self.size + 1):
            if i == 0:
                self.fac[i] = ModInt(1)
            else:
                self.fac[i] = self.fac[i - 1].mul(i)
            self.inv[i] = self.fac[i].inv()

    def combFac(self, n, k):
        if n < k:
            return ModInt(0)
        return self.fac[n].mul(self.inv[k]).mul(self.inv[n - k])

def main():
    h, w, a, b = map(int, sys.stdin.readline().split())
    mc = ModComb(200005)
    mc.makeFac()
    res = ModInt(0)
    for i in range(h - a):
        res = res.add(mc.combFac(b - 1 + i, i).mul(mc.combFac(w - b - 1 + h - 1 - i, h - 1 - i)))
    print(res)

if __name__ == '__main__':
    main()
```

## 04047 - 2018-like Number

### 問題文

2018年のように、各桁の和が2018の倍数であるような整数を2018-like numberと呼ぶことにします。

整数Nが与えられるので、N以下の2018-like numberの個数を求めてください。

### 制約

- 1≤N≤10^18

### 入力

入力は以下の形式で標準入力から与えられる。

```
N
```

### 出力

N以下の2018-like numberの個数を出力せよ。

### 入力例1

```
100
```

### 出力例1

```
1
```

### 入力例2

```
1000000000000000000
```

### 出力例2

```
100000000000000000
```

### 入力例3

```
100000000000000000
```

### 出力例3

```
10000000000000000
```

### 入力例4

```
10000000000000000
```

### 出力例4

```
1000000000000000
```

### 入力例5

```
1000000000000000
```

### 出力例5

```
100000000000000
```

### 入力例6

```
100000000000000
```

### 出力例6

```
10000000000000
```

### 入力例7

```
10000000000000
```

### 出力例7

```
1000000000000
```

### 入力例8

```
1000000000000
```

### 出力例8

```
100000000000
```

### 入力例9

```
100000000000
```

### 出力例9

```
10000000000
```

### 入力例10

```
10000000000
```

### 出力例10

```
1000000000
```

### 
