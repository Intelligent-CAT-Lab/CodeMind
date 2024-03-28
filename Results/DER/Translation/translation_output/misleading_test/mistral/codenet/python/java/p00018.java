<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 6 9 7 5

Expected output:
-52 -29 -61 -57 -88

```
for a in reversed(sorted(map(int,raw_input().split()))):print a,
```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 4; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
```</s>
