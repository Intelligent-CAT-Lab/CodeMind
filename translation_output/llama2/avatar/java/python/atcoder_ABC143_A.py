<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_ABC143_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if A - (B * 2) > 0:
            system.out.println(A - (B * 2))
    }
}
```

### 解答

```python
import sys

A = int(sys.stdin.readline())
B = int(sys.stdin.readline())

if A - (B * 2) > 0:
    print(A - (B * 2))
```

### 解説

```python
import sys
```

`sys` モジュールは、システムの状態を表すオブジェクトを提供します。

```python
A = int(sys.stdin.readline())
B = int(sys.stdin.readline())
```

`sys.stdin` は、標準入力ストリームを表すオブジェクトです。

`readline()` は、標準入力ストリームから行を読み取り、その行を文字列として返します。

`int()` は、文字列を整数に変換します。

```python
if A - (B * 2) > 0:
    print(A - (B * 2))
```

`if` ステートメントは、条件式を評価し、評価結果が真である場合にのみ、ステートメントブロックを実行します。

`A - (B * 2)` は、`A` と `B` の差を計算します。

`print()` は、文字列を出力します。

### 参考

- [Python 3.8.2 Documentation](https://docs.python.org/3.8/library/sys.html)
</s>
