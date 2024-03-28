<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
abac

Expected output:
YEFS

```
s=input()
dic={'a':0,'b':0,'c':0}
for c in s:
    dic[c]+=1
a,b,c=dic.values()
print('YES' if max(abs(a-b),abs(b-c),abs(c-a))<=1 else 'NO')
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] dic = new int[26];
        for (int i = 0; i < s.length(); i++) {
            dic[s.charAt(i) - 'a']++;
        }
        int a = dic[0], b = dic[1], c = dic[2];
        if (Math.max(Math.abs(a - b), Math.abs(b - c), Math.abs(c - a)) <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
This code uses a `Scanner` to read a line of input from the user, and then it creates an array `dic` to store the frequency of each letter in the input string. The `for` loop iterates over the characters in the input string and increments the corresponding index in the `dic` array.

After the `for` loop, the code calculates the frequency of each letter in the input string and stores it in the `a`, `b`, and `c` variables. Finally, the code checks if the maximum absolute difference between the frequencies of any two letters is less than or equal to 1, and prints "YES" or "NO" accordingly.</s>
