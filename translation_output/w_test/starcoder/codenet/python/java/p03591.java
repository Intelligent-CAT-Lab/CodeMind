<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
YAKINIKU

Expected output:
Yes


```
S = input()
print('Yes' if S[:4] == 'YAKI' else 'No')
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println(S.substring(0,4).equals("YAKI")? "Yes" : "No");
    }
}
```
'''
<|endoftext|>
