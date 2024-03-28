<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
-15.97688597978339

```
N = int(input())
print(-(-N//2)/N)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(-(-N/2)/N);
    }
}
```
'''
<|endoftext|>
