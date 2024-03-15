<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC125_A {
    static long n, k, m, l, a, b, c;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        a = sc.nextInt();
        b = sc.nextInt();
        n = sc.nextInt();
        k = 0;
        for (int i = 1; i * a <= n; i++) {
            k += b;
        }
        System.out.println(k);
    }
}
```

### 解答

```python
import sys

n, k, m, l, a, b, c = map(int, sys.stdin.readline().split())

k = 0
for i in range(1, int(a) + 1):
    k += b

print(k)
```

### 解説

```python
import sys

n, k, m, l, a, b, c = map(int, sys.stdin.readline().split())
```

`sys.stdin.readline()` で入力を読み込み、`map()` でそれを `int` に変換して `n`, `k`, `m`, `l`, `a`, `b`, `c` に代入した。

```python
k = 0
for i in range(1, int(a) + 1):
    k += b
```

`int(a) + 1` で `a` の値を `int` に変換して `1` を足して `range()` で `1` から `a` の値を足した値までの値を `i` に代入した。

`k` を `0` に初期化して `for` ループを実行した。

```python
k += b
```

`k` に `b` を足した。

```python
print(k)
```

`k` を出力した。

### 参考

- [atcoder_ABC125_A](https://atcoder.jp/contests/abc125/tasks/abc125_a)
</s>
