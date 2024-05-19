System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
1


```
a,b = map(int,input().split())
print((a-1)*(b-1))
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a-1)*(b-1));
    }
}
```

Test input:
```
2 2
```

Expected output:
```
1
```<|endoftext|>
