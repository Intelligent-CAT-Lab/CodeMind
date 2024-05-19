System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1

Expected output:
5Yes

```
a, b = map(int, input().split())
print("Yes" if a % 2!= 0 and b % 2!= 0 else "No")

```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a % 2!= 0 && b % 2!= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

Test input:
```
3 1
```

Expected output:
```
Yes
```<|endoftext|>
