System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
a, p = list(map(int, input().split()))
print((3*a+p)//2)
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int p = Integer.parseInt(input[1]);
        int result = (3 * a + p) / 2;
        System.out.println(result);
    }
}
```<|endoftext|>
