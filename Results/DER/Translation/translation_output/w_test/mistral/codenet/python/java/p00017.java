<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        while (true) {
            s = scanner.nextLine();
            s = decode(s);
            if (s.contains("the") || s.contains("that") || s.contains("this")) {
                System.out.println(s);
                break;
            }
        }
    }
    public static String decode(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ' || c == '.') {
                result.append(c);
            } else {
                result.append((char) (ord(c) + 1));
            }
        }
        result.replace(ord('z') + 1, 'a');
        return result.toString();
    }
}
```</s>
