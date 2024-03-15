<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC158_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        if (str.equals("AAA") || str.equals("BBB")) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
```

### 解答

```python
import sys

def main():
    str = sys.stdin.readline()
    if str == "AAA" or str == "BBB":
        print("No")
    else:
        print("Yes")

if __name__ == "__main__":
    main()
```

### 解説

- 入力を読み込む
- 条件を満たすかどうかを判定する
- 条件を満たした場合は「No」を出力する
- 条件を満たさなかった場合は「Yes」を出力する

### 参考

- [Python 入力と出力](https://docs.python.jp/3/tutorial/inputoutput.html)
</s>
