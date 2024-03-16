<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class atcoder_AGC002_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        if (a <= 0 && b >= 0 || a <= 0 && b >= 0) {
            System.out.println("Zero");
        } else if (a < 0 && b < 0) {
            System.out.println(((b - a + 1) % 2 == 0) ? "Positive" : "Negative");
        } else if (a > 0 && b > 0) {
            System.out.println("Positive");
        }
    }
}
```

### 解答

```python
import sys

a = int(sys.stdin.readline())
b = int(sys.stdin.readline())

if a <= 0 and b >= 0 or a <= 0 and b >= 0:
    print("Zero")
elif a < 0 and b < 0:
    print(((b - a + 1) % 2 == 0) and "Positive" or "Negative")
elif a > 0 and b > 0:
    print("Positive")
```

### 解説

- 入力を読み込み
- 条件分岐
- 条件分岐の結果を文字列に変換して出力

### 参考

- [atcoder_AGC002_A](https://atcoder.jp/contests/agc002/tasks/agc002_a)
</s>
