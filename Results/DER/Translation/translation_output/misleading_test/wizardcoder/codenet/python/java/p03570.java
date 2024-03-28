Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(f(str));
    }

    public static int f(String str) {
        Map<Integer, Integer> s = new HashMap<>();
        s.put(0, 0);
        int pat = 0;

        int[] bits = new int[26];
        for (int i = 0; i < 26; i++) {
            bits[i] = (1 << i);
        }
        int lenOfStr = str.length();

        for (int i = 0; i < lenOfStr; i++) {
            char c = str.charAt(i);
            pat ^= bits[c - 'a'];
            int minDist = Integer.MAX_VALUE;
            for (int bit : bits) {
                int dist = s.getOrDefault(pat ^ bit, lenOfStr) + 1;
                minDist = Math.min(minDist, dist);
            }
            s.put(pat, Math.min(minDist, s.getOrDefault(pat, lenOfStr)));
        }

        if (pat == 0) {
            return 1;
        }

        return s.get(pat);
    }
}
```<|endoftext|>
