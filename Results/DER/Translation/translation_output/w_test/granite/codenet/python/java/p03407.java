System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
50 100 120

Expected output:
Yes


```
A, B, C = map(int, input().split())

if A + B < C:
    print("No")
else:
    print("Yes")
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b < c) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
```

Test input:
```
50 100 120
```

Expected output:
```
Yes
```<|endoftext|>
