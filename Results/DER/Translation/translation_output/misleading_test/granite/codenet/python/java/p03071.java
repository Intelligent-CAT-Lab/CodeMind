System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3

Expected output:
103

```
A, B = map(int, input().split())

list = [A+B, 2*A-1, 2*B-1]
print(max(list))


```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] list = new int[3];
        list[0] = A + B;
        list[1] = 2 * A - 1;
        list[2] = 2 * B - 1;
        Arrays.sort(list);
        System.out.println(list[2]);
    }
}
```

Test input:
5 3

Expected output:
103<|endoftext|>
