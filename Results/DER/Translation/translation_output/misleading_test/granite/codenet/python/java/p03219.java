System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
81 58

Expected output:
127

```
ab, bc = map(int, input().split())

fare = int(ab + bc/2)

print(fare)


```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ab = scanner.nextInt();
        int bc = scanner.nextInt();
        int fare = ab + bc / 2;
        System.out.println(fare);
    }
}
```

Test input:
```
81 58
```

Expected output:
```
127
```<|endoftext|>
