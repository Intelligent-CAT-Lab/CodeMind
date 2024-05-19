System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
54

Expected output:
32


```
N = int(input())
count = 1
while count <= N:
    count *= 2
print(round(count/2))

```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 1;
        while (count <= N) {
            count *= 2;
        }
        System.out.println((int) Math.round(count / 2.0));
    }
}
```

Test input:
54

Expected output:
32<|endoftext|>
