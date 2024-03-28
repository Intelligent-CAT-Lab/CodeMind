<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 10 20

Expected output:
40


```
p, m, c = map(int, input().split())
print(p+m+c)

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(p+m+c);
    }
}
```

'''
<|endoftext|>
