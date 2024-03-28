<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class codeforces_147_A {
    public static boolean isLatinLetter(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean iscodeforces_147_A(char c) {
        if (c == '.') return true;
        if (c == ',') return true;
        if (c == '!') return true;
        if (c == '?') return true;
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        sb.append(s.charAt(0));
        for (int i = 1; i < n; i++) {
            char c = s.charAt(i);
            if (isLatinLetter(c)) {
                if (!isLatinLetter(s.charAt(i - 1))) {
                    sb.append(' ');
                }
                sb.append(c);
            } else if (iscodeforces_147_A(c)) {
                sb.append(c);
            }
        }
        pw.println(sb);
        pw.flush();
        pw.close();
    }
}
```
[/INST]
```python
import sys

def isLatinLetter(c):
    return c >= 'a' and c <= 'z'

def iscodeforces_147_A(c):
    if c == '.':
        return True
    if c == ',':
        return True
    if c == '!':
        return True
    if c == '?':
        return True
    return False

s = sys.stdin.readline()
sb = StringBuilder()
n = len(s)
sb.append(s[0])
for i in range(1, n):
    c = s[i]
    if isLatinLetter(c):
        if not isLatinLetter(s[i-1]):
            sb.append(' ')
        sb.append(c)
    elif iscodeforces_147_A(c):
        sb.append(c)

print(sb)
```</s>
