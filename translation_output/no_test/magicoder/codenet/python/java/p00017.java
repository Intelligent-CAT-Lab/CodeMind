<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
def decode(s):
    result=""
    for c in s:
        if not (c==" " or c=="."):
            result+=chr(ord(c)+1)
        else:
            result+=c
    return result.replace(chr(ord("z")+1),"a")
for line in sys.stdin.readlines():
    s=line.strip()
    for i in range(ord("z")-ord("a")+1):
        if "the" in s or "that" in s or "this" in s:
            print(s)
            break
        s=decode(s)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine().trim();
            for (int i = 0; i < ('z' - 'a' + 1); i++) {
                if (s.contains("the") || s.contains("that") || s.contains("this")) {
                    System.out.println(s);
                    break;
                }
                s = decode(s);
            }
        }
    }

    public static String decode(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != ' ' && c != '.') {
                result.append((char)(c + 1));
            } else {
                result.append(c);
            }
        }
        return result.toString().replace('{', 'a');
    }
}
```

Please note that in Java, the `chr()` and `ord()` functions are replaced by the `(char)` and `(int)` casts respectively. Also, the `replace()` function in Java does not take a character as an argument, but a string. Therefore, the `chr(ord("z")+1)` is replaced by `'{'`.<｜end▁of▁sentence｜>
