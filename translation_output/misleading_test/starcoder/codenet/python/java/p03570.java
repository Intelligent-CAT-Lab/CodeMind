<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
aabxyyzz

Expected output:
94

```
#  --*-coding:utf-8-*--

def f(str):
    s = {}
    s[0] = 0
    pat = 0

    bits = [2**i for i in range(26)]
    lenOfStr = len(str)

    for c in str:
        pat ^= bits[ord(c)-97]
        s[pat] = min(
            min(s.get(pat^bit, lenOfStr) + 1 for bit in bits),
            s.get(pat, lenOfStr))

    if pat == 0:
        return 1

    return s[pat]
            
str = input()
print(f(str))


```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(f(str));
    }

    public static int f(String str) {
        int[] s = new int[1 << 26];
        s[0] = 0;
        int pat = 0;

        int[] bits = new int[26];
        for (int i = 0; i < 26; i++) {
            bits[i] = 1 << i;
        }
        int lenOfStr = str.length();

        for (int i = 0; i < str.length(); i++) {
            pat ^= bits[str.charAt(i) - 'a'];
            s[pat] = Math.min(Math.min(s[pat ^ bits[str.charAt(i) - 'a']] + 1, s[pat]), lenOfStr);
        }

        if (pat == 0) {
            return 1;
        }

        return s[pat];
    }
}
```

'''
<|endoftext|>
