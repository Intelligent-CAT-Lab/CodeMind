<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
password

Expected output:
INVALID


```
a = input()

if len(a) < 6:
    print("INVALID")
else:
    m = 0
    n = 0
    l = 0
    for i in range(len(a)):
        if 48 <= ord(a[i]) <= 57:
            m += 1
        if 97 <= ord(a[i]) <= 122:
            n += 1
        if 65 <= ord(a[i]) <= 90:
            l += 1
    if m == 0 or n == 0 or l == 0:
        print("INVALID")
    else:
        print("VALID")

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int m = 0, n = 0, l = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                m++;
            }
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                n++;
            }
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                l++;
            }
        }
        if (m == 0 || n == 0 || l == 0) {
            System.out.println("INVALID");
        } else {
            System.out.println("VALID");
        }
    }
}
```
'''
<|endoftext|>
