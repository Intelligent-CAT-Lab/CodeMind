<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03711 {

    private static boolean grouped(int[] grp, int x, int y) {
        boolean bx = false;
        boolean by = false;

        for (int i = 0; i < grp.length; i++) {
            if (grp[i] == x) {
                bx = true;
            }
            if (grp[i] == y) {
                by = true;
            }
        }

        return bx && by;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] grp1 = {1, 3, 5, 7, 8, 10, 12};
        int[] grp2 = {4, 6, 9, 11};
        int[] grp3 = {2};

        System.out.println( (grouped(grp1, x, y) || grouped(grp2, x, y)) ? "Yes" : "No" );
    }

}
```

### 解题思路

```python
import java.util.Scanner;

class p03711:
    def grouped(self, grp, x, y):
        bx = False
        by = False
        for i in range(len(grp)):
            if grp[i] == x:
                bx = True
            if grp[i] == y:
                by = True
        return bx and by

    def main(self):
        sc = Scanner(System.in)
        x = sc.nextInt()
        y = sc.nextInt()
        grp1 = [1, 3, 5, 7, 8, 10, 12]
        grp2 = [4, 6, 9, 11]
        grp3 = [2]
        print(self.grouped(grp1, x, y) or self.grouped(grp2, x, y) ? "Yes" : "No")

if __name__ == "__main__":
    p03711().main()
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(n)。

### 相关题目

- [p03710](./p03710.md)
</s>
