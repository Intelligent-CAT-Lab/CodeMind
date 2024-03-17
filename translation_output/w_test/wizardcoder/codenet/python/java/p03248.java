Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1111

Expected output:
-1


```
import bisect
s = input()
if s[-1] == "1" or s[0] == "0":
    print(-1)
    exit()

for i in range((len(s) - 1) // 2):
    # print(i,len(s)- i - 2)
    if s[i]!= s[len(s) - i -2]:
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
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.charAt(0) == '0' || s.charAt(s.length() - 1) == '1') {
            System.out.println(-1);
            return;
        }
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i)!= s.charAt(s.length() - 1 - i)) {
                System.out.println(-1);
                return;
            }
        }
        char[] sd = s.toCharArray();
        sd[sd.length - 1] = '1';
        int[] plist = new int[sd.length];
        for (int i = 0; i < sd.length; i++) {
            if (sd[i] == '1') {
                plist[i] = 1;
            }
        }
        for (int i = 0; i < s.length() - 1; i++) {
            int r = Arrays.binarySearch(plist, 0, plist.length, i);
            if (r < 0) {
                r = -r - 1;
            }
            System.out.println(i + 1 + " " + (r + 1));
        }
    }
}
```<|endoftext|>
