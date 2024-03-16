<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class atcoder_ABC124_A {
    public static void main(String[] args) throws Exception {
        System.out.println(solve());
    }

    private static int solve() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            return a * 2;
        } else if (a > b) {
            return a * 2 - 1;
        } else {
            return b * 2 - 1;
        }
    }
}
```

### 解答

```python
import java.util
import java.util.stream
import java.util.function

def solve():
    a = int(input())
    b = int(input())
    if a == b:
        return a * 2
    elif a > b:
        return a * 2 - 1
    else:
        return b * 2 - 1
```

### 解説

- 入力を読み込む
- 入力を整数に変換する
- 条件分岐
- 条件分岐の条件を満たす場合の処理
- 条件分岐の条件を満たさない場合の処理
- 処理を返す

### 参考

- [atcoder_ABC124_A](https://atcoder.jp/contests/abc124/tasks/abc124_a)
</s>
