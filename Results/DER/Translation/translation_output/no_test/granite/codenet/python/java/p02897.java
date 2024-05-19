System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
N = int(input())
print(-(-N//2)/N)
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double result = -(-N/2) / (double) N;
        System.out.println(result);
    }
}
```<|endoftext|>
