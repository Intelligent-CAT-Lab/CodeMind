<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_ABC164_A {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> scList = new ArrayList<>();

        scList.add(scan.nextLine());

        String[] numlist = scList.get(0).split(" ");
        int Sheep = Integer.parseInt(numlist[0]);
        int Wolve = Integer.parseInt(numlist[1]);

        if (Wolve >= Sheep) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}
```

### 解答

```python
import java.util

class atcoder_ABC164_A:
    def main(self, args):
        scanner = java.util.Scanner(sys.stdin)
        list = []

        list.append(scanner.nextLine())

        numlist = list[0].split(" ")
        sheep = int(numlist[0])
        wolf = int(numlist[1])

        if wolf >= sheep:
            print("unsafe")
        else:
            print("safe")
```

### 解説

- 入力を読み込む
- 入力を配列に格納する
- 配列の要素を単語で分割する
- 単語を数値に変換する
- 条件を満たすかどうかを判定する
- 条件を満たした場合に出力する
- 条件を満たさなかった場合に出力する

### 参考

- [Java to Python](https://www.programiz.com/python-programming/examples/java-to-python)
</s>
