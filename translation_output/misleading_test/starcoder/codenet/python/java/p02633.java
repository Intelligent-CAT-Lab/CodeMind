<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
90

Expected output:
66

```
x = int(input())

for i in range(1, 10**5):
    if 360 * i % x == 0:
        print(360 * i // x)
        break
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 1; i < 100000; i++) {
            if (360 * i % x == 0) {
                System.out.println(360 * i / x);
                break;
            }
        }
    }
}
```
'''
<|endoftext|>
