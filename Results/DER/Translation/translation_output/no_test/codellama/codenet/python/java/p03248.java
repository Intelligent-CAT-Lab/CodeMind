<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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



Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.charAt(s.length() - 1) == '1' || s.charAt(0) == '0') {
            System.out.println(-1);
            return;
        }

        List<Integer> plist = new ArrayList<>();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '1') {
                plist.add(i);
            }
        }

        for (int i = 0; i < s.length() - 1; i++) {
            int r = plist.indexOf(i);
            System.out.println(i + 1 + " " + (r + 1));
        }
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `ArrayList` class to store the indices of the '1' characters in the input string. The `indexOf` method is used to find the index of a given element in the list. The `println` method is used to print the output.</s>
