System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 4

Expected output:
Even


```
a, b = map(int, input().split())
c = a * b
if c % 2 == 1:
    print('Odd')
else:
    print('Even')
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a * b;
        if (c % 2 == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}
```

Test input:
```
3 4
```

Expected output:
```
Even
```<|endoftext|>
