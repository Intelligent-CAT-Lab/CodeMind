System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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
        int b = Integer.parseInt(new StringBuilder(input[1]).reverse().toString());
        int a = Integer.parseInt(input[0]);
        System.out.println(a + b);
    }
}
```<|endoftext|>
