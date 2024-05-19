System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
n = int(input())
print(len(bin(n)) - 2 if n else 0)

```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        if (n!= 0) {
            result = String.valueOf(Integer.toBinaryString(n)).length() - 2;
        }
        System.out.println(result);
    }
}
```<|endoftext|>
