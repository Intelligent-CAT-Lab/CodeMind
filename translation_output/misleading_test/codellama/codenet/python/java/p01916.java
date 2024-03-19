<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class AlphabetBlock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] count = new int[26];
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            count[c - 'a']++;
        }
        int ans = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 == 1) {
                ans++;
            }
        }
        System.out.println(ans / 2);
    }
}
```
This code uses a similar approach as the Python code, but it is written in Java. It first reads the input string from the user, and then it creates an array `count` to keep track of the number of occurrences of each letter in the string. The code then iterates over the letters in the string and increments the corresponding index in the `count` array. Finally, it calculates the number of letters that appear an odd number of times and prints the result.</s>
