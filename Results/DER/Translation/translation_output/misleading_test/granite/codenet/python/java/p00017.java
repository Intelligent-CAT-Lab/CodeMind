System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
xlmw mw xli tmgxyvi xlex m xsso mr xli xvmt.

Expected output:
ths /G t;he pi137\e tha xi $o`( in th trip

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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            while (!s.contains("the") &&!s.contains("that") &&!s.contains("this")) {
                s = decode(s);
            }
            System.out.println(s);
        }
    }

    public static String decode(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c!='' && c!= '.') {
                result.append((char) (c + 1));
            } else {
                result.append(c);
            }
        }
        return result.toString().replace("b", "a");
    }
}
```

Test input:
```
xlmw mw xli tmgxyvi xlex m xsso mr xli xvmt.
```

Expected output:
```
ths /G t;he pi137\e tha xi $o`( in th trip
```<|endoftext|>
