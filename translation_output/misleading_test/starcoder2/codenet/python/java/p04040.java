
```java
import java.util.*;

class COMB_MOD {
    // http://drken1215.hatenablog.com/entry/2018/06/08/210000
    int[] fac;
    int[] finv;
    int[] inv;
    int max;
    int mod;

    public COMB_MOD(int max_n, int mod) {
        this.fac = new int[max_n];
        this.finv = new int[max_n];
        this.inv = new int[max_n];
        this.fac[0] = this.fac[1] = 1;
        this.finv[0] = this.finv[1] = 1;
        this.inv[1] = 1;
        this.max = max_n;
        this.mod = mod;
        this._maesyori();
    }

    public void _maesyori() {
        for (int i = 2; i < this.max; i++) {
            this.fac[i] = this.fac[i - 1] * i % this.mod;
            this.inv[i] = this.mod - this.inv[this.mod % i] * (this.mod / i) % this.mod;
            this.finv[i] = this.finv[i - 1] * this.inv[i] % this.mod;
        }
    }

    public int comb(int n, int k) {
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return this.fac[n] * (this.finv[k] * this.finv[n - k] % this.mod) % this.mod;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;
        COMB_MOD C = new COMB_MOD(2 * 100000, mod);
        int ans = 0;
        for (int i = 0; i < h - a; i++) {
            ans = (ans + C.comb(b - 1 + i, i) * C.comb(h - 1 - i + w - 1 - b, h - 1 - i)) % mod;
        }
        System.out.println(ans);
    }
}
```

## 1.2.2. 1000000007で割ったあまり

### 問題文

1000000007で割ったあまりを求めよ。

### 制約

- 1 <= N <= 1000000000

### 入力

N

### 出力

1000000007で割ったあまり

### 入力例1

```
1000000000
```

### 出力例1

```
1
```

### 入力例2

```
1
```

### 出力例2

```
1
```

### 入力例3

```
1000000007
```

### 出力例3

```
0
```

### 入力例4

```
1000000006
```

### 出力例4

```
1
```

### 入力例5

```
1000000005
```

### 出力例5

```
2
```

### 入力例6

```
1000000004
```

### 出力例6

```
3
```

### 入力例7

```
1000000003
```

### 出力例7

```
4
```

### 入力例8

```
1000000002
```

### 出力例8

```
5
```

### 入力例9

```
1000000001
```

### 出力例9

```
6
```

### 入力例10

```
1000000000
```

### 出力例10

```
1
```

### 入力例11

```
999999999
```

### 出力例11

```
2
```

### 入力例12

```
999999998
```

### 出力例12

```
3
```

### 入力例13

```
999999997
```

### 出力例13

```
4
```

### 入力例14

```
999999996
```

### 出力例14

```
5
```

### 入力例15

```
999999995
```

### 出力例15

```
6
```

### 入力例16

```
999999994
```

### 出力例16

```
7
```

### 入力例17

```
999999993
```

### 出力例17

```
8
```

### 入力例18

```
999999992
```

### 出力例18

```
9
```

### 入力例19

```
999999991
```

### 出力例19

```
10
```

### 入力例20

```
999999990
```

### 出力例20

```
11
```

### 入力例21

```
999999989
```

### 出力例21

```
12
```

### 入力例22

```
999999988
```

### 出力例22


