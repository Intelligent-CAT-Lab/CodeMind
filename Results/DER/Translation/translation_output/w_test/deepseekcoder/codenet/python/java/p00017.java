<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
xlmw mw xli tmgxyvi xlex m xsso mr xli xvmt.

Expected output:
this is the picture that i took in the trip.


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

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine().strip();
            for (int i = 0; i < 26; i++) {
                if (s.contains("the") || s.contains("that") || s.contains("this")) {
                    System.out.println(s);
                    break;
                }
                s = decode(s);
            }
        }
        scanner.close();
    }

    private static String decode(String s) {
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

This Java code does the same thing as your Python code. It reads lines from the standard input, decodes each line by shifting each character one place forward in the alphabet, and prints the line if it contains "the", "that", or "this". The decoding stops after 26 iterations, or when a line containing "the", "that", or "this" is found.

Please note that in Java, the character '{' is not a valid character in a string, so I replaced it with 'a' in the decode method. If you have a different character that you want to replace with 'a', you can replace '{' with that character in the decode method.
<|EOT|>
