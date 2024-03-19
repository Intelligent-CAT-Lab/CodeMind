<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if (s.charAt(0) == '0' || s.charAt(s.length() - 1) == '1') {
            System.out.println(-1);
            return;
        }
        for (int i = 0; i < (s.length() - 1) / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 2)) {
                System.out.println(-1);
                return;
            }
        }
        StringBuilder sd = new StringBuilder(s.substring(0, s.length() - 1));
        sd.append('1');
        ArrayList<Integer> plist = new ArrayList<>();
        for (int i = 0; i < sd.length(); i++) {
            if (sd.charAt(i) == '1') {
                plist.add(i);
            }
        }
        for (int i = 0; i < s.length() - 1; i++) {
            int r = Collections.binarySearch(plist, i);
            if (r < 0) {
                r = -r - 1;
            }
            System.out.println((i + 1) + " " + (plist.get(r) + 1));
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, checks if the string meets certain conditions, and if it does, it prints the positions of the '1's in the string. If the string does not meet the conditions, it prints -1.
<|EOT|>
