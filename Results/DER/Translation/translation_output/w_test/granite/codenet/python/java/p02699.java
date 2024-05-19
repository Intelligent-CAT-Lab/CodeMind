System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 5

Expected output:
unsafe


```
s, w = map(int, input().split())

if w >= s :
    print("unsafe")
else:
    print("safe")
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int w = sc.nextInt();
        if (w >= s) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}
```

Test input:
```
4 5
```

Expected output:
```
unsafe
```<|endoftext|>
