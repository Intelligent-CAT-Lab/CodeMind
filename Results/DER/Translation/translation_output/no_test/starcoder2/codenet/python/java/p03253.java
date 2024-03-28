
```java
import java.util.*;

public class Main {
    static final int MAX = 2*100000+1;
    static final int MOD = 1000000007;
    static long[] fact = new long[MAX];
    static long[] inv = new long[MAX];
    static long[] invfact = new long[MAX];

    static void comb_build(int n) {
        fact[0] = inv[0] = invfact[0] = 1;
        fact[1] = inv[1] = invfact[1] = 1;
        for (int i = 2; i < n; i++) {
            fact[i] = fact[i-1]*i%MOD;
            inv[i] = inv[MOD%i]*(MOD-MOD/i)%MOD;
            invfact[i] = invfact[i-1]*inv[i]%MOD;
        }
    }

    static long nCk(int n, int k) {
        if (n < k || n < 0 || k < 0) {
            return 0;
        }
        return (((fact[n]*invfact[k])%MOD)*invfact[n-k])%MOD;
    }

    static Map<Integer, Integer> prime_factor(int n) {
        Map<Integer, Integer> ret = new HashMap<>();
        for (int i = 2; i <= Math.sqrt(n)+10; i++) {
            while (n%i == 0) {
                ret.put(i, ret.getOrDefault(i, 0)+1);
                n /= i;
            }
        }
        if (n != 1) {
            ret.put(n, 1);
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        comb_build(MAX);
        long ans = 1;
        for (Map.Entry<Integer, Integer> e : prime_factor(m).entrySet()) {
            ans *= nCk(e.getValue()+n-1, e.getValue())%MOD;
        }
        System.out.println(ans%MOD);
    }
}
```

## 10. 1000000007で割ったあまり

### 問題文

1000000007で割ったあまりを求めよ。

### 制約

- 1 <= N <= 1000000000

### 入力

```
N
```

### 出力

```
1000000007で割ったあまり
```

### 入力例1

```
10
```

### 出力例1

```
1
```

### 入力例2

```
1000000000
```

### 出力例2

```
1000000006
```

### 入力例3

```
1
```

### 出力例3

```
0
```

### 入力例4

```
0
```

### 出力例4

```
1
```

### 入力例5

```
1000000001
```

### 出力例5

```
0
```

### 入力例6

```
1000000002
```

### 出力例6

```
1
```

### 入力例7

```
1000000003
```

### 出力例7

```
2
```

### 入力例8

```
1000000004
```

### 出力例8

```
3
```

### 入力例9

```
1000000005
```

### 出力例9

```
4
```

### 入力例10

```
1000000006
```

### 出力例10

```
5
```

### 入力例11

```
1000000007
```

### 出力例11

```
6
```

### 入力例12

```
1000000008
```

### 出力例12

```
7
```

### 入力例13

```
1000000009
```

### 出力例13

```
8
```

### 入力例14

```
1000000010
```

### 出力例14

```
9
```

### 入力例15

```
1000000011
```

### 出力例15

```
10
```

### 入力例16

```
1000000012
```

### 出力例16

```
11
```

### 入力例17

```
1000000013
```

### 出力例17

```
12
```

### 入力例18

```
1000000014
```

### 出力例18

```
13
```

### 入力例19

```
1000000015
```

### 出力例19

```
14
```

### 入力例20

```
1000000016
```

### 出力例20

```
15
```

### 入力例21

```
1000000017
```

### 出力例21

```
16
```

### 入力例22

```
1000000018
```

### 出力例22

```
17
```

### 入力例23

```
1000000019
```

### 出力例23

```
18
```

### 入力例24

```
1000000020
```

### 出力例24

```
19
```

### 入力例25

```
1000000021
```

### 出力例25

```
20
```

### 入力例26

```
1000000022
```

### 出力例26

```
21
```

### 入力例27

```
1000000023
```

### 出力例27


