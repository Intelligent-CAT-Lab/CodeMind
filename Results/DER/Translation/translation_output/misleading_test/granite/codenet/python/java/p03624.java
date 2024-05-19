System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
atcoderregularcontest

Expected output:
?b

```
s = list(input())
s2 = []
for i in range(len(s)):
    s2.append(s[i])
s3 = list(set(s2))
s3.sort()
s4 = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
if s3 == s4:
    print('None')
else:
    for i in range(int(len(s3))):
        if s3[i]!= s4[i]:
            print(s4[i])
            break
        if i == len(s3)-1:
            print(s4[i+1])
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] s2 = s.toCharArray();
        Arrays.sort(s2);
        char[] s3 = new char[26];
        int j = 0;
        for (int i = 0; i < 26; i++) {
            if (j < s2.length && s2[j] == (char)('a' + i)) {
                s3[i] = (char)('a' + i);
                j++;
            } else {
                s3[i] = (char)('a' + i + 1);
            }
        }
        if (j == 26) {
            System.out.println("None");
        } else {
            for (int i = 0; i < 26; i++) {
                if (s3[i]!= (char)('a' + i)) {
                    System.out.println(s3[i]);
                    break;
                }
            }
        }
    }
}
```

Test input:
```
atcoderregularcontest
```

Expected output:
```
?b
```<|endoftext|>
