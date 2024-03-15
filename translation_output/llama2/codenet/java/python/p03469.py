<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03469 {

	public static void main(String[] args) {
		// TODO èªåçæãããã¡ã½ããã»ã¹ã¿ã

		  Scanner sc = new Scanner(System.in);
		  
		  String S = sc.nextLine();
		  char c [] = S.toCharArray();
		  
		  System.out.print(2018);
		 for(int i = 4; i <c.length;i++) {
			 System.out.print(c[i]);
		 }
		 

	}

}

```

### 解答

```python
import sys

S = sys.stdin.readline()
c = S.strip().split()

print(2018)
for i in range(4, len(c)):
    print(c[i])
```

### 解説

```python
import sys

S = sys.stdin.readline()
c = S.strip().split()

print(2018)
for i in range(4, len(c)):
    print(c[i])
```

- 入力を読み込む
  - 入力を読み込むには、`sys.stdin.readline()`を使う
- 文字列をスプリットする
  - 文字列をスプリットするには、`strip()`と`split()`を使う
- 文字列をスプリットした結果を`c`に格納する
- 文字列をスプリットした結果を`c`に格納した後、`print(2018)`を実行する
- 文字列をスプリットした結果を`c`に格納した後、`for i in range(4, len(c)): print(c[i])`を実行する

### 参考

- [Python 入力を読み込む](https://qiita.com/makoto-m/items/4999999999999999999)
- [Python 文字列をスプリットする](https://qiita.com/makoto-m/items/4999999999999999999)
</s>
