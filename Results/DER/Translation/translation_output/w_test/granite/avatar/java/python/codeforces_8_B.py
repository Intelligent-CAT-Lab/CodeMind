System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
LUUDU

Expected output:
BUG


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


Answer:
```python
import sys

def main():
    s = input()
    x, y = 0, 0
    for c in s:
        if c == 'L':
            x -= 1
        elif c == 'R':
            x += 1
        elif c == 'U':
            y += 1
        elif c == 'D':
            y -= 1
    for i in range(len(s)):
        for j in range(i + 3, len(s)):
            dx, dy = x - (x - s[i:j].count('L') + s[i:j].count('R')), y - (y - s[i:j].count('D') + s[i:j].count('U'))
            if abs(dx) <= 1 and abs(dy) <= 1:
                print('BUG')
                return
    print('OK')

if __name__ == "__main__":
    sys.exit(main())
```<|endoftext|>
