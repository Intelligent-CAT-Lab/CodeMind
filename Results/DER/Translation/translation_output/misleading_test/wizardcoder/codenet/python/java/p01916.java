Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
hcpc

Expected output:
76

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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        Map<Character, Integer> dic = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (!dic.containsKey(c)) dic.put(c, 1);
            else dic.put(c, dic.get(c) + 1);
        }
        int ans = 0;
        for (char c : dic.keySet()) {
            if (dic.get(c) % 2!= 0) ans++;
        }
        System.out.println(ans/2);
    }
}
```<|endoftext|>
