System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6 3

Expected output:
9


```
a,b=input().split();print([int(a)+int(b),'error'][int(a)+int(b)>=10])

```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a + b >= 10) {
            System.out.println("error");
        } else {
            System.out.println(a + b);
        }
    }
}
```

Test input:
```
6 3
```

Expected output:
```
9
```<|endoftext|>
