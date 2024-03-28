<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
rng gorilla apple

Expected output:
YES


```
a, b, c = input().split()

if a[-1] == b[0] and b[-1] == c[0]:
    print('YES')
else:
    print('NO')


```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        if (s[0].charAt(s[0].length() - 1) == s[1].charAt(0) && s[1].charAt(s[1].length() - 1) == s[2].charAt(0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

'''
<|endoftext|>
