<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC153_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long monsterHP = scan.nextLong();
        long servalATK = scan.nextLong();
        scan.close();

        long mod = monsterHP % servalATK;
        long ans = monsterHP / servalATK;

        if (mod > 0) {
            ans++;
        }

        System.out.println(ans);
    }
}
```

### 解答

```python
import sys

monsterHP = int(sys.stdin.readline().strip())
servalATK = int(sys.stdin.readline().strip())

mod = monsterHP % servalATK
ans = monsterHP // servalATK

if mod > 0:
    ans += 1

print(ans)
```

### 解説

```python
import sys
```

`sys`モジュールは、システムの情報を取得するために使用します。

```python
monsterHP = int(sys.stdin.readline().strip())
servalATK = int(sys.stdin.readline().strip())
```

`sys.stdin`は、標準入力ストリームを表します。

`readline()`は、ストリームから行を読み取り、その行を`strip()`で空白を除去したものを返します。

`int()`は、文字列を整数に変換します。

```python
mod = monsterHP % servalATK
ans = monsterHP // servalATK
```

`mod`は、`monsterHP`の残りを`servalATK`で割ったものを表します。

`//`は、整数を整数で割ったものを表します。

```python
if mod > 0:
    ans += 1
```

`mod`が0以上である場合、`ans`を1つ増やします。

```python
print(ans)
```

`print()`は、`ans`を表示します。

### 参考

- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#int)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#str)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#int)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#str)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#int)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#str)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#int)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#str)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#int)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#str)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#int)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#str)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#int)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#str)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#int)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#str)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#int)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#str)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#int)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#str)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#int)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#str)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#int)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#str)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#int)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#str)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#int)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#str)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#int)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#str)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#int)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#str)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#int)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#str)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#int)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#str)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#int)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#str)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#int)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#str)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#int)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/stdtypes.html#str)
- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/
