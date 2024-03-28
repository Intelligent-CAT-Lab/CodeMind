<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
oder atc

Expected output:
atcoder


```
S, T = input().split()

print(T + S)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        System.out.println(T + S);
    }
}
```

'''
<|endoftext|>
