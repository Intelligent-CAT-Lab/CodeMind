<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class atcoder_ABC124_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans1 = 0;
        int ans2 = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (i % 2 == 0) {
                if (c == '0') {
                    ans1++;
                } else {
                    ans2++;
                }
            } else {
                if (c == '1') {
                    ans1++;
                } else {
                    ans2++;
                }
            }
        }
        
        System.out.println(Math.min(ans1, ans2));
    }
}
```

### 解答

```python
import sys

s = sys.stdin.readline()

ans1 = 0
ans2 = 0

for i in range(len(s)):
    c = s[i]
    if i % 2 == 0:
        if c == '0':
            ans1 += 1
        else:
            ans2 += 1
    else:
        if c == '1':
            ans1 += 1
        else:
            ans2 += 1

print(min(ans1, ans2))
```

### 解説

- 入力を読み込み
- 文字列を各文字単位に分けて処理
- 偶数の個数の文字を処理
- 奇数の個数の文字を処理
- 最小値を返す
</s>
