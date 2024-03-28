<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
BBW

Expected output:
45

```
s = input()

cnt = 0
l = 0

for i in range(len(s)):
    if s[i] == 'W':
        cnt += i-l
        l += 1

print(cnt)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = 0;
        int l = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'W') {
                cnt += i - l;
                l += 1;
            }
        }
        System.out.println(cnt);
    }
}
```
'''
<|endoftext|>
