<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03534 {
    public void main(Scanner sc) {
        String str = sc.next();
        int abc[] = new int[3];
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 3; j++) {
                if (str.charAt(i) == "abc".charAt(j)) {
                    abc[j]++;
                }
            }
        }

        Arrays.sort(abc);

        System.out.println(((abc[1] - abc[0] < 2) && (abc[2] - abc[0] < 2)) ? "YES" : "NO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new p03534().main(sc);
        sc.close();
    }
}

```

### 解题思路

```python
import java.util

class p03534:
    def main(self, sc):
        str = sc.next()
        abc = [0]*3
        for i in range(len(str)):
            for j in range(3):
                if str[i] == "abc"[j]:
                    abc[j] += 1
        if (abc[1] - abc[0] < 2) and (abc[2] - abc[0] < 2):
            print("YES")
        else:
            print("NO")

if __name__ == "__main__":
    sc = java.util.Scanner(System.in)
    p03534().main(sc)
    sc.close()
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [p03533](https://leetcode-cn.com/problems/abc-sort/solution/p03533-abc-sort-by-leetcode-solution/)
</s>
