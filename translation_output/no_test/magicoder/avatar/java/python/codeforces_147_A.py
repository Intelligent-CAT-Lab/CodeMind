<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
```python
import sys

def is_latin_letter(c):
    return 'a' <= c <= 'z'

def is_codeforces_147_A(c):
    if c == '.': return True
    if c == ',': return True
    if c == '!': return True
    if c == '?': return True
    return False

def main():
    s = sys.stdin.readline().strip()
    sb = [s[0]]
    for i in range(1, len(s)):
        c = s[i]
        if is_latin_letter(c):
            if not is_latin_letter(s[i - 1]):
                sb.append(' ')
            sb.append(c)
        elif is_codeforces_147_A(c):
            sb.append(c)
    print(''.join(sb))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line from the standard input, processes it, and prints the result. The `is_latin_letter` function checks if a character is a latin letter, and the `is_codeforces_147_A` function checks if a character is a special character. The `main` function is the entry point of the program.<｜end▁of▁sentence｜>
