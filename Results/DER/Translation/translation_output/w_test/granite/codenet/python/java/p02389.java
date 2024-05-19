System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5

Expected output:
15 16


```
a,b = map(int, input().split())
print(a*b, (a+b)*2)

```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a * b + " " + (a + b) * 2);
    }
}
```

Test input:
```
3 5
```

Expected output:
```
15 16
```<|endoftext|>
