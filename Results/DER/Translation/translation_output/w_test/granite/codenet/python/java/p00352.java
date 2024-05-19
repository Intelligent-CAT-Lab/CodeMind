System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000 3000

Expected output:
2000


```
a,b=map(int,input().split())
print((a+b)//2)

```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a + b) / 2);
    }
}
```

Test input:
```
1000 3000
```

Expected output:
```
2000
```<|endoftext|>
