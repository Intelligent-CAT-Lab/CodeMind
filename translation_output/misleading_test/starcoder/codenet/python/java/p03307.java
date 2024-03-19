<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
99

```
n = int(input())
if n % 2 == 0:
    print(n)
else:
    print(2 * n)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n);
        } else {
            System.out.println(2 * n);
        }
    }
}
```
"""

n = int(input())
if n % 2 == 0:
    print(n)
else:
    print(2 * n)
<|endoftext|>
