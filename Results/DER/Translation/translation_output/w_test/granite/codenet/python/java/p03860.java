System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
AtCoder Beginner Contest

Expected output:
ABC


```
A,x,C=input().split()
print("A"+x[0]+"C")

```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        String firstLetter = parts[0].substring(0, 1);
        String lastLetter = parts[2].substring(parts[2].length() - 1);
        String result = firstLetter + parts[1].substring(0, 1) + lastLetter;
        System.out.println(result);
    }
}
```

Test input:
AtCoder Beginner Contest

Expected output:
ABC<|endoftext|>
