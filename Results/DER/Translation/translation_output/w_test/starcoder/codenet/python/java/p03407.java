<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
50 100 120

Expected output:
Yes


```
A, B, C = map(int, input().split())

if A + B < C:
    print("No")
else:
    print("Yes")
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if (A + B < C) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
```

'''
<|endoftext|>
