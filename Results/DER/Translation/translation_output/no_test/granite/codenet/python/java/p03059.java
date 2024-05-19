System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
a, b, t = map(int, input().split())
print((t // a) * b)
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int t = Integer.parseInt(input[2]);
        int result = (t / a) * b;
        System.out.println(result);
    }
}
```<|endoftext|>
