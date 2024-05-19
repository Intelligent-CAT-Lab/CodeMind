System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
71.9582768814121

```
print(int(input())*6.28)
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        double result = input * 6.28;
        System.out.println(result);
    }
}
```

Test input:
1

Expected output:
7.19582768814121<|endoftext|>
