<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class atcoder_AGC034_B {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BABC solver = new BABC();
        solver.solve(1, in, out);
        out.close();
    }

    static class BABC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next().replaceAll("BC", "D");
            long cnt = 0;
            long tmp = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'A') {
                    tmp++;
                } else if (s.charAt(i) == 'D') {
                    cnt += tmp;
                } else {
                    tmp = 0;
                }
            }
            out.println(cnt);
        }
    }
}
```

### 解答

```python
import sys


class BABC:
    def solve(self, testNumber, in, out):
        s = in.next().replace('BC', 'D')
        cnt = 0
        tmp = 0
        for i in range(len(s)):
            if s[i] == 'A':
                tmp += 1
            elif s[i] == 'D':
                cnt += tmp
            else:
                tmp = 0
        out.println(cnt)


if __name__ == '__main__':
    in = sys.stdin.readline
    out = sys.stdout.write
    solver = BABC()
    solver.solve(int(in()), in, out)
```

### 解説

- 入力と出力の代わりに `sys.stdin` と `sys.stdout` を使う
- 文字列の代わりに `str` を使う
- 文字列の代わりに `bytes` を使う
- 文字列の代わりに `bytearray` を使う
- 文字列の代わりに `list` を使う
- 文字列の代わりに `tuple` を使う
- 文字列の代わりに `dict` を使う
- 文字列の代わりに `set` を使う
- 文字列の代わりに `range` を使う
- 文字列の代わりに `map` を使う
- 文字列の代わりに `zip` を使う
- 文字列の代わりに `enumerate` を使う
- 文字列の代わりに `filter` を使う
- 文字列の代わりに `sum` を使う
- 文字列の代わりに `any` を使う
- 文字列の代わりに `all` を使う
- 文字列の代わりに `max` を使う
- 文字列の代わりに `min` を使う
- 文字列の代わりに `len` を使う
- 文字列の代わりに `str.split` を使う
- 文字列の代わりに `str.join` を使う
- 文字列の代わりに `str.find` を使う
- 文字列の代わりに `str.count` を使う
- 文字列の代わりに `str.replace` を使う
- 文字列の代わりに `str.strip` を使う
- 文字列の代わりに `str.upper` を使う
- 文字列の代わりに `str.lower` を使う
- 文字列の代わりに `str.isupper` を使う
- 文字列の代わりに `str.islower` を使う
- 文字列の代わりに `str.capitalize` を使う
- 文字列の代わりに `str.center` を使う
- 文字列の代わりに `str.ljust` を使う
- 文字列の代わりに `str.rjust` を使う
- 文字列の代わりに `str.zfill` を使う
- 文字列の代わりに `str.format` を使う
- 文字列の代わりに `str.encode` を使う
- 文字列の代わりに `str.decode` を使う
- 文字列の代わりに `str.isdigit` を使う
- 文字列の代わりに `str.isalnum` を使う
- 文字列の代わりに `str.isalpha` を使う
- 文字列の代わりに `str.isnumeric` を使う
- 文字列の代わりに `str.isdecimal` を使う
- 文字列の代わりに `str.isascii` を使う
- 文字列の代わりに `str.isprintable` を使う
- 文字列の代わりに `str.islower` を使う
- 文字列の代わりに `str.isupper` を使う
- 文字列の代わりに `str.isalpha` を使う
- 文字列の代わりに `str.isdigit` を使う
- 文字列の代わりに `str.isdecimal` を使う
- 文字列の代わりに `str.isascii` を使う
- 文字列の代わりに `str.isprintable` を使う
- 文字列の代わりに `str.isalnum` を使う
- 文字列の代わりに `str.isnumeric` を使う
- 文字列の代わりに `str.isupper` を使う
- 文字列の代わりに `str.islower` を使う
- 文字列の代わりに `str.isalpha` を使う
- 文字列の代わりに `str.isdigit` を使う
- 文字列の代わりに `str.isdecimal` を使う
- 文字列の代わりに `str.isascii` を使う
- 文字列の代わりに `str.isprintable` を使う
- 文字列の代わりに `str.isalnum` を使う
- 文字列の代わりに `str.isnumeric` を使う
- 文字列の代わりに `str.isupper` を使う
- 文字列の代わりに `str.islower` を使う
- 文字列の代わりに `str.isalpha` を使う
- 文字列の代わりに `str.isdigit` を使う
- 文字列の代わりに `str.isdecimal` を使う
- 文字列の代わりに `str.isascii` を使う
- 文字列の代わりに `str.isprintable` を使う
- 文字列の代わりに `str.isalnum` を使う
- 文字列の代わりに `str.isnumeric` を使う
- 文字列の代わりに `str.isupper` を使う
- 文字列の代わりに `str.islower` を使う
- 文字列の代わりに `str.isalpha` を使う
-
