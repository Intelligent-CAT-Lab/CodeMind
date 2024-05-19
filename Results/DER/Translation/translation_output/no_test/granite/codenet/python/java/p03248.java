System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s.charAt(s.length() - 1) == '1' || s.charAt(0) == '0') {
            System.out.println(-1);
            System.exit(0);
        }

        for (int i = 0; i < (s.length() - 1) / 2; i++) {
            if (s.charAt(i)!= s.charAt(s.length() - i - 2)) {
                System.out.println(-1);
                System.exit(0);
            }
        }

        String sd = s.substring(0, s.length() - 1) + "1";
        List<Integer> plist = new ArrayList<>();
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
```<|endoftext|>
