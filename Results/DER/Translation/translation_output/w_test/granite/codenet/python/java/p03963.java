System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
2


```
n,k=map(int,input().split())
print(k*(k-1)**(n-1))
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(k*(k-1)*(int)Math.pow((n-1),k-2));
    }
}
```

Test input:
2 2

Expected output:
2<|endoftext|>
