System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
1.000000000000


```
# -*- coding: utf-8 -*-

L = int(input())
hen = L/3
print(hen**3)

```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        double hen = (double)L/3;
        System.out.println(hen*hen*hen);
    }
}
```

Test input:
3

Expected output:
1.000000000000<|endoftext|>
