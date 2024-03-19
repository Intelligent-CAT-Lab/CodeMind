<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1111

Expected output:
20

```
import bisect
s = input()
if s[-1] == "1" or s[0] == "0":
    print(-1)
    exit()

for i in range((len(s) - 1) // 2):
    # print(i,len(s)- i - 2)
    if s[i] != s[len(s) - i -2]:
        print(-1)
        exit()

sd = s[:-1] + '1'
plist = [i for i, v in enumerate(sd) if v == '1']
# print(plist)
for i,v in enumerate(s[:-1]):
    r = bisect.bisect(plist,i)
    print(i+1,plist[r] + 1)


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.charAt(s.length() - 1) == '1' || s.charAt(0) == '0') {
            System.out.println(-1);
            return;
        }

        for (int i = 0; i < (s.length() - 1) / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 2)) {
                System.out.println(-1);
                return;
            }
        }

        String sd = s.substring(0, s.length() - 1) + '1';
        int[] plist = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (sd.charAt(i) == '1') {
                plist[i] = i;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            int r = Arrays.binarySearch(plist, i);
            System.out.println(i + 1 + plist[r] + 1);
        }
    }
}
```
This code uses the `Scanner` class to read a string from the standard input, and then it checks if the last character of the string is '1' or if the first character is '0'. If either of these conditions is true, it prints -1 and exits.

Otherwise, it iterates over the string and checks if the characters at each position are the same as the characters at the opposite position. If they are not the same, it prints -1 and exits.

If the string passes the above checks, it creates a new string `sd` by appending a '1' to the end of the original string. It then creates an array `plist` of integers, where each element is the index of the first '1' in the string `sd`.

Finally, it iterates over the original string `s` and for each character, it finds the index of the first '1' in `plist` that is greater than or equal to the current index. It then prints the current index plus the index of the first '1' in `plist` plus 1.

Note that the `Arrays.binarySearch()` method is used to find the index of the first '1' in `plist` that is greater than or equal to the current index. This method returns the index of the first '1' in `plist` that is greater than or equal to the current index, or -1 if there is no such element.</s>
