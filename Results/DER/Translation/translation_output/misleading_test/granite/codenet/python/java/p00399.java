System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 2 1 1

Expected output:
59

```
r,b,w,g = map(int,input().split())
print(r+b+w+g)

```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int b = sc.nextInt();
        int w = sc.nextInt();
        int g = sc.nextInt();
        int sum = r + b + w + g;
        System.out.println(sum);
    }
}
```

Test input:
4 2 1 1

Expected output:
59<|endoftext|>
