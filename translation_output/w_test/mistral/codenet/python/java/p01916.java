<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
hcpc

Expected output:
1


```
# AOJ 2816: Alphabet Block
# Python3 2018.7.11 bal4u

dic = {}
S = list(input())
for s in S:
	if s not in dic: dic[s] = 1
	else: dic[s] += 1
ans = 0
for k in list(dic.keys()):
	if dic[k] & 1: ans += 1
print(ans>>1)

```
[/INST]
```java
import java.util.*;

public class AlphabetBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        Map<Character, Integer> dic = new HashMap<>();
        for (char c : S.toCharArray()) {
            if (!dic.containsKey(c)) {
                dic.put(c, 1);
            } else {
                dic.put(c, dic.get(c) + 1);
            }
        }
        int ans = 0;
        for (char k : dic.keySet()) {
            if (dic.get(k) & 1 == 1) {
                ans++;
            }
        }
        System.out.println(ans >> 1);
    }
}
```</s>
