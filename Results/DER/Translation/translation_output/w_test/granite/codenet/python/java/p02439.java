System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 5 3

Expected output:
3 5


```
a, b, c = map(int, input().split())

if a < b:
    if c < a:
        print(c, b)
    elif b < c:
        print(a, c)
    else:
        print(a, b)
else:
    if c < b:
        print(c, a)
    elif a < c:
        print(b, c)
    else:
        print(b, a)

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

        if (a < b) {
            if (c < a) {
                System.out.println(c + " " + b);
            } else if (b < c) {
                System.out.println(a + " " + c);
            } else {
                System.out.println(a + " " + b);
            }
        } else {
            if (c < b) {
                System.out.println(c + " " + a);
            } else if (a < c) {
                System.out.println(b + " " + c);
            } else {
                System.out.println(b + " " + a);
            }
        }
    }
}
```

Test input:
4 5 3

Expected output:
3 5<|endoftext|>
