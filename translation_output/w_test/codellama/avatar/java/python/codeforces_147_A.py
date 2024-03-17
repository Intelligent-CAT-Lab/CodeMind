<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
a!n , to

Expected output:
a! n, to


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

def is_latin_letter(c):
    return c >= 'a' and c <= 'z'

def is_codeforces_147_A(c):
    if c == '.':
        return True
    if c == ',':
        return True
    if c == '!':
        return True
    if c == '?':
        return True
    return False

def main():
    s = sys.stdin.readline().strip()
    sb = []
    n = len(s)
    sb.append(s[0])
    for i in range(1, n):
        c = s[i]
        if is_latin_letter(c):
            if not is_latin_letter(s[i - 1]):
                sb.append(' ')
            sb.append(c)
        elif is_codeforces_147_A(c):
            sb.append(c)
    print(''.join(sb))

if __name__ == '__main__':
    main()
```
Note that the code is written in Python 3.x, and it uses the `sys` module to read input from stdin and write output to stdout. The `is_latin_letter` function checks if a character is a Latin letter, and the `is_codeforces_147_A` function checks if a character is one of the allowed punctuation marks. The `main` function reads a line of input from stdin, splits it into individual characters, and then iterates over the characters, checking if they are Latin letters or allowed punctuation marks. If they are, they are added to the output string, and if they are not, they are ignored. Finally, the output string is printed to stdout.</s>
