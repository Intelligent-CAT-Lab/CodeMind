<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

/**
 *
 * @author kouki
 */
public class p03145 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        
        System.out.println((x*y)/2);
        
    }
    
}
```

### 解答

```python
import sys

x = int(sys.stdin.readline())
y = int(sys.stdin.readline())
z = int(sys.stdin.readline())

print((x*y)/2)
```

### 解説

```python
import sys
```

`sys`モジュールは、システムの情報を取得するために使用する。

```python
x = int(sys.stdin.readline())
y = int(sys.stdin.readline())
z = int(sys.stdin.readline())
```

`sys.stdin`は、標準入力ストリームを表す。

`readline()`は、標準入力ストリームから1行の文字列を読み込む。

`int()`は、文字列を整数に変換する。

```python
print((x*y)/2)
```

`print()`は、文字列を出力する。

`(x*y)/2`は、`x`と`y`を整数で乗算し、`2`を除数として除算する。

### 参考

- [Python 3.9.1 Reference Manual](https://docs.python.org/3/library/sys.html)
</s>
