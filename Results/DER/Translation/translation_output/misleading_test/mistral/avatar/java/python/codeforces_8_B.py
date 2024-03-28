<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
LUUDU

Expected output:
BU

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
[/INST]
```python
import sys

def main():
    s = input()
    ch = list(s)
    co = [[0, 0], [0, 0]]
    x, y = 0, 0
    k = 0
    for i in range(len(s)):
        if ch[i] == 'L':
            x -= 1
        elif ch[i] == 'R':
            x += 1
        elif ch[i] == 'U':
            y += 1
        elif ch[i] == 'D':
            y -= 1
        co[0][k] = x
        co[1][k] = y
        k += 1

    for i in range(k - 3):
        for j in range(i + 3, k):
            dx = co[0][i] - co[0][j]
            dy = co[1][i] - co[1][j]
            if dx < 0:
                dx *= -1
            if dy < 0:
                dy *= -1
            if (dx <= 1 and dy == 0) or (dy <= 1 and dx == 0):
                flag = False
                break

    if flag:
        print("OK")
    else:
        print("BUG")

if __name__ == "__main__":
    main()
```</s>
