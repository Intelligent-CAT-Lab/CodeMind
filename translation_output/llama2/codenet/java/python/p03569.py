<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03569 {
    public void main(Scanner sc) {
        String s = sc.next();
        int length = s.length();

        int cnt = 0;
        int l = 0;
        int r = length - 1;
        while (l <= r) {
            char cl = s.charAt(l);
            char cr = s.charAt(r);

            if (cl == cr) {
                l++;
                r--;
            } else {
                if (cl == 'x') {
                    cnt++;
                    l++;
                } else if (cr == 'x') {
                    cnt++;
                    r--;
                } else {
                    cnt = -1;
                    break;
                }
            }
        }

        System.out.println(cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new p03569().main(sc);
        sc.close();
    }
}

```

### 解题思路

```python
import java.util

class p03569:
    def main(self, sc):
        s = sc.next()
        length = len(s)

        cnt = 0
        l = 0
        r = length - 1
        while l <= r:
            cl = s[l]
            cr = s[r]

            if cl == cr:
                l += 1
                r -= 1
            elif cl == 'x':
                cnt += 1
                l += 1
            elif cr == 'x':
                cnt += 1
                r -= 1
            else:
                cnt = -1
                break

        print(cnt)


if __name__ == '__main__':
    sc = java.util.Scanner(System.in)
    p03569().main(sc)
    sc.close()
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [p03568](../p03568)
</s>
