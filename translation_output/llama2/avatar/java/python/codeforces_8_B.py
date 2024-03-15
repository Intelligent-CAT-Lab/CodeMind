<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, j, x = 0, y = 0, k = 0, dx, dy;
        boolean flag = true;
        String s;
        char[] ch = new char[100];
        int[][] co = new int[2][101];

        s = scan.next();
        ch = s.toCharArray();
        co[0][k] = x;
        co[1][k] = y;
        ++k;

        for (i = 0; i < s.length(); ++i) {
            switch (ch[i]) {
                case 'L':
                    --x;
                    break;
                case 'R':
                    ++x;
                    break;
                case 'U':
                    ++y;
                    break;
                case 'D':
                    --y;
                    break;
            }
            co[0][k] = x;
            co[1][k] = y;
            ++k;
        }

        for (i = 0; i < k - 3; ++i) {
            for (j = i + 3; j < k; ++j) {
                dx = co[0][i] - co[0][j];
                dy = co[1][i] - co[1][j];
                if (dx < 0)
                    dx *= (-1);
                if (dy < 0)
                    dy *= (-1);
                if ((dx <= 1 && dy == 0) || (dy <= 1 && dx == 0)) {
                    flag = false;
                    break;
                }
            }
            if (!flag)
                break;
        }

        if (flag)
            System.out.println("OK");
        else
            System.out.println("BUG");
    }
}
```

### 题目

给定一个字符串，它由字符 'L' (左)，'R' (右)，'U' (上)，'D' (下) 组成。

字符串表示一个在 x 轴和 y 轴上的位置。

在字符串中，'L' 代表在 x 轴上向左移动一步，'R' 代表在 x 轴上向右移动一步，'U' 代表在 y 轴上向上移动一步，'D' 代表在 y 轴上向下移动一步。

如果在字符串中某一位置 (x, y) 处，向左、向右、向上、向下移动都不会离开原来的位置，则称该位置是安全的。

给定一个字符串，判断它是否是安全的。

### 输入格式

输入一个字符串，由字符 'L' (左)，'R' (右)，'U' (上)，'D' (下) 组成。

### 输出格式

如果字符串是安全的，输出 "OK" ；否则输出 "BUG" 。

### 输入样例

```
LU
```

### 输出样例

```
OK
```

### 输入样例

```
LUU
```

### 输出样例

```
BUG
```

### 输入样例

```
LUUU
```

### 输出样例

```
BUG
```

### 输入样例

```
LUUUU
```

### 输出样例

```
BUG
```

### 输入样例

```
LUUUUU
```

### 输出样例

```
BUG
```

### 输入样例

```
LUUUUUU
```

### 输出样例

```
BUG
```

### 输入样例

```
LUUUUUUU
```

### 输出样例

```
BUG
```

### 输入样例

```
LUUUUUUUU
```

### 输出样例

```
BUG
```

### 输入样例

```
LUUUUUUUUU
```

### 输出样例

```
BUG
```

### 输入样例

```
LUUUUUUUUUU
```

### 输出样例

```
BUG
```

### 输入样例

```
LUUUUUUUUUUU
```

### 输出样例

```
BUG
```

### 输入样例

```
LUUUUUUUUUUUU
```

### 输出样例

```
BUG
```

### 输入样例

```
LUUUUUUUUUUUUU
```

### 输出样例

```
BUG
```

### 输入样例

```
LUUUUUUUUUUUUUU
```

### 输出样例

```
BUG
```

### 输入样例

```
LUUUUUUUUUUUUUUU
```

### 输出样例

```
BUG
```

### 输入样例

```
LUUUUUUUUUUUUUUUU
```

### 输出样例

```
BUG
```

### 输入样例

```
LUUUUUUUUUUUUUUUUU
```

### 输出样例

```
BUG
```

### 输入样例

```
LUUUUUUUUUUUUUUUUUU
```

### 输出样例

```
BUG
```

### 输入样例

```
LUUUUUUUUUUUUUUUUUUU
```

### 输出样例

```
BUG
```

### 输入样例

```
LUUUUUUUUUUUUUUUUUUUU
```

### 输出样例

```
BUG
```

### 输入样例

```
LUUUUUUUUUUUUUUUUUUUUU
```

### 输出样例

```
BUG
```

### 输入样例

```
LUUUUUUUUUUUUUUUUUUUUUU
```

### 输出样例

```
BUG
```

### 输入样例

```
LUUUUUUUUUUUUUUUUUUUUUUU
```

### 输出样例

```
BUG
```

### 输入样例

```
LUUUUUUUUUUUUUUUUUUUUUUUU
```

### 输出样例

```
BUG
```

### 输入样例

```
LUUUUUUUUUUUUUUUUUUUUUUUUU
```

### 输出样例

```
BUG
```

### 输入样例

```
LUUUUUUUUUUUUUUUUUUUUUUUUUU
```

### 输出样例

```
BUG
```

###
