<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_ABC043_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        while (s.contains("0B ") || s.contains("1B ")) {
            s = s.replaceAll("0B ", "");
            s = s.replaceAll("1B ", "");
        }
        
        s = s.replaceAll(" B ", "");
        
        System.out.println(s);
    }
}
```

### 解答

```python
import java.util

def main():
    sc = java.util.Scanner(System.in)
    s = sc.next()
    
    while s.contains("0B ") or s.contains("1B "):
        s = s.replace("0B ", "")
        s = s.replace("1B ", "")
    
    s = s.replace(" B ", "")
    
    print(s)

main()
```

### 解説

- 入力をスキャンする
- 入力をスキャンした結果をsに代入する
- 入力が0B または 1B で始まっている場合は、それを削除する
- 入力が B で終わっている場合は、それを削除する
- 入力を出力する

### 参考

- [atcoder_ABC043_B](https://atcoder.jp/contests/abc043/tasks/abc043_b)
</s>
