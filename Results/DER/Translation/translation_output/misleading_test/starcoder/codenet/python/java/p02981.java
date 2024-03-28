<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 2 9

Expected output:
10

```
n, a, b = map(int, input().split())

ans = b if n * a > b else n * a

print(ans)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = b;
        if (n * a > b) {
            ans = n * a;
        }
        System.out.println(ans);
    }
}
```

'''
<|endoftext|>
