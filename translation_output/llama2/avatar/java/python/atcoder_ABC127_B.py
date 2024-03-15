<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class atcoder_ABC127_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());

        for (int i = 0; i < 10; i++) {
            x = r * x - d;
            System.out.println(x);
        }
    }
}
```

### 解答

```python
import sys

r, d, x = map(int, sys.stdin.readline().split())

for _ in range(10):
    x = r * x - d
    print(x)
```

### 解説

```python
import sys

r, d, x = map(int, sys.stdin.readline().split())
```

`sys.stdin.readline()` で入力を読み込み、`split()` で `r`, `d`, `x` を `int` 型に変換して `map()` で変数に代入した。

```python
for _ in range(10):
    x = r * x - d
    print(x)
```

`for _ in range(10):` で `for` ループを実行し、`x = r * x - d` で `x` を `r` と `x` の積と `d` の差にする。

最後に `print(x)` で `x` を出力した。
</s>
