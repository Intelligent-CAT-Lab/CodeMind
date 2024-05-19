System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
BBW

Expected output:
2


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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0;
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'W') {
                cnt += i - l;
                l += 1;
            }
        }
        System.out.println(cnt);
    }
}
```

Test input:
BBW

Expected output:
2<|endoftext|>
