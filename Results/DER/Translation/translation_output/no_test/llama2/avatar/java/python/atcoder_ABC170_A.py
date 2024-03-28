<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anser = 0;
        int[] count = new int[5];
        
        for (int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            count[i] += x;
            
            if (count[i] == 0) {
                anser = i;
            }
        }
        
        System.out.println(anser + 1);
    }
}
```

### 解答

```python
import sys

def main():
    ans = 0
    count = [0] * 5
    for _ in range(5):
        x = int(sys.stdin.readline())
        count[x - 1] += 1
        if count[x - 1] == 0:
            ans = x
    print(ans + 1)

if __name__ == '__main__':
    main()
```

### 解説

```python
import sys
```

`sys` モジュールは、システムの情報を取得するために使用します。

```python
def main():
    ans = 0
    count = [0] * 5
    for _ in range(5):
        x = int(sys.stdin.readline())
        count[x - 1] += 1
        if count[x - 1] == 0:
            ans = x
    print(ans + 1)
```

`main` 関数は、`ans` 変数を 0 に初期化し、`count` 配列を 5 回ループします。

`count` 配列は、`x` の値を `x - 1` に変換して、`x` の値を `count` 配列に追加します。

`count` 配列の値が 0 になった場合、`ans` 変数に `x` の値を代入します。

`print` 関数は、`ans` 変数の値を 1 を加えて出力します。

`if __name__ == '__main__':` ブロックは、`main` 関数を呼び出すために使用されます。

### 参考

- [Python 3.8.10 Documentation](https://docs.python.org/3/library/sys.html)
- [Python 3.8.10 Documentation](https://docs.python.org/3/library/stdtypes.html#int)
- [Python 3.8.10 Documentation](https://docs.python.org/3/library/functions.html#print)
</s>
