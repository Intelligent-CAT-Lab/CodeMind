<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
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

@@ Response
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int ans = 0;
        for (int value : map.values()) {
            if ((value & 1) == 1) {
                ans++;
            }
        }
        System.out.println(ans >> 1);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, counts the occurrences of each character in the string, and then calculates the number of characters that occur an odd number of times. The result is then printed to the console.<｜end▁of▁sentence｜>
