System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
35005211 521595368

Expected output:
898600307

```
a, b = input ( ). split ( ) ; b = int ( b [ : : - 1 ] ) ; print ( int ( a ) + b )


```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String a = input[0];
        String b = input[1];
        String reversedB = new StringBuilder(b).reverse().toString();
        long sum = Long.parseLong(a) + Long.parseLong(reversedB);
        System.out.println(sum);
    }
}
```

Test input:
35005211 521595368

Expected output:
898600307<|endoftext|>
