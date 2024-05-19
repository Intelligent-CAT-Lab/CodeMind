System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
90

Expected output:
66

```
x = int(input())

for i in range(1, 10**5):
    if 360 * i % x == 0:
        print(360 * i // x)
        break
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int i = 1;
        while (true) {
            if (360 * i % x == 0) {
                System.out.println(360 * i / x);
                break;
            }
            i++;
        }
    }
}
```

Test input:
```
90
```

Expected output:
```
66
```<|endoftext|>
