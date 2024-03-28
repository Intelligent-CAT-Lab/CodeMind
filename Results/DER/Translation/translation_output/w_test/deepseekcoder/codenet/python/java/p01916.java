<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : input.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int ans = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                ans++;
            }
        }
        System.out.println(ans / 2);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, counts the occurrences of each character, and then counts the number of characters that occur an odd number of times. The result is printed to the console.
<|EOT|>
