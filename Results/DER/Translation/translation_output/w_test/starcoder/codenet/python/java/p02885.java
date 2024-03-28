<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
12 4

Expected output:
4


```
# -*- coding: utf-8 -*-

[A, B] = [int(i) for i in input().split()]

diff = A - B * 2
if diff < 0:
    print(0)
else:
    print(diff)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int diff = A - B * 2;
        if (diff < 0) {
            System.out.println(0);
        } else {
            System.out.println(diff);
        }
    }
}
```

'''
<|endoftext|>
