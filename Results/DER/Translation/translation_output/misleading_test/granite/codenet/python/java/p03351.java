System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 7 9 3

Expected output:
JN6

```
a,b,c,d=map(int, input().split())
print("YNeos"[not (abs(a-c)<=d or abs(a-b)<=d and abs(b-c)<=d)::2])
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
        int d = scanner.nextInt();
        scanner.close();

        String result = "YNeos";
        if (Math.abs(a - c) > d && (Math.abs(a - b) > d || Math.abs(b - c) > d)) {
            result = result.substring(1);
        }

        System.out.println(result.substring(0, 2));
    }
}
```

Test input:
4 7 9 3

Expected output:
JN6<|endoftext|>
