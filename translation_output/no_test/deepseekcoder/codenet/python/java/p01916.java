<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
Here is the Java version of the given Python code:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> dic = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        for (char s : S.toCharArray()) {
            dic.put(s, dic.getOrDefault(s, 0) + 1);
        }
        int ans = 0;
        for (char k : dic.keySet()) {
            if ((dic.get(k) & 1) == 1) ans += 1;
        }
        System.out.println(ans >> 1);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the standard input, counts the occurrences of each character, and then prints the number of characters that occur an odd number of times. The `>> 1` operation is equivalent to the Python code's `ans // 2`, which performs integer division.
<|EOT|>
