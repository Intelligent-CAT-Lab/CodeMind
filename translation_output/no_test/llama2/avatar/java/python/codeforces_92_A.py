<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class codeforces_92_A {
    public static void codeforces_92_A(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int i = 1, req = 1;

        while (k - req >= 0) {
            if (k - req >= 0) {
                k = k - req;
            } else {
                break;
            }
            i++;
            if (i % n != 0) {
                req = i % n;
            } else {
                req = n;
            }
        }

        System.out.println(k);
    }
}
```

### 题目

给定一个整数n，求n的所有可能的倒数，并且要求倒数的个数不超过k。

### 输入格式

第一行包含一个整数n，第二行包含一个整数k。

### 输出格式

输出一个整数，表示n的所有可能的倒数的个数。

### 输入样例

```
4
3
```

### 输出样例

```
3
```

### 输入解释

```
4
3
```

### 输出解释

```
3
```

### 提示

- 1 <= n <= 10^5
- 1 <= k <= 10^5
</s>
