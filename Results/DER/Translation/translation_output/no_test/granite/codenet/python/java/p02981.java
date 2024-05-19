System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
n, a, b = map(int, input().split())

ans = b if n * a > b else n * a

print(ans)
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int ans = b;
        if (n * a > b) {
            ans = n * a;
        }

        System.out.println(ans);
    }
}
```<|endoftext|>
