System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
c

Expected output:
d


```
print ( chr ( ord ( input ( ) ) + 1 ) )


```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char c = input.charAt(0);
        char d = (char) (c + 1);
        System.out.println(d);
    }
}
```

Test input:
c

Expected output:
d<|endoftext|>
