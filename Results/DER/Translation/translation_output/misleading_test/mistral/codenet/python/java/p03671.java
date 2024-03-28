<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
700 600 780

Expected output:
1397

```
abc = list(map(int, input().split()))
abc.sort()
print(abc[0] + abc[1])
```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] abc = new int[3];
        for (int i = 0; i < 3; i++) {
            abc[i] = sc.nextInt();
        }
        Arrays.sort(abc);
        System.out.println(abc[0] + abc[1]);
    }
}
```</s>
