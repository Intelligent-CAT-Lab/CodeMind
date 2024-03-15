<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC108_B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        int x3 = x2 + (y1 - y2);
        int y3 = y2 - (x1 - x2);
        int x4 = x1 - (y2 - y1);
        int y4 = y1 + (x2 - x1);
        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }
}
```

### 解答

```python
import sys

x1, y1, x2, y2 = map(int, sys.stdin.readline().split())
x3 = x2 + (y1 - y2)
y3 = y2 - (x1 - x2)
x4 = x1 - (y2 - y1)
y4 = y1 + (x2 - x1)
print(x3, y3, x4, y4)
```

### 解説

```python
import sys
```

`sys` モジュールは、システムの情報を取得するために使用されます。

```python
x1, y1, x2, y2 = map(int, sys.stdin.readline().split())
```

`map` 関数は、`list` オブジェクトから `tuple` オブジェクトを作成します。

```python
x3 = x2 + (y1 - y2)
y3 = y2 - (x1 - x2)
x4 = x1 - (y2 - y1)
y4 = y1 + (x2 - x1)
```

`x3` は `x2` と `y1` の差を `x2` に加えます。

`y3` は `y2` と `x1` の差を `y2` から差し引きます。

`x4` は `x1` と `y2` の差を `x1` から差し引きます。

`y4` は `y1` と `x2` の差を `y1` に加えます。

```python
print(x3, y3, x4, y4)
```

`print` 関数は、`tuple` オブジェクトを出力します。

### 参考

- [Python 3.8.2 Documentation](https://docs.python.org/3/library/stdtypes.html#mapping-types-dict-set-frozenset)
- [Python 3.8.2 Documentation](https://docs.python.org/3/library/functions.html#map)
- [Python 3.8.2 Documentation](https://docs.python.org/3/library/functions.html#print)
</s>
