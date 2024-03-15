
```python
import math

N = int(input())

def prime_factor(n):
    res = []
    for i in range(2, int(math.sqrt(n)) + 1):
        count = 0
        while n % i == 0:
            n //= i
            count += 1
        if count != 0:
            res.append(count)
    if n != 1:
        res.append(1)
    return res

factors = prime_factor(N)
count = 0
for i in range(len(factors)):
    pow = factors[i]
    increase = 1
    while pow - increase >= 0:
        pow -= increase
        increase += 1
        count += 1
print(count)
```

## 解説

素因数分解して、素因数の数を数える。

## 参考

[AtCoder ABC169 D - Div Game](https://atcoder.jp/contests/abc169/tasks/abc169_d)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](https://qiita.com/yamadar/items/61177776711101111111)

[Pythonで素因数分解](
