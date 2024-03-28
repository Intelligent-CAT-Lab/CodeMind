<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
125

Expected output:
234

```

s = input()

ans = 0
for i in range(2 ** (len(s) - 1)):
    pat = s[0]
    index = 1
    for j in range(len(s) - 1):
        if i >> j & 1:
            pat += "+"
        pat += s[index]
        index += 1
    #print(pat)
    ans += eval(pat)

print(ans)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        for (int i = 0; i < (1 << (s.length() - 1)); i++) {
            String pat = s.charAt(0) + "";
            int index = 1;
            for (int j = 0; j < s.length() - 1; j++) {
                if ((i >> j & 1) == 1) {
                    pat += "+";
                }
                pat += s.charAt(index);
                index++;
            }
            // System.out.println(pat);
            ans += Integer.parseInt(pat);
        }
        System.out.println(ans);
    }
}
```
<|endoftext|>
