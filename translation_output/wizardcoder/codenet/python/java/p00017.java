Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine().trim();
            for (int i = 0; i < 26; i++) {
                String decoded = decode(s, i);
                if (decoded.contains("the") || decoded.contains("that") || decoded.contains("this")) {
                    System.out.println(decoded);
                    break;
                }
            }
        }
    }

    public static String decode(String s, int shift) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c!='' && c!= '.') {
                result.append((char) (c - shift));
            } else {
                result.append(c);
            }
        }
        return result.toString().replace("" + (char) (shift + 'a'), "a");
    }
}
```<|endoftext|>
