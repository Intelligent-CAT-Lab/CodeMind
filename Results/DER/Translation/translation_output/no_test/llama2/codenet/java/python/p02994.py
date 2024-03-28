<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p02994 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt();

        List<Integer> diff = new ArrayList<Integer>();
        
        for(int i = 1; i < n+1; i++) {
          int value = l+i-1;
          if(value < 0) {
            value = value * -1;
          }
          diff.add(value);
          }
        
        Integer removeK = diff.indexOf(Collections.min(diff)) + 1;
        
        
        System.out.println(n*l + n*(n+1)/2 - n - (l+ removeK -1));
    }
}
```

### 解答

```python
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

def main():
    n = int(input())
    l = int(input())
    diff = []
    for i in range(1, n+1):
        value = l+i-1
        if value < 0:
            value = value * -1
        diff.append(value)
    removeK = diff.index(min(diff)) + 1
    print(n*l + n*(n+1)/2 - n - (l+ removeK -1))

if __name__ == '__main__':
    main()
```

### 解説

- 入力値を取得する
- リストを作成する
- 最小値を取得する
- 最小値を削除する
- 出力値を計算する

### 備考

- 入力値を取得する
  - スキャナを使用して入力値を取得する
- リストを作成する
  - リストを作成する
- 最小値を取得する
  - 最小値を取得する
- 最小値を削除する
  - 最小値を削除する
- 出力値を計算する
  - 出力値を計算する

### 参考

- [Java のコードを Python に翻訳する](https://qiita.com/yuu_k/items/4999999999999999999)
</s>
