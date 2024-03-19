<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
CODEFESTIVAL

Expected output:
YKs

```
s = input()
ss = ""
p = 0
for i in range(len(s)):
    if p == 0 and s[i] == "C":
        p = 1
    elif p == 1 and s[i] == "F":
        p = 2
print("Yes" if p == 2 else "No")
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int p = 0;
        for(int i = 0; i < s.length(); i++) {
            if(p == 0 && s.charAt(i) == 'C') {
                p = 1;
            } else if(p == 1 && s.charAt(i) == 'F') {
                p = 2;
            }
        }
        System.out.println("Yes" + (p == 2? "" : "No"));
    }
}
```
'''
<|endoftext|>
