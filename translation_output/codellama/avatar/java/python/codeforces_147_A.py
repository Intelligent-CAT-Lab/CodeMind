<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

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

Translate the above java code to python.

python Code:

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
    s = sys.stdin.readline()
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
This is the Python code equivalent to the Java code you provided. It uses the same logic and functions to solve the problem. The only difference is that Python uses a list to store the characters instead of a StringBuilder.</s>
