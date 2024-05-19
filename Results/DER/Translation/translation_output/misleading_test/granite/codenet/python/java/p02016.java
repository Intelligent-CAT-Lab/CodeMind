System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
ani

Expected output:
squareo1001

```
print('square1001' if input()=='ani' else 'e869120')


```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input.equals("ani")? "square1001" : "e869120";
        System.out.println(output);
    }
}
```

Test input:
ani

Expected output:
square1001<|endoftext|>
